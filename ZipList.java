package com.ds.ll;

public class ZipList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListNode n10 = new LinkedListNode(11);
		LinkedListNode n9 = new LinkedListNode(10,n10);
		LinkedListNode n8 = new LinkedListNode(9,n9);		
		LinkedListNode n7 = new LinkedListNode(8,n8);
		LinkedListNode n6 = new LinkedListNode(7, n7);
		LinkedListNode n5 = new LinkedListNode(6, n6);
		LinkedListNode n4 = new LinkedListNode(5, n5);
		LinkedListNode n3 = new LinkedListNode(4, n4);
		LinkedListNode n2 = new LinkedListNode(3);
		LinkedListNode n1 = new LinkedListNode(2, n2);
		LinkedListNode head = new LinkedListNode(1, n1);
		
		System.out.println(head);
		head = zip_given_linked_list(head);
		System.out.println(head);
	}

	private static LinkedListNode zipList(LinkedListNode head) {
		
		LinkedListNode current = head;
		LinkedListNode main = head;
		LinkedListNode fwd = head;
		LinkedListNode temp = null;
		LinkedListNode prev = null;
		
		while(current != null && current.next != null && current.next.next != null){
			
			while(fwd.next !=null){
				prev = fwd;
				fwd = fwd.next;
			}
			prev.next = null;
			temp = current.next;
			current.next = fwd;
			fwd.next = temp;
			current = temp;
			fwd = temp;
			
		}
		
		return main;
	}

    static LinkedListNode find_middle_node(LinkedListNode head) {
    	LinkedListNode fast = head;
        LinkedListNode slow = head; 
        
        if(fast == null) return null;
        if(fast.next == null) return fast;
        if(fast.next.next == null) return fast.next;
        
        int count = 1;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            count +=2;
        }
        
        
        if(count%2 == 0) return slow.next;
        else return slow;
    }

    
	private static LinkedListNode reverseList(LinkedListNode head) {
		LinkedListNode current = head;
		LinkedListNode previous = null, next = null;
		while (current != null) {
			while (current != null) {
				next = current.next;
				current.next = previous;
				previous = current;
				current = next;
			}
		}
		return previous;
	}
	
	
    static LinkedListNode zip_given_linked_list(LinkedListNode head)  {
    	LinkedListNode main = head;
    	LinkedListNode c1 = head;    	
    	LinkedListNode mid = find_middle_node(head);
    	LinkedListNode c2 = reverseList(mid);
    	LinkedListNode t1 = null;
    	LinkedListNode t2 = null;
    	
    	while(c1 != null && c1.next != mid && c2 != null){
    		t1 = c1.next;
    		t2 = c2.next;
    		c1.next = c2;
    		c1 = t1;
    		c2.next = c1;
    		c2 = t2;
    	}

    	return main;
    }

}
