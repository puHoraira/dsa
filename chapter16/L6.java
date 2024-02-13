package chapter16;

import java.util.Scanner;

public class L6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int sz = str.length() - 1;
        for (int i = 0; i <= sz / 2; i++) {

            if (str.charAt(i) != str.charAt(sz - i)) {
                System.out.println("Not a palindrom");
                return;
            }
        }
        System.out.println("Palindrom");

    }
}