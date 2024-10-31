package dineshvariyani.linkedlist;

public class MiddleofSinglyLinkedList {

	public static void main(String[] args) {
		MiddleofSinglyLinkedList middleofSinglyLinkedList=new MiddleofSinglyLinkedList();
		SinglyLinkedList middle=middleofSinglyLinkedList.findMiddleOfsInglyLinkedList(SinglyLinkedListData.getSinglyLinkedList());
		System.out.println("Middle Value of Node...:"+middle.value);

	}
	public SinglyLinkedList findMiddleOfsInglyLinkedList(SinglyLinkedList singlyLinkedList) {
		
		SinglyLinkedList slowPointerLinkedList=singlyLinkedList;
		SinglyLinkedList fastPointer=singlyLinkedList;
		while (fastPointer!=null&&fastPointer.next !=null) {
			slowPointerLinkedList=slowPointerLinkedList.next;
			fastPointer=fastPointer.next.next;
		}
		return slowPointerLinkedList;
		
	}

}
