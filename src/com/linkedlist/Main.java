package com.linkedlist;
import java.util.*;

     /*
      k opp0

      Given head which is a reference node to a singly-linked list.
      The value of each node in the linked list is either 0 or 1.
      The linked list holds the binary representation of a number.

      Return the decimal value of the number in the linked list.

      Example 1:
      Input: head = [1,0,1]
      Output: 5
      Explanation: (101) in base 2 = (5) in base 10

      Example 2:
      Input: head = [0]
      Output: 0

      Constraints:
      The Linked List is not empty.
      Number of nodes will not exceed 30.
      Each node's value is either 0 or 1.
      */


public class Main {
    private Node head;
    private Node tail;
    private int size;
    public Main() {
        this.size = 0;
    }
    public static int result(Node head){
        int count=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        temp = head;
        int sum = 0;
        for(int i=count-1;i>=0;i++){
            sum = sum + (int)Math.pow(2,i)*temp.val;
            temp = temp.next;
        }
        return sum;
    }
    public class Linked {
        public static void main(String[] args) {
            Main obj = new Main();
        }
    }
        static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        
    }
}
