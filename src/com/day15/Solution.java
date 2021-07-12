package com.day15;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;  //reference to another node.... in this case the next node
	Node(int d) {
        data = d;
        next = null;  
    }
}

class Solution {

    public static  Node insert(Node head,int data) {
    	
    	Node toAdd = new Node(data);
    	
    	if(head == null) {
    		head = toAdd;
    	}
    	
    	else {
    		Node temp = head;
    		while(temp.next != null) {
    			temp = temp.next;
    		}
    		
    		temp.next = toAdd ;
    	}
    	
		return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {       // N-- and the > 
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
