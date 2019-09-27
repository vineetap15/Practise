package app;

import java.util.Scanner;

class Node{
     int data;
     Node next;

    Node(int d){
        data =d;
        next =null;
    }
    public int getData(){
        return data;
    }
    
    public Node getNextNode(){
        return next;
    }
}

public class LinkedListReverse {
    Node head;
    int size;

    public void getList(LinkedListReverse l){
        Node current = l.head;
        System.out.println("Size-- " +l.size);
        if(isEmpty()== true){
            System.out.println("List is empty");
        }
        else{
            System.out.println("linked list data : ");
            while(current != null){
                System.out.print(" " +current.data + " ");
                current = current.next;
            }

        } 
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void insertNode(LinkedListReverse l, int n){
        Node newNode = new Node(n);
        if(isEmpty()== true){
            System.out.println("inserting-- " +n);
            l.head = newNode;
            size++;
        }
        else{
            Node current = l.head;
            while(current.next!=null){
                
                current = current.next;
                
            }
            System.out.println("inserting-- " +n);
            current.next = newNode;
            size++;
        }
    }

    public void deleteNode(int n){
        
    }


    public  void reverse(LinkedListReverse l) {
        Node prev =null;
        Node current = l.head;
        Node next = null;
        while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		l.head = prev;
        
    }

    public static void main(String[] args) {
        LinkedListReverse l = new LinkedListReverse();
        l.insertNode(l,3);
        l.insertNode(l,4);
        l.insertNode(l,1);
        l.getList(l);
        l.reverse(l);
        l.getList(l);
}
}