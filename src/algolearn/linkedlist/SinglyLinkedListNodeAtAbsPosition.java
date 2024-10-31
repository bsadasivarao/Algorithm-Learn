package algolearn.linkedlist;
public class SinglyLinkedListNodeAtAbsPosition {

	public static void main(String[] args) {
		SinglyLinkedListNodeAtAbsPosition singlyLinkedListNodeAtAbsPosition=new SinglyLinkedListNodeAtAbsPosition();
		SinglyLinkedList srr=singlyLinkedListNodeAtAbsPosition.findNthPositionofElement(SinglyLinkedListData.getSinglyLinkedList(), 3);
		System.out.println(srr.value);
		
	}
	public SinglyLinkedList findNthPositionofElement(SinglyLinkedList singlyLinkedList,int pos) {
		int currentPos=-1;
		SinglyLinkedList curr = null;
		while (currentPos!=pos-1) {
			curr=singlyLinkedList;
			singlyLinkedList=singlyLinkedList.next;
			currentPos++;
			
		}
		return curr;
		
	}

}
