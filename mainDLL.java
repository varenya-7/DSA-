package LinkedList;

public class mainDLL {
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.InsertFirst(25);
        list.InsertFirst(35);
        list.InsertFirst(45);
        list.InsertFirst(55);
          list.InsertLast(2);
          list.InsertLast(4);
          list.InsertLast(6);
          list.InsertAtIndex(56,2);
          list.display();
        System.out.println();
          list.insertAfterNode(25,26);
          list.display();


    }
}
