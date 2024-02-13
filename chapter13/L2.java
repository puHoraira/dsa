package chapter13;

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        int marks[] = new int[13];
        int numbers[] = { 1, 2, 3 };
        String ss[] = new String[4];
        String xy[] = { "ami", "valo", "nei" };
        for (int i = 0; i < 10; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            System.out.print(ss[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(xy[i] + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        System.out.println(marks.length);
        update_marks(marks);
        for (int i = 0; i < 13; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    public static void update_marks(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] += 1;
        }
    }
}
