package app;

import java.util.Scanner;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next =null;
        }
    }

    public static LinkedList add(LinkedList list,int data){
        Node newNode = new Node(data);
        newNode.next =null;
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next!=null){
                    last = last.next   ;
            }
            last.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list){
        Node currNode = list.head; 
  
        System.out.print("LinkedList: "); 
  
        while (currNode != null) { 
            System.out.print(currNode.data + " "); 
  
            currNode = currNode.next; 
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        int num=0;  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of element you want to enter: ");
        num = s.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array " +num+ " items: ");
        for(int i=0;i<num;i++){
            
            arr[i] = s.nextInt();
            add(l, arr[i]);
            
        }

        printList(l);
    }
}