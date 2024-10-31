package algolearn.linkedlist;
public class SinglyLinkedListSize {

	public static void main(String[] args) {
		SinglyLinkedListSize singlyLinkedListSize = new SinglyLinkedListSize();
		int size=singlyLinkedListSize.prinitingSinglyLinkedSizet(SinglyLinkedListData.getSinglyLinkedList());
		System.out.println("Size ...:"+size);
	}

	public int prinitingSinglyLinkedSizet(SinglyLinkedList singlyLinkedList) {
		int size = 0;
		while (singlyLinkedList != null) {
			size++;
			System.out.println("Printing Singly Linked List ..value" + singlyLinkedList.getValue());
			singlyLinkedList = singlyLinkedList.next;
		}
		return size;
	}
}
