package chapter16;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        int st = sc.nextInt();
        int end = sc.nextInt();
        ss = subString(ss, st, end);
        System.out.println(ss);
        System.out.println(ss.substring(2, 4));
        sc.close();

    }

    public static String subString(String a, int st, int end) {
        String s = "";
        for (int i = st; i <= end; i++) {
            s += a.charAt(i);
        }
        return s;
    }
}
