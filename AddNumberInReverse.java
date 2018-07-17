package com.ds.ll;
import java.util.*;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Follow up: What if you cannot modify the input lists? In other words, reversing the lists is not allowed.

Example:

Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 8 -> 0 -> 7
 * @author sumitmachwe
 *
 */
public class AddNumberInReverse {
	
	public static void main(String[] args) {
		LinkedListNode l1 = new LinkedListNode(7);
		l1.next = new LinkedListNode(2);
		l1.next.next = new LinkedListNode(4);
		l1.next.next.next = new LinkedListNode(3);
		
		LinkedListNode l2 = new LinkedListNode(5);
		l2.next = new LinkedListNode(6);
		l2.next.next = new LinkedListNode(4);
		
		LinkedListNode l3 = addNumber(l1, l2);
		
		System.out.println(l3);
		
	}

	private static LinkedListNode addNumber(LinkedListNode l1, LinkedListNode l2) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> s3 = new Stack<>();
		LinkedListNode l3 = new LinkedListNode(0); 
		LinkedListNode curr = null;
		
		while(l1 != null) {s1.add(l1.val); l1 = l1.next; }
		while(l2 != null) {s2.add(l2.val); l2 = l2.next; }
		int v1 = 0, v2 = 0, carry = 0, sum = 0;
		
		while(!s1.isEmpty() || !s2.isEmpty()){
			v1 = s1.isEmpty()? 0 : s1.pop();
			v2 = s2.isEmpty()? 0 : s2.pop();
			
			sum = v1 + v2 + carry;
			s3.add(sum % 10);
			carry = sum / 10;
		}
		
		if(carry > 0) s3.add(carry);
		
		curr = l3;
		while(!s3.isEmpty()) {
			l3.next = new LinkedListNode(s3.pop());
			l3 = l3.next;
		}
		

		return curr.next;
	}

}
