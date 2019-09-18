package app;

import java.util.Arrays;
import java.util.Scanner;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top =-1;
    }

    public void push(int n){
        if(isFull()){
            System.out.println("stack overflowed");
            System.exit(1);
        }
        System.out.println("inserting --" +n);
        top=top+1;
        arr[top] = n;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(1);
        }
        System.out.println("removing --" +arr[top]);

        return arr[top--];
    }

     

    public int size()
	{
		return top + 1;
	}


    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity-1;
    }

    public int[] getStackElements(){
        return arr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter no. of element you want to enter: ");
        num = s.nextInt();
        Stack stack = new Stack(num);  
        stack.push(1);
        stack.push(3);
        stack.push(8);
        stack.pop();
        stack.pop();
        stack.push(3);
        stack.push(9);
        System.out.println("Stack elements: " +Arrays.toString(stack.getStackElements()));

    }
}