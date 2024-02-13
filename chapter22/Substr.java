package chapter22;

import java.util.Scanner;

public class Substr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        substr(s, ans, 0);
        sc.close();
    }

    public static void substr(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        substr(s, ans + s.charAt(i), i + 1);
        substr(s, ans, i + 1);
        System.out.println("---------");
        // substr(s, start, ++end);
        // substr(s, ++start, end);
        // end = start;
        // substr(s, start, ++end);
        // System.out.println(s.substring(start, end));

    }
}
