package chapter26;

import java.util.*;

public class L13 {
    public static boolean duplicate(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                int x = 0;
                while (st.peek() != '(') {
                    x++;
                    System.out.println(st.peek());
                    st.pop();
                }
                st.pop();
                if (x == 0) {
                    return true;
                }
            } else {
                st.push(str.charAt(i));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.println(duplicate(str));
        sc.close();
    }
}
