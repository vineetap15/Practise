package app;

import java.util.Scanner;

public class StringReverse {
	
	String str;

	public void init(){
        String str;  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = s.nextLine();
        System.out.println("Entered String is : " +str);
       
		System.out.println("Reverse of the string " +str+ " is: " +reverseString(str));
		
    }
	
	public String reverseString(String str){
		char[] chr= str.toCharArray();
		int len = chr.length-1;
		char temp;
		int i=0;
		System.out.println("length of string is:   " +len);
		
				while(i<=len){
					temp = chr[i];
					chr[i] = chr[len]; 
					chr[len] = temp;
					len--;
					i++;
				
			}
			
		return String.valueOf(chr);		
	}
	
	public static void main(String[] args) {
		StringReverse rev = new StringReverse();
	    rev.init();

	    }


}
