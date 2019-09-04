package app;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacter {

    String name = "necessasity";
	char[] charname = name.toCharArray();
	ArrayList newname = new ArrayList();

	
    public void duplicateChar(){

        for (int i=0;i< charname.length;i++){
			for(int j=1;j<i;j++){
				if(charname[i]==charname[j]){
				newname.add(charname[i]);	
				}
			}
			
		}
		System.out.println("Duplicates chracters are:  " +newname);
    }
    public void duplicateCharUsingMap(String str){
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
		
		for(char ch:st){
			if(hashmap.get(ch) > 1){
				System.out.println("(MAP) duplicate chracteres are:  " +ch+ ": " +hashmap.get(ch));
			}
		}
	}
	
	 public static void main(String[] args) {
		 DuplicateCharacter dup = new DuplicateCharacter();
            dup.duplicateChar();
            dup.duplicateCharUsingMap("vineeta pandey");

	    }

}