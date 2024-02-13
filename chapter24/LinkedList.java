package chapter24;

public class LinkedList {
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

    public void add_first(int number) {
        Node newnode = new Node(number);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void add_last(int number) {
        Node newnode = new Node(number);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    public void print() {
        Node tm = head;
        while (tm != null) {
            System.out.print(tm.data + " ");
            tm = tm.next;
        }
        System.out.println();
    }

    public int size() {
        int ans = 0;
        Node tm = head;
        while (tm != null) {
            ans++;
            tm = tm.next;
        }
        return ans;
    }

    public void add_At_pos(int pos, int number) {
        if (pos == 1) {
            add_first(number);
            return;
        }
        if (pos > size() + 1) {
            System.out.println("UltaPlataPositionEInput");
            add_last(number);
            return;
        }
        Node tm = head;
        Node newnNodes = new Node(number);

        if (head == null) {
            head = tail = newnNodes;
            return;
        }
        while (true) {
            pos--;
            if (pos == 1) {
                break;
            }
            tm = tm.next;
        }
        newnNodes.next = tm.next;
        tm.next = newnNodes;
    }

    public int remove_first() {
        if (head == null) {
            return -1;
        }
        if (head.next == null) {
            int x = head.data;
            head = tail = null;
            return x;

        }
        int x = head.data;
        head = head.next;
        return x;
    }

    public int remove_last() {
        Node tm = head;
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            int x = head.data;
            head = tail = null;
            return x;
        }
        while (tm.next != tail) {
            tm = tm.next;
        }
        int x = tail.data;
        tail = tm;
        tail.next = null;
        return x;
    }

    public int remove_at_pos(int pos) {
        int x;
        if (pos == 1) {
            x = remove_first();
        } else if (pos >= size()) {
            x = remove_last();
        } else {
            Node tm = head;
            while (true) {
                pos--;
                if (pos == 1) {
                    x = tm.next.data;
                    tm.next = tm.next.next;
                    break;
                }
                tm = tm.next;
            }
        }
        return x;

    }

    public Node mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrom() {
        if (head == null || head.next == null) {
            return true;
        }
        Node midd = mid();
        Node prv = null;
        Node curr = midd;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prv;
            prv = curr;
            curr = next;
        }
        Node right = prv;
        Node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next; // Move left pointer forward
            right = right.next; // Move right pointer forward
        }
        return true;
    }

    public int search(int number) {
        Node tm = head;
        int x = 1;
        while (tm != null) {
            if (tm.data == number) {
                System.out.println("found");
                return x;
            }
            x++;
            tm = tm.next;
        }
        System.out.println("Not Found");
        return -1;
    }

    public int search(Node tm, int number) {

        if (tm == null) {
            return -1;
        }
        if (tm.data == number) {
            return 1;
        }
        int idx = search(tm.next, number);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public void reverse() {
        Node first = null;
        Node second = head;
        Node third = head;
        while (third != null) {
            third = second.next;
            second.next = first;
            first = second;
            second = third;
        }
        // second.next = first;
        head = first;
        tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add_At_pos(2, 1231);
        ll.add_first(4);
        ll.add_first(3);
        ll.add_first(12);
        ll.add_first(43);
        ll.add_last(67);
        ll.add_last(32);
        ll.add_At_pos(9, 987);
        ll.print();
        System.out.println(ll.remove_first());
        ll.print();

        System.out.println(ll.remove_last());
        // ll.remove_last();
        ll.print();
        System.out.println(ll.remove_at_pos(3));
        ll.print();
        System.out.println(ll.remove_at_pos(3));
        ll.print();
        System.out.println(ll.remove_at_pos(3));
        ll.print();
        System.out.println(ll.remove_at_pos(3));
        ll.print();
        ll.add_first(43);
        ll.add_last(67);
        ll.print();
        System.out.println(ll.remove_at_pos(3));
        ll.print();
        System.out.println(ll.remove_at_pos(3));
        ll.print();
        System.out.println(ll.remove_at_pos(2));
        ll.print();
        ll.add_At_pos(2, 1231);
        ll.add_first(4);
        ll.add_first(3);
        ll.add_first(12);
        ll.add_first(43);
        ll.add_last(67);
        ll.add_last(32);
        ll.add_At_pos(9, 987);
        ll.print();
        System.out.println(ll.search(987));
        System.out.println(ll.search(ll.head, 987));
        ll.print();
        System.out.println("________");
        ll.reverse();
        ll.print();
        ll.add_first(12);
        ll.add_first(43);
        ll.add_last(67);
        ll.add_last(32);
        ll.print();
        ll.remove_last();
        ll.remove_last();
        ll.add_At_pos(3, 3);
        ll.add_At_pos(4, 4);
        ll.remove_at_pos(5);
        ll.remove_at_pos(5);
        ll.remove_at_pos(5);
        ll.add_At_pos(6, 43);
        ll.print();
        System.out.println(ll.checkPalindrom());
        ll.add_first(43);
        ll.add_last(67);
        ll.add_last(32);
        ll.add_At_pos(9, 987);
        ll.print();
    }
}
