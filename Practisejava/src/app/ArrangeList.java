package app;

import java.util.ArrayList;
import java.util.List;

public class ArrangeList {
	int zero=0,one=0;

	public void init(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(1);
		
		
		System.out.println("old list is: " +list);
		System.out.println("New list is: " +newList(list));
	}
	
	
	public List newList(List l){
		List<Integer> list1 = new ArrayList<Integer>();
		int size =l.size() ;
		 	for(int i =0;i<size;i++){
		 		
		 		if(l.get(i).equals(0)){
		 			zero++;
		 		}
		 		else{
		 			one++;
		 		}
		 		
		 	}
		 	for(int i=0;i<zero;i++)
		 		list1.add(0);
		 	for(int i=0;i<one;i++)
		 		list1.add(1);
		
		return list1;
	}

	public static void main(String[] args) {
		ArrangeList list = new ArrangeList();
        list.init();
	}


}
