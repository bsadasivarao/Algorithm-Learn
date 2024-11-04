package algolearn.linkedlist;

public class RemoveSpecificNodeInSinglyLinkedList {

	public static void main(String[] args) {
		RemoveSpecificNodeInSinglyLinkedList removeSpecificNodeInSinglyLinkedList=new RemoveSpecificNodeInSinglyLinkedList();
		SinglyLinkedList singlyLinkedList=removeSpecificNodeInSinglyLinkedList.removeGivenElementFromList(SinglyLinkedListData.getSinglyLinkedList(), 10);
		PrintingSinglyLinkedList printingSinglyLinkedList=new PrintingSinglyLinkedList();
		printingSinglyLinkedList.prinitingSinglyLinkedList(singlyLinkedList);

	}

	public SinglyLinkedList removeGivenElementFromList(SinglyLinkedList singlyLinkedList, int value) {
		SinglyLinkedList head = singlyLinkedList;
		SinglyLinkedList temp = null;
		while (singlyLinkedList != null && singlyLinkedList.value != value) {
			temp = singlyLinkedList;
			singlyLinkedList = singlyLinkedList.next;
		}
		if (temp != null) {
			temp.next = singlyLinkedList.next;
		}
		return head;
	}

}
