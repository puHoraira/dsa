package chapter26;

import java.util.*;

public class L11 {
    static boolean valid(String a) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '{' || a.charAt(i) == '[' || a.charAt(i) == '(') {
                st.push(a.charAt(i));
            } else if (st.empty()) {
                return false;
            } else if (a.charAt(i) == '}') {
                if (st.peek() != '{') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (a.charAt(i) == ']') {
                if (st.peek() != '[') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (a.charAt(i) == ')') {
                if (st.peek() != '(') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        if (st.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String a = new String();
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        valid(a);
        sc.close();

    }
}
