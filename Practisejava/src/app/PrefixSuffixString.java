package app;

import java.util.ArrayList;

public class PrefixSuffixString{
String prefix;
String suffix;

public void tugetPrefixAndSuffix(String str){
char ch[] = str.toCharArray();
int len = ch.length;
System.out.println("length----" +len);
ArrayList<Character> pr = new ArrayList<Character>();
ArrayList<Character> su = new ArrayList<Character>();
for(int i=0;i<len;i++){
    if(i<=len/2){
        pr.add(ch[i]);
    }
    else{
        su.add(ch[i]);
    }
}
System.out.println("Prefix of "+str+ "is:  " +pr.toString());
System.out.println("Suffix of "+str+ "is:  " +su.toString());
    
}


    public static void main(String[] args) {
        PrefixSuffixString str = new PrefixSuffixString();  
        String s ="UnitedStatesOfamerica";
        str.getPrefixAndSuffix(s);
        

}
}