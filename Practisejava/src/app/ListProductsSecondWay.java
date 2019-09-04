package app;

import java.util.ArrayList;
import java.util.List;


//Write a Java program to replace each number in a list of [7,4,2,35,1900] 
//with the product of the remaining numbers in the list
public class ListProductsSecondWay {
	List<Integer> finallist = new ArrayList<Integer>();

	public void init(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(4);
		list.add(2);
		list.add(35);
		list.add(1900);
		
        System.out.println("old list is: " +list);
		System.out.println("Final list is: " +newList(list));
	}
	
	
	public List<Integer> newList(List<Integer> l){
		List<Integer> list1 = new ArrayList<Integer>();
		int num =1;
		for(int i=0;i<l.size();i++){
			num = num*l.get(i);
		}

		for(int i=0;i<l.size();i++){
			list1.add(num/l.get(i));
		}
        
		return list1;
		
		    }
    
	public static void main(String[] args) {
		ListProductsSecondWay list = new ListProductsSecondWay();
        list.init();
	}

}
