package LinkedList;

public class LL {
    static Node head;
    static Node tail;
    static int size = 0;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // Insert at the beginning of the list
    public static void insertFirst(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }


    // Insert at the end of the list
    public static void insertLast(int data) {
        Node newnode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
        size++;
    }

    // Insert at a specific position in the list
    public static void insert(int data, int pos) {
        if (pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (pos == 0) {
            insertFirst(data);
        } else if (pos == size) {
            insertLast(data);
        } else {
            Node newnode = new Node(data);
            Node temp = head;

            // Traverse to the node just before the position
            while (pos > 1) {
                temp = temp.next;
                pos--;
            }

            // Perform the insertion
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
        }
    }
    public static void deletefirst(){
        head = head.next;
    }
    public static void deletelast(){
        Node temp = head;
        while(temp.next.next !=null){
            temp= temp.next;
        }
        temp.next =null;
    }
    public static void delete(int pos){
        if (pos == 0) {
            deletefirst();
        } else if (pos == size) {
            deletelast();
        } else {
            Node temp  = head;
            while(pos > 1){
                temp = temp.next;
                pos--;
            }
            temp.next = temp.next.next;
        }
    }


    // Display the elements in the list
    public static void show() {
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        insertFirst(5);
       insertFirst(4);
       insertFirst(3);
        insertFirst(2);
        insertFirst(1);
       insertLast(6);
       insertLast(7);
        System.out.println(size);
        insert(8, 4);
        delete(4);
        show();

    }
}
