package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacter {

    //String name = "necessasity";
	//char[] charname = name.toCharArray();
	ArrayList newname = new ArrayList();

	public void init(){
        String str;  
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = s.nextLine();
        System.out.println("Entered String is : " +str);
       
		System.out.println("Duplicate chracters in the string " +str+ " are: " +duplicateChar(str));
		System.out.println("Duplicate chracters in the string " +str+ " are: " +duplicateCharUsingMap(str));
    }

	
    public ArrayList duplicateChar(String s){
		char[] charname = s.toCharArray();

        for (int i=0;i< charname.length;i++){
			for(int j=1;j<i;j++){
				if(charname[i]==charname[j]){
				newname.add(charname[i]);	
				}
			}
			
		}
		return newname;
		//System.out.println("Duplicates chracters are:  " +newname);
    }
    public HashMap duplicateCharUsingMap(String str){
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		char[] chrArray = str.toCharArray();
		for(char c : chrArray){
			if(hashmap.containsKey(c)){
				hashmap.put(c, hashmap.get(c)+1);
			}
			else{
				hashmap.put(c, 1);
			}
		}
		Set<Character> st = hashmap.keySet();
		
		// for(char ch:st){
		// 	if(hashmap.get(ch) > 1){
		// 		System.out.println("(MAP) duplicate chracteres are:  " +ch+ ": " +hashmap.get(ch));
		// 	}
		// }

		return hashmap;
	}
	
	 public static void main(String[] args) {
		 DuplicateCharacter dup = new DuplicateCharacter();
            dup.init();

	    }

}