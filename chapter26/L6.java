package chapter26;

import java.util.*;

public class L6 {
    public static String reverse(String str) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            st.push(str.charAt(i));
            i++;
        }
        StringBuilder res = new StringBuilder();
        while (!st.empty()) {
            res.append(st.pop());
        }
        return res.toString();
    }

    static void pushBottom(Stack<Character> st, Character data) {
        if (st.empty()) {
            st.push(data);
            return;
        }
        char top = st.pop();
        pushBottom(st, data);
        st.push(top);
    }

    static void rev(Stack<Character> st) {
        if (st.empty()) {
            return;
        }
        char top = st.pop();
        rev(st);
        pushBottom(st, top);
    }

    public static void main(String[] args) {
        String moth = "mother";
        moth = reverse(moth);
        System.out.println(moth);
        Stack<Character> st = new Stack<>();
        st.push('a');
        st.push('b');
        st.push('c');
        st.push('b');
        st.push('c');
        System.out.println(st);
        rev(st);
        System.out.println(st);
    }
}
