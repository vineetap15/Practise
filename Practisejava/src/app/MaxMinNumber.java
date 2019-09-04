package app;
public class MaxMinNumber {
	int max=0,min=0;
	
	
	
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
		int[] number ={1012,1,123,56,234,90,2,1,5,-2,-55,589};
		MaxMinNumber num = new MaxMinNumber();
	     
	    System.out.println("Max no is:  " +num.maxNumber(number));
	    System.out.println("Min no is:  " +num.minNumber(number));

	    }

}
