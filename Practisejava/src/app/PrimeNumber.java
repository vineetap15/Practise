package app;

import java.util.ArrayList;

public class PrimeNumber{

    
	int len;
    ArrayList oddlist = new ArrayList() ;
    ArrayList evenlist = new ArrayList();
    ArrayList primelist = new ArrayList();
    

    public void printOddEvenNumber(int number[]){
    	len= number.length;
    	System.out.println("length of array is    " +len);
        for (int i=0;i<len;i++){
            if(number[i] % 2 == 0){
            	
            	evenlist.add(number[i]);
            }
            else{
            	oddlist.add(number[i]);
            }

        }
        System.out.println("odd numbers are   " +oddlist);
        System.out.println("Even numbers are   " +evenlist);
    }

    public void printPrimeNumber(int number[]){
    	 len = number.length;
    	
       for(int i=0;i<len;i++){
    	   int temp=0;
    	   for(int j=2;j<=number[i]/2;j++){
    		   if(number[i]%j==0){
    			   temp=temp+1;
    		   }    		   
    	   }
    	   if(number[i]>1 && temp==0 && !primelist.contains(number[i])){
    		   primelist.add(number[i]);
    	   }
    	   
       }
       
    System.out.println("Prime numbers are   " +primelist);
    }

     public static void main(String[] args) {
    	 int number[] = {0,1,3,5,6,7,23,24,18,7,69,23,11,25,10,19};
        PrimeNumber num = new PrimeNumber();
        num.printOddEvenNumber(number);
        num.printPrimeNumber(number);

    }
}
