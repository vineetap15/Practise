package app;

import java.util.Stack;

class Node {
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

public class LinkedListEvenOdd {
    Node head =null;
    int size=0;

    public boolean isEmpty(){
        return head == null;
        }

    public void insertNode(LinkedListEvenOdd list,int data){
        Node n = new Node(data);
        if(isEmpty()==true){
            //System.out.println("inserting first data-- " +data);
            list.head = n;
            size++;
        }
        else{
            Node current = list.head;
            while(current.next!=null){
                
                current = current.next;
                
            }
            //System.out.println("inserting-- " +data);
            current.next = n;
            size++;
            
        }

    }

    public LinkedListEvenOdd getList(LinkedListEvenOdd list){
        Node current = list.head;

        if(list.head == null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("list is ");
            while(current!=null){
                System.out.print(" "+current.data + " ");
                current=current.next;
            }
            
        }
        return list;
    }

    public LinkedListEvenOdd rearrangeEvenOdd(LinkedListEvenOdd list){
        Node odd = list.head;
        Node even=list.head.next;
        Node evenfirstNode = even;
        while(1==1){
            if(odd==null || even ==null || even.next ==null){
                odd.next = evenfirstNode;
                break;
            }

            odd.next = even.next;
            odd = even.next;

            if(odd.next == null){
                even.next=null;
                odd.next = evenfirstNode;
                break;
            }
            even.next=odd.next;
            even = odd.next;
        }
        return list;

    }

    
    public static void main(String[] args) {
        LinkedListEvenOdd l = new LinkedListEvenOdd();
        l.insertNode(l,3);
        l.insertNode(l,4);
        l.insertNode(l,1);
        l.insertNode(l,10);
        l.insertNode(l,16);
        l.getList(l);
        l.rearrangeEvenOdd(l);
        l.getList(l);
}
}