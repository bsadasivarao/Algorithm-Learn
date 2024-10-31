package algolearn.linkedlist;

public class RemoveDuplicatesInSinglyLinkedList {

	public static void main(String[] args) {
		RemoveDuplicatesInSinglyLinkedList removeDuplicatesInSinglyLinkedList=new RemoveDuplicatesInSinglyLinkedList();
		SinglyLinkedList pareLinkedList=removeDuplicatesInSinglyLinkedList.removeSinglyLinkedListNode(SinglyLinkedListData.getSortedSinglyLinkedListWithDuplicates());
		PrintingSinglyLinkedList printingSinglyLinkedList=new PrintingSinglyLinkedList();
		printingSinglyLinkedList.prinitingSinglyLinkedList(pareLinkedList);

	}
	
	public SinglyLinkedList removeSinglyLinkedListNode(SinglyLinkedList singlyLinkedList) {
		
		SinglyLinkedList prevLinkedList=singlyLinkedList;
		SinglyLinkedList pareLinkedList=prevLinkedList;
		while (singlyLinkedList !=null) {
			if(prevLinkedList !=null&& singlyLinkedList.value==prevLinkedList.value) {
				singlyLinkedList=singlyLinkedList.next;
			}else {
				prevLinkedList.next=singlyLinkedList;
				prevLinkedList=prevLinkedList.next;
			}
			
		}
		return pareLinkedList;
	}
	
}
