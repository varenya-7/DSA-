package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {   
        this.size = 0;
    }

    // Insert an element at the start of the linked list
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //Display a linked list

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size is:- "+size);
    }

    //Insert the element at the last

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        size+=1;
    }

    //Insertion of Node at an index
    public void insertAtIndex(int val, int index){
         if(index == 0){
             insertFirst(val);
             return;
         }
         if(index == size){
             insertLast(val);
             return;
         }
         Node node=new Node(val);
         Node temp=head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.next=temp.next;
        temp.next=node;
        size+=1;
    }

    //deleting first node
    public void deleteFirstNode(){

        head=head.next;
        if(head==null){
            tail=null;
        }
        size-=1;
    }

    //get A node at an index
    // Return the node at the index passed
    public Node get(int index){
        Node temp=head;
        for (int i = 0; i <index; i++) {
           temp=temp.next;
        }
        return temp;
    }

    // delete Last Node
    public void deleteLastNode(){
        if(size<=1){
            deleteFirstNode();
        }
        Node temp= get(size-2);
        tail=temp;
        tail.next=null;
        size--;
    }


   // Delete Node at an Index
    public void deleteAtIndex(int index){
        if(index > size -1) {
            System.out.println("Index Entered is more than the size of Linked List");
            return;
        }
      if(index == 0 ){
          deleteFirstNode();
      }
      if(index == size-2){
           deleteLastNode();
      }
      Node temp= get(index - 1);
        temp.next=temp.next.next;
    }
    // Find At an index

    public String findElement(int value){
        Node temp=head;
        while(temp != null){
            if(value==temp.val){
                return "Number found";
            }
            temp=temp.next;
        }
        return "Number not found";
    }
//Reverse a Linked List
public Node reverseList(Node head) {

    Node current=head;
    Node prev=null;
    Node next=null;

    while(current!=null){
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
    }
    head=prev;
    return head;

}

//Recursive Insertion


    // Initialization of a linked list
private class Node{
        private int val;
        private Node next;

   public Node(int val){
       this.val=val;
   }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
}
