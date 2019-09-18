package app;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {
	int max=0,min=0;

	public void init(){
        int num=0;  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of element you want to enter: ");
        num = s.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the array " +num+ " items: ");
        for(int i=0;i<num;i++){
            
            arr[i] = s.nextInt();
            
        }
        System.out.println("Array items: " +Arrays.toString(arr));

		System.out.println("Max no is:  " +maxNumber(arr));
	    System.out.println("Min no is:  " +minNumber(arr));
        
    }
	
	public int maxNumber(int[] number){
		int size = number.length-1;
		int max=number[0];
		
		for(int i=1;i<=size;i++){
				
				if(number[i]>max){
					max = number[i];
				}
		}
		return max;
		
	}
	
	public int minNumber(int[] number){
		int size = number.length-1;
		int min=number[1];
		
		for(int i=1;i<=size;i++){
				
				if(number[i]<max){
					min = number[i];
				}
		}
		return min;
		
	}
	public static void main(String[] args) {
		
		MaxMinNumber mn = new MaxMinNumber();
		mn.init();
	     
	    
	    }

}
