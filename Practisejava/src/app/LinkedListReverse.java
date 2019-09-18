package app;

import java.util.Scanner;

public class LinkedListReverse {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next =null;
        }
    }


    public static void reverse(Node node) {
        
    }

    public static void main(String[] args) {
        LinkedListReverse l = new LinkedListReverse();
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

      
    }
}