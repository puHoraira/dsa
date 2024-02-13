package chapter25;

import java.util.*;

public class L10 {
    class Node {
        int data;
        Node next;

        Node() {
            this.next = null;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    void add(int data) {
        Node newnNode = new Node(data);
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
    }

    Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node tm = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tm.next = head1;
                head1 = head1.next;
                tm = tm.next;
            } else {
                tm.next = head2;
                head2 = head2.next;
                tm = tm.next;
            }
        }
        while (head1 != null) {
            tm.next = head1;
            head1 = head1.next;
            tm = tm.next;
        }
        while (head2 != null) {
            tm.next = head2;
            head2 = head2.next;
            tm = tm.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node righead = mid.next;
        mid.next = null;
        Node newright = mergeSort(righead);
        Node newLeft = mergeSort(head);

        return merge(newLeft, newright);
    }

    public static void main(String args[]) {
        L10 ll = new L10();
        ll.add(41);
        ll.add(2);
        ll.add(-1);
        ll.add(41);
        ll.add(5);
        ll.add(6);

        ll.print();
        System.out.println();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
}
