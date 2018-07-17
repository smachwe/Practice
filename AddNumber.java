package com.ds.ll;

public class AddNumber {

	public static void main(String[] args) {
		LinkedListNode fn2 = new LinkedListNode(9);
		LinkedListNode fn1 = new LinkedListNode(9, fn2);
		LinkedListNode firstHead = new LinkedListNode(9, fn1);

		LinkedListNode sn2 = new LinkedListNode(9);
		LinkedListNode sn1 = new LinkedListNode(9);
		LinkedListNode secondHead = new LinkedListNode(9);
		System.out.println(firstHead);
		System.out.println(secondHead);
		LinkedListNode sum = addNum(firstHead, secondHead);
		
		System.out.println("old sum = " + addNumbers(firstHead, secondHead));
		System.out.println("new sum = " + sum);


	}
	
	static LinkedListNode addNum(LinkedListNode l1, LinkedListNode l2){
		LinkedListNode dummyHead = new LinkedListNode(0);
		LinkedListNode p = l1, q = l2, curr = dummyHead;
		int sum = 0, carry = 0;
		int v1 = 0, v2 = 0;
		
		while(p != null || q != null) {
			v1 = (p != null)? p.val : 0;
			v2 = (q != null)? q.val : 0;
			
			sum = (v1 + v2 + carry);
			carry = sum % 10;
			curr.next  = new LinkedListNode(sum / 10);
			curr = curr.next;
			
			if(p != null) p = p.next;
			if(q != null) q = q.next;
			
		}
		
		if(carry > 0){
			curr.next = new LinkedListNode(carry);
		}
		return dummyHead.next;
	}

	static LinkedListNode addNumbers(LinkedListNode l1, LinkedListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		
		int carry = 0;
		LinkedListNode l1_main = l1;
		LinkedListNode l2_main = l2;
		LinkedListNode l1_prev = null;
		LinkedListNode l2_prev = null;
		int v1 = 0;
		int v2 = 0;
		while(l1 != null || l2 != null){
			
			if(l1 == null) {v1 = 0; l1_main = null;} else v1 = l1.val;
			if(l2 == null) {v2 = 0; l2_main = null;} else v2 = l2.val;
			
			if(l1 != null) l1.val = (v1 + v2 + carry)%10;
			if(l2 != null) l2.val = (v1 + v2 + carry)%10;
			
			carry = (v1 + v2 + carry)/10;
			
			l1_prev = l1;
			l2_prev = l2;
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
		}
		
		
		if(l1_main == null) {
			if(carry != 0)
				l2_prev.next = new LinkedListNode(carry);
			return l2_main;
		}else {
			if(carry !=0)
				l1_prev.next = new LinkedListNode(carry);
			return l1_main;
		}			
	}

}
