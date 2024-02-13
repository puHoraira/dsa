package chapter6;

import java.util.Scanner;

public class L9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first_word = sc.next();
        String line = sc.nextLine();
        int nmbr = sc.nextInt();
        short shn = sc.nextShort();
        byte bt = sc.nextByte();
        float fl = sc.nextFloat();
        double dol = sc.nextDouble();
        long lg = sc.nextLong();
        boolean bl = sc.nextBoolean();
        System.out.println(first_word);
        System.out.println(line);
        System.out.println(nmbr);
        System.out.println(shn);
        System.out.println(bt);
        System.out.println(fl);
        System.out.println(dol);
        System.out.println(lg);
        System.out.println(bl);
        sc.close();
    }
}
