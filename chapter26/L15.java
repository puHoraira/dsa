package chapter26;

import java.util.*;

public class L15 {
    public static void main(String[] args) {
        int a[] = { 2, 1, 5, 6, 2, 3 };
        int ans = 0;

        int b[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!st.empty() && a[st.peek()] >= a[i]) {
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
        // for (int i = 0; i < a.length; i++) {
        // for (int j = i + 1; j < a.length; j++) {
        // ans = Integer.max(ans, (j - i) * Integer.min(a[i], a[j]));
        // }
        // }
        // System.out.println(ans);
        // int forw[] = new int[a.length];
        // int back[] = new int[a.length];
        // forw[0] = a[0];

        // for (int i = 1; i < a.length; i++) {
        // forw[i] = Integer.min(a[i], forw[i - 1]);
        // }
        // for (int i = a.length - 2; i >= 0; i--) {
        // back[i] = Integer.max(a[i], back[i + 1]);
        // }
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(forw[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < a.length; i++) {
        // System.out.print(back[i] + " ");
        // }

        // ans = 0;
        // int start = 0;
        // int end = a.length - 1;
        // while (start <= end) {
        // ans = Integer.max(ans, (end - start + 1) * Integer.min(a[end], a[start]));
        // System.out.println("Ans: " + ans + " End: " + end + " Start: " + start);
        // if (a[start] < a[end]) {
        // start++;
        // } else {
        // end--;
        // }
        // }
        // System.out.println(ans);

    }
}
