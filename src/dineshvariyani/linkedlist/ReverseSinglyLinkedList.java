package dineshvariyani.linkedlist;

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {

		ReverseSinglyLinkedList reverseSinglyLinkedList=new ReverseSinglyLinkedList();
		SinglyLinkedList singly=reverseSinglyLinkedList.reverseSinglyLinkedList(SinglyLinkedListData.getSinglyLinkedList());
		PrintingSinglyLinkedList printingSinglyLinkedList=new PrintingSinglyLinkedList();
		printingSinglyLinkedList.prinitingSinglyLinkedList(singly);
	}

	public SinglyLinkedList reverseSinglyLinkedList(SinglyLinkedList singlyLinkedList) {

		SinglyLinkedList temp=null;
		SinglyLinkedList next=null;
		while (singlyLinkedList !=null) {
			temp=singlyLinkedList;
			singlyLinkedList=singlyLinkedList.next;
			temp.setNext(next);
			next=temp;
			
		}
		
		return next;
		
	}
}
