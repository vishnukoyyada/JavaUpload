package Trees;

import java.util.Scanner;

public class BinaryTree {
    Node root;

    public class Node {
        int value;
        Node left;
        Node right;

        Node(int val) {
            this.value = val;
        }
    }

    public void insert(Scanner sc) {
        System.out.println("Enter the root value");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc, root);
    }

    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter the left of " + node.value + " (true/false)?");
        boolean leftInput = sc.nextBoolean();
        if (leftInput) {
            System.out.println("Enter the value");
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter the right of " + node.value + " (true/false)?");
        boolean rightInput = sc.nextBoolean();
        if (rightInput) {
            System.out.println("Enter the value");
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc, node.right);
        }
    }

    public void display() {
        System.out.println("Root value: " + root.value);
        properdisplay(root);

    }

    private void properdisplay(Node node) {
        if(node == null){
            return;
        }
        System.out.println(node.value);
        properdisplay(node.left);
        properdisplay(node.right);
    }


    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        bt.insert(scanner);
        bt.display();
        scanner.close();
    }
}
