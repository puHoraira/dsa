package chapter25;

public class L1 {
    public static class Node {
        int data;
        Node next;

        Node() {
            data = 0;
            next = null;
        }

        Node(int data) {
            this.next = null;
            this.data = data;
        }

        Node(int data, Node address) {
            this.next = address;
            this.data = data;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void add(int number) {
        Node newnode = new Node(number);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void add(int number, Node address) {
        Node newnode = new Node(number, address);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void print() {
        Node tm = head;
        while (tm != null) {
            System.out.print(tm.data + " ");
            tm = tm.next;
        }
        System.out.println();
    }

    public Node findPos(int number) {
        Node tm = head;
        while (true) {
            --number;
            if (number == 0) {
                return tm;
            }
            tm = tm.next;
        }
    }

    public boolean detect_Loop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void delete_loop() {
        Node slow = head;
        Node fast = head;
        boolean check = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                check = true;
                break;
            }
        }
        if (check == false) {
            return;
        }
        slow = head;
        Node prv = null;
        while (slow != fast) {
            slow = slow.next;
            prv = fast;
            fast = fast.next;
        }
        prv.next = null;
    }

    public static void main(String arasf[]) {
        L1 ll = new L1();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.print();
        ll.add(2);
        ll.add(1);
        ll.add(0);
        ll.add(-1);
        ll.add(-4);
        ll.add(-3);
        Node pos = ll.findPos(2);
        ll.print();
        ll.add(324, pos);
        // ll.print();
        System.out.println(ll.detect_Loop());
        ll.delete_loop();
        System.out.println(ll.detect_Loop());
        ll.print();
    }
}
