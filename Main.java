package dsa.dsa;

public class Main {
    public static void main(String[] args) {
        linkedlists ll = new linkedlists();

        ll.add(5,0);
        ll.display();
        ll.add(4,1);
        ll.display();
        ll.add(25,1);
        ll.display();
        ll.add(2,2);
        // ll.add(54,0);
        ll.display();
        ll.insertRec(10, 2);
        ll.display();
    }
}
