package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrangeListNew {
    int zero=0,one=0;
    int arr[];
    
    public void init(){
        int num=0;  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter no. of element you want to enter: ");
        num = s.nextInt();
        this.arr = new int[num];
        System.out.println("Enter the array " +num+ " items: ");
        for(int i=0;i<num;i++){
            
            arr[i] = s.nextInt();
            if(arr[i] != 0 && arr[i] != 1){
                System.out.println("Only 1 and 2 numbers are accepted");
                //System.exit(arr[i]);
                i--;
                
            }
        }
        System.out.println("Array items: " +Arrays.toString(arr));

        System.out.println("calling newlist");
        System.out.println("Updated Array items: " +Arrays.toString(newList(arr, num)));
        
    }

	
	public int[] newList(int a[],int size){
		int temp;
		for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i] == 1 && a[j] ==0){
                    temp=a[i];
                    a[i] =a[j];
                    a[j]=temp;
                    
                }
            }
        }
        // System.out.println("new array: " +Arrays.toString(a));
		
		return a;
    }
    
     

	public static void main(String[] args) {
        ArrangeListNew list = new ArrangeListNew();
        list.init();
        
	}


}
