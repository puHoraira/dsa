package chapter16;

import java.util.Scanner;

public class L10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(s.compareTo(s1));
        s = "amoi";
        System.out.println(s);
        sc.close();
    }
}
