package LinkedList;

public class mainCLL {

    public static void main(String[] args) {
        CLL list=new CLL();
      list.insert(24);
        list.insert(25);
        list.insert(26);
        list.insert(27);
        list.display();
        list.delete(25);
        list.display();
    }

}
