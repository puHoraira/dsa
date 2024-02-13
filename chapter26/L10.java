package chapter26;

import java.util.Stack;

public class L10 {
    public static void main(String[] args) {
        int a[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> st = new Stack<>();
        int b[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            while (!st.empty() && a[st.peek()] <= a[i]) {
                st.pop();
            }
            if (st.empty()) {
                b[i] = -1;
            } else {
                b[i] = a[st.peek()];
            }
            st.push(i);
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
