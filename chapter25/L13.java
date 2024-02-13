package chapter25;

public class L13 {
    class Node {
        int data;
        Node next;

        Node() {

        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void add(int number) {
        Node newnNode = new Node(number);
        if (head == null) {
            head = tail = newnNode;
            return;
        }
        tail.next = newnNode;
        tail = newnNode;
    }

    void print() {
        Node tm = head;
        while (tm != null) {
            System.out.print(tm.data + " ");
            tm = tm.next;
        }
        System.out.println();
    }

    int size() {
        int x = 0;
        Node tm = head;
        while (tm != null) {
            x++;
            tm = tm.next;
        }
        return x;
    }

    int getValue(int position) {
        Node tm = head;
        int i = 0;
        while (position > i) {
            tm = tm.next;
            i++;
        }
        return tm.data;
    }

    public static void main(String arwe[]) {
        L13 l1 = new L13();
        L13 l2 = new L13();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.print();
        int sz = l1.size();
        l1.getValue(1);
        for (int i = 0; i < sz / 2; i++) {
            l2.add(l1.getValue(i));
            l2.add(l1.getValue(sz - i - 1));
        }
        if (sz % 2 == 1) {
            l2.add(l1.getValue(sz / 2));
        }
        l2.print();
    }
}
