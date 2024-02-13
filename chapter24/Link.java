package chapter24;

public class Link {
    public class Node {
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

    void adding_first(int number) {
        Node newnNode = new Node(number);
        if (head == null) {
            head = tail = newnNode;
        } else {
            newnNode.next = head;
            head = newnNode;
        }
    }

    void print() {
        if (tail == null) {
            return;
        }
        Node tm = head;
        while (tm != tail) {
            System.out.print(tm.data + " ");
            tm = tm.next;
        }
        System.out.println(tail.data);
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

    void adding_last(int number) {
        Node newNode = new Node(number);
        if (tail == null) {
            head = tail = null;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void adding_position(int number, int position) {
        if (position <= 1) {
            adding_first(number);
            return;
        } else if (position > size()) {
            adding_last(number);
            return;
        }
        Node newNode = new Node(number);
        Node tm = head;
        while (true) {
            --position;
            if (position == 1) {
                break;
            }
            tm = tm.next;
        }
        newNode.next = tm.next;
        tm.next = newNode;
    }

    void set_value(int value, int position) {
        if (position > size() || position <= 0) {
            return;
        }
        Node tm = head;
        while (true) {
            --position;
            if (position == 0) {
                tm.data = value;
                return;
            }
            tm = tm.next;
        }
    }

    void delete_first() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        head = head.next;
    }

    void delete_last() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        Node tm = head;
        while (tm.next != tail) {
            tm = tm.next;
        }
        tm.next = null;
        tail = tm;
    }

    void delete_position(int position) {
        if (head == null) {
            return;
        }
        if (position <= 1) {
            delete_first();
            return;
        }
        if (position >= size()) {
            delete_last();
            return;
        }
        Node tm = head;
        --position;
        while (true) {
            --position;
            if (position == 0) {
                tm.next = tm.next.next;
                return;
            }
            tm = tm.next;

        }
    }

    int searching(int number) {
        int x = 1;
        Node tm = head;
        while (tm != null) {
            if (tm.data == number) {
                return x;
            }
            tm = tm.next;
            x++;
        }
        return -1;
    }

    int searching(int number, Node tm) {
        if (tm == null) {
            return -1;
        }
        if (tm.data == number) {
            return 1;
        }
        int x = searching(number, tm.next);
        if (x == -1) {
            return -1;
        }
        return x + 1;
    }

    void reverse() {
        Node first = null;
        Node second = head;
        Node third = null;
        while (second != null) {
            third = second.next;
            second.next = first;
            first = second;
            second = third;
        }
        head = first;
        tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
    }

    void find_lastNth(int position) {
        position = size() - position + 1;
        delete_position(position);
    }

    Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    boolean checkPalindrom() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node first = null;
        Node second = mid;
        Node third = null;
        while (second != null) {
            third = second.next;
            second.next = first;
            first = second;
            second = third;
        }
        Node right = first;
        Node left = head;
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Link ll = new Link();
        ll.adding_first(32);
        ll.adding_last(90);
        ll.adding_position(43, 2);

        ll.set_value(19, 3);
        ll.delete_first();
        ll.delete_last();
        ll.delete_position(2);
        ll.adding_first(32);
        ll.adding_last(90);
        ll.adding_position(43, 2);
        ll.print();
        System.out.println(ll.searching(90));
        System.out.println(ll.searching(90, ll.head));
        ll.adding_first(2323);
        ll.print();
        ll.reverse();
        ll.print();
        ll.find_lastNth(4);
        ll.adding_last(2323);
        ll.adding_last(32);
        ll.adding_last(43);
        ll.print();
        System.out.println(ll.checkPalindrom());
    }
}
