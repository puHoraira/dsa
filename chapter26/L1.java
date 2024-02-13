package chapter26;

import java.util.*;

public class L1 {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            if (list.size() == 0) {
                return true;
            }
            return false;
        }

        void push(int data) {
            list.add(data);
        }

        int pop() {
            int x = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return x;
        }

        int peek() {
            return list.get(list.size() - 1);
        }

        void pushBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushBottom(data);
            push(top);
        }
    }

    static class Stack2 {
        class Node {
            int data;
            Node next;

            Node() {
            };

            Node(int data) {
                this.data = data;
            }
        }

        Node head = null;

        void push(int data) {
            Node newnNode = new Node(data);
            if (head == null) {
                head = newnNode;
                return;
            }
            newnNode.next = head;
            head = newnNode;
        }

        boolean isEmpty() {
            return head == null;
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            int x = head.data;
            head = head.next;
            return x;
        }

        int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        void pushBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushBottom(data);
            push(top);
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.pushBottom(323);
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();
    }
}
