package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacterNew {

    //String name = "necessasity";
	char[] newstr = null;
    
    
    public void init(){
        String str;  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = s.nextLine();
        System.out.println("Entered String is : " +str);
       
        System.out.println("Duplicate chracters in the string " +str+ " are: " +Arrays.toString(duplicateChararacters(str)));
    }

	
    public char[] duplicateChararacters(String st){
        int count=0;
        newstr = new char[st.length()];
        char n[] =st.toCharArray();
        System.out.println("len-----" +n.length);
        for (int i=0;i< n.length;i++){
			for(int j=i+1;j<n.length;j++){
				if(n[i]==n[j]){
                    
                    newstr[count] = n[i];
                    System.out.println("newstr-----" +newstr[count]);
                    count++;

				}
			}
			
		}
        //System.out.println("Duplicates chracters are:  " +Arrays.toString(newstr));
        return newstr;
    }
    
	
	
	 public static void main(String[] args) {
		 DuplicateCharacterNew dup = new DuplicateCharacterNew();
            dup.init();
            //dup.duplicateCharUsingMap("vineeta pandey");

	    }

}