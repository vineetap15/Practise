package app;

import java.util.ArrayList;
import java.util.List;


//Write a Java program to replace each number in a list of [7,4,2,35,1900] 
//with the product of the remaining numbers in the list
public class ListProducts {
	List<Integer> finallist = new ArrayList<Integer>();

	public void init(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(7);
		list.add(4);
		list.add(2);
		list.add(35);
		list.add(1900);
		
		
        System.out.println("old list is: " +list);
        newList(list);
		System.out.println("Final list is: " +getFinalList());
	}
	
	
	public void newList(List<Integer> l){
		List<Integer> list1 = new ArrayList<Integer>();
        int size =l.size() ;
        int e;
        int j=0;
        System.out.println("size---" +size);

		 	for(int i =0;j<size;j++){
                System.out.println("list1---" +l);

                 e=l.get(i);
                 l.remove(i);
                 setFinalList(l);
                 l.add(e);
             }
             //System.out.println("list1---" +l);

		    }
    
    public void setFinalList(List<Integer> l){
        int num=1;
        for(int i=0;i<l.size();i++){
            num = num * l.get(i);
            System.out.println("num---" +num);
        }
        finallist.add(num);
        System.out.println("final list====" +finallist);

    }

    public List<Integer> getFinalList(){
        return finallist;
    }

	public static void main(String[] args) {
		ListProducts list = new ListProducts();
        list.init();
	}

}
