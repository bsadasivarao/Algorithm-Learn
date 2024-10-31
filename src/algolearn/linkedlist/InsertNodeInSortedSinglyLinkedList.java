/**
 * 
 */
package algolearn.linkedlist;

/**
 * 
 */
public class InsertNodeInSortedSinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertNodeInSortedSinglyLinkedList insertNodeInSortedSinglyLinkedList=new InsertNodeInSortedSinglyLinkedList();
		SinglyLinkedList s1=insertNodeInSortedSinglyLinkedList.insertNodeInSinglyLinkedList(SinglyLinkedListData.getSortedSinglyLinkedList(), 14);
		SinglyLinkedList s2=insertNodeInSortedSinglyLinkedList.insertNodeInSinglyLinkedList(SinglyLinkedListData.getSortedSinglyLinkedList(), 5);
		SinglyLinkedList s3=insertNodeInSortedSinglyLinkedList.insertNodeInSinglyLinkedList(SinglyLinkedListData.getSortedSinglyLinkedList(), 10);


		PrintingSinglyLinkedList printingSinglyLinkedList=new PrintingSinglyLinkedList();
		printingSinglyLinkedList.prinitingSinglyLinkedList(s1);
		System.out.print("New List....");
		printingSinglyLinkedList.prinitingSinglyLinkedList(s2);
		System.out.print("New List....");

		printingSinglyLinkedList.prinitingSinglyLinkedList(s3);
		System.out.print("New List....");

	}
	
	public SinglyLinkedList insertNodeInSinglyLinkedList(SinglyLinkedList singlyLinkedList,int value) {
		SinglyLinkedList parent=singlyLinkedList;
		SinglyLinkedList previous=singlyLinkedList;
		while (singlyLinkedList !=null && singlyLinkedList.value<value) {
			previous=singlyLinkedList;
			singlyLinkedList=singlyLinkedList.next;
			
		}
		SinglyLinkedList newSinglyLinkedList=new SinglyLinkedList();
		newSinglyLinkedList.value=value;
		newSinglyLinkedList.next=singlyLinkedList;
		previous.next=newSinglyLinkedList;
		return parent;
	}

}
