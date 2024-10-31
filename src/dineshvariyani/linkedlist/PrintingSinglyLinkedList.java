/**
 * 
 */
package dineshvariyani.linkedlist;

/**
 * 
 */
public class PrintingSinglyLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintingSinglyLinkedList printingSinglyLinkedList=new PrintingSinglyLinkedList();
		printingSinglyLinkedList.prinitingSinglyLinkedList(SinglyLinkedListData.getSinglyLinkedList());
	}
	
	public void prinitingSinglyLinkedList(SinglyLinkedList singlyLinkedList) {
		
		while (singlyLinkedList !=null) {
			System.out.println("Printing Singly Linked List ..value"+singlyLinkedList.getValue());
			singlyLinkedList=singlyLinkedList.next;
		}
		
	}

}
