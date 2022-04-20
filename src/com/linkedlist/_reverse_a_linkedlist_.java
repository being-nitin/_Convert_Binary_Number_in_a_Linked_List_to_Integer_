package com.linkedlist;
import java.util.*;

public class _reverse_a_linkedlist_ {
    private Node head;
    private Node tail;
    private int size;
    public _reverse_a_linkedlist_() {
        this.size = 0;
    }
    public Node reverse(Node head){
        if(head==null){
            return null;
        }
        Node previous = null;
        Node present = head;
        Node next = present.next;

        while (present!=null) {
            present.next = previous;
            previous = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        head = previous;
        return previous;
    }









    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
}
