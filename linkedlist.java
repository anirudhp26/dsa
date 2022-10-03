package linkedlists;

class linkedlists {
    private Node head;
    private Node tail;
    
    private int size;
    public linkedlists() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node (int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node (int value) {
            this.value = value;
        }

    }

    public void add(int value, int position) {
        // for addition in ll we have to first create a new node then point it to the head element then change the head to the value of the node created in order to make head first element again
        // hence 
        if (position == 0) {
            Node node = new Node(value);
            node.next = head;
            head = node;
    
            if (tail == null) {
                //do you understand what am i writing? cause i am writing with an underline cursor now thin line and now most wierd one 
                tail = head;
            }
    
            size += 1;
            return;
        }
        else if (position == size) {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
            size += 1;
        }
        else {
            // Node node = new Node(value);
            Node nodeAfter = head;
            Node nodeBefore = head;
            for (int i = 0; i < position; i++) {
                nodeBefore = nodeAfter;
                nodeAfter = nodeAfter.next;
            }
            Node node = new Node(value, nodeAfter);
            nodeBefore.next = node;

            size += 1;
        }
    }

    public void delete(int value, int position) {
        if (position == 0) {
            head = head.next;
        } else if (position == size - 1) {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
        } else {
            Node temp = head;
            Node before = head;
            for (int i = 0; i < position; i++) {
                before = temp;
                temp = temp.next;
            }


        }
    }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val,node.next);
            size++;
            return temp;
        }

        node.next = insertRec(val, index, node.next);
        return node;
    }

    

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.println(size);
        System.out.println("END");

    }
}
