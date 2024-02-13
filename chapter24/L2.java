package chapter24;

public class L2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node head;
    public Node tail;

    public static void main(String[] args) {
        L2 ll = new L2();
        ll.head = new Node(4);
        ll.head.next = new Node(5);
    }
}
