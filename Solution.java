package com.ds;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static class LinkedListNode {
        int val;
        LinkedListNode next;

        LinkedListNode(int node_value) {
            val = node_value;
            next = null;
        }
    };

    public static LinkedListNode _insert_node_into_singlylinkedlist(LinkedListNode head, LinkedListNode tail, int val) {
        if(head == null) {
            head = new LinkedListNode(val);
            tail = head;
        }
        else {
            tail.next = new LinkedListNode(val);
            tail = tail.next;
        }
        return tail;
    }
    
    /*
     * Complete the function below.
     */
    /*
    For your reference:
    LinkedListNode {
        int val;
        LinkedListNode next;
    };
    */
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

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        LinkedListNode res;
        int head_size = 0;

        LinkedListNode head = null;
        LinkedListNode head_tail = null;

        head_size = Integer.parseInt(in.nextLine());

        for(int i = 0; i < head_size; i++) {
            int head_item;
            head_item = Integer.parseInt(in.nextLine().trim());
            head_tail = _insert_node_into_singlylinkedlist(head, head_tail, head_item);

            if(i == 0) {
                head = head_tail;
            }
        }


        res = find_middle_node(head);
        while (res != null) {
            bw.write(String.valueOf(res.val));
            bw.newLine();
        res = res.next;
        }

        bw.close();
    }
}
