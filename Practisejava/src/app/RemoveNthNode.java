package app;

public class RemoveNthNode{
    Node head;
    int size;

    public class Node{
        Node next;
        int data;
        Node(int num){
            data = num;
            next = null;
        }
    }

    public boolean isEmpty(){
        return head==null;
    }

    public void insertNode(RemoveNthNode n,int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(isEmpty() == true){
            n.head = newNode;
            System.out.println("inserting 1st item: " +data);
            size++;
        }
        else{
            System.out.println("inserting  item: " +data);
            Node current = n.head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            size++;
        }

    }


    public void getList(RemoveNthNode list){
        Node current = list.head;
        if(list.head == null){
            System.out.println("List is empty");
            
        }
        else{
            
            System.out.println("linked list data-----");
            
            while(current!=null){
                
                System.out.print(" "+current.data+" ");
                current = current.next;
            }
            System.out.println(" "); 
        }
        
    }

    public void removeNthNodeFromLast(RemoveNthNode list,int position){
        Node first =list.head;
        int deleteAt = list.size - position; 
        if(first ==null){
            System.out.println("list is empty");
        }
        else if(position>size){
            System.out.println("incorrect position given. The position should be less than "+list.size);
        }
        else if(position == size){
            Node current = list.head;
            list.head=null;
            list.head = current.next;
            System.out.println("data removed at " +position+" position from last");
            
        }
        else if(position ==1){
            Node current = list.head;
            while(current.next.next!=null){
                
                current=current.next;

            }
            current.next = null;
            System.out.println("data removed at " +position+" position from last");
        }
        else{
            Node current = list.head;
            while(deleteAt>1){
                current=current.next;
                deleteAt--;
            }
            current.next=current.next.next;
            System.out.println("data removed at " +position+" position from last");
        }
    }

public static void main(String[] args) {
    RemoveNthNode l = new RemoveNthNode();
    l.insertNode(l,3);
    l.insertNode(l,4);
    l.insertNode(l,3);
    l.insertNode(l,10);
    l.insertNode(l,12);
    l.insertNode(l,16);
    l.insertNode(l,23);
    l.insertNode(l,121);
    l.getList(l);
    // l.removeNthNodeFromLast(l,4);
    // l.getList(l);
    l.removeNthNodeFromLast(l,2);
    l.getList(l);
    

}
}