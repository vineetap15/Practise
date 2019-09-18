package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberNew{

    
	int len;

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
        System.out.println("Prime numbers are : ");
        getPrimeNumber(arr) ;
        
    }

    public void getPrimeNumber(int[] n){
        //int no[] = new int[n.length];
        int count=0;
        
        for(int i = 0;i<n.length;i++){
            int temp=0; 
            for(int j =2;j<=n[i]/2;j++){
                if(n[i]%j==0){
                    temp =temp+1;
                }
                
            }
            if(temp==0 && n[i]>1){
                System.out.print(n[i] + " ");
                    
                 //no[count] = n[i];
                 count++;
              
            }
            
            
        }
         //return no;
    }
    	   
  

     public static void main(String[] args) {
        PrimeNumberNew pm = new PrimeNumberNew();
        pm.init();

    }
}
