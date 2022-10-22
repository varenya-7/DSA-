package LinkedList;


public class DoublyLL {
    private Node head;

    private int size;
    public DoublyLL(){
        this.size=0;
        this.head=null;

    }

    // Insert at the First Position in Doubly
     public void InsertFirst(int val) {
         Node node = new Node(val);
         node.next = head;
         node.prev = null;
         if (head != null) {
             head.prev = node;
         }
         head = node;
         size++;
     }

     //Insert at the Last Position
     public void InsertLast(int val){
        Node node=new Node(val);
        Node last=head;
        if(head==null){
            InsertFirst(val);
            return;
        }
         while (last.next != null) {
             last=last.next;
         }
         last.next=node;
         node.next=null;
         node.prev=last;
         last=node;
         size++;
     }

     //Insert at index

    public void InsertAtIndex(int val, int index){
        if(index==0){
            InsertFirst(val);
            return;
        }
        if(index == size - 1 ){
             InsertLast(val);
             return;
        }
        Node temp= get(index);
        Node node=new Node(val);
        node.next=temp.next.next;
        temp.next=node;
        node.prev=temp;
        size++;
    }
    public Node get(int index){
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        return temp;
    }
// Print the list in Doubly

    public void display(){
        Node temp=head;
        Node last = null;
        if(temp== null){
            System.out.println("NULL");
        }
        //Printing in Straight order

        while(temp != null){
            System.out.print(temp.val+ " <=> " );
            last=temp;
            temp=temp.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println("Size Of list- "+size);
        System.out.println();

        System.out.println("Printing in Reverse");
        //Printing in reverse Order

        while(last != null){
            System.out.print(last.val+ " <=> ");
            last=last.prev;
        }
        System.out.print("END");
        System.out.println();
    }


//Insert After a value

    public Node find(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.val==value){
                return temp;
            }
            temp=temp.next;
        }

        return null;
    }

public void  insertAfterNode(int after, int value){
        Node p=find(after);
        if(p==null){
            System.out.println("Number does not exist in the list");
            return;
        }
        Node node=new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null)
         node.next.prev=node;
        size++;
}


    private class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
