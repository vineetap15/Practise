package app;

public class StringReverse {
	
	String str;
	
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
	    System.out.println("The reverse of the string is:  "+ rev.reverseString("reverse"));

	    }


}
