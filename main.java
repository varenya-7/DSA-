package LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertLast(6);
        list.insertLast(8);
        list.insertLast(12);
        list.insertLast(15);
        list.insertAtIndex(13, 1);
        list.display();
        System.out.println("Deleting First Node:");
        list.deleteFirstNode();
        list.display();
        System.out.println("Deleting Last Node:");
        list.deleteLastNode();
        list.display();
        System.out.println("Deleting at Index: ");
        list.deleteAtIndex(89);
        System.out.println();
        list.display();
        System.out.println();
        System.out.println("Searching for the number...............");
        System.out.println(list.findElement(68));
    }
}
