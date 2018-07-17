package com.ds.ll;

public class LinkedListNode {
    public int val;
    public LinkedListNode next;

    public LinkedListNode(int node_value) {
        val = node_value;
        next = null;
    }
    
    public LinkedListNode(int node_value, LinkedListNode next) {
        this.val = node_value;
        this.next = next;
	}
    
    @Override
    public String toString() {
    	if(next != null) return this.val + "->" + next.toString();
    	else return this.val + "";

    }

}
