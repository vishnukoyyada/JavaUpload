package LinkedList;

public class DLL {
    Node head;
    int size = 0;

    public class Node {
        Node next;
        Node prev;
        int val;

        public Node(int data, Node next, Node prev) {
            this.val = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(int data) {
            this.val = data;
        }
    }

    public void insertFirst(int data) {
        Node newnode = new Node(data);
        newnode.next =head;
        if(head != null){
            head.prev = newnode;
        }
        head = newnode;
        size++;
    }
    public void insert(int data,int pos){
        Node newnode = new Node(data);
        Node temp = head;
        while(pos>1){
            temp= temp.next;
            pos--;
        }
        newnode.next =temp.next ;
      //  newnode.prev = temp;
        temp.next = newnode;
        size++;

    }

    public void insertLast(int data) {
        Node newnode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.prev = temp;
        size++;
    }


    public void show() {
        Node current = head;
        System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.show();
        list.insertLast(-1);
        list.insertLast(-2);
        list.show();
        list.insert(100,4);
        list.insert(500,5);
        list.show();
        System.out.println(list.size);

    }
}
