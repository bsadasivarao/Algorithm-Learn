/**
 * 
 */
package dineshvariyani.linkedlist;

/**
 * 
 */
public class SinglyLinkedListData {
	
	public static SinglyLinkedList getSinglyLinkedList() {
		SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
		singlyLinkedList.setValue(11);
		
		SinglyLinkedList s1=new SinglyLinkedList();
		s1.setValue(9);
		singlyLinkedList.setNext(s1);
		
		SinglyLinkedList s2=new SinglyLinkedList();
		s2.setValue(1);
		s1.setNext(s2);

		SinglyLinkedList s3=new SinglyLinkedList();
		s3.setValue(10);
		s2.setNext(s3);
		
		SinglyLinkedList s4=new SinglyLinkedList();
		s4.setValue(8);
		s3.setNext(s4);
		
		SinglyLinkedList s5=new SinglyLinkedList();
		s5.setValue(7);
		s4.setNext(s5);

		SinglyLinkedList s6=new SinglyLinkedList();
		s6.setValue(6);
		s5.setNext(s6);

		return singlyLinkedList;
		
	}
	
	public static SinglyLinkedList getSortedSinglyLinkedListWithDuplicates() {
		SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
		singlyLinkedList.setValue(1);
		
		SinglyLinkedList s1=new SinglyLinkedList();
		s1.setValue(1);
		singlyLinkedList.setNext(s1);
		
		SinglyLinkedList s2=new SinglyLinkedList();
		s2.setValue(2);
		s1.setNext(s2);

		SinglyLinkedList s3=new SinglyLinkedList();
		s3.setValue(2);
		s2.setNext(s3);
		
		SinglyLinkedList s4=new SinglyLinkedList();
		s4.setValue(2);
		s3.setNext(s4);
		
		SinglyLinkedList s5=new SinglyLinkedList();
		s5.setValue(3);
		s4.setNext(s5);

		SinglyLinkedList s6=new SinglyLinkedList();
		s6.setValue(4);
		s5.setNext(s6);

		return singlyLinkedList;
		
	}


}
