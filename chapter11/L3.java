package chapter11;

import java.util.*;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("sum: " + sum(a, b));
        System.out.println("a: " + a + " b: " + b);
        swap1(a, b);
        System.out.println("a: " + a + " b: " + b);
        System.out.println("mul: " + mul(a, b));
        System.out.println("factorial: " + fact(a));
        System.out.println("factorial: " + fact2(a));
        System.out.println("Bionomial: " + binomial(a, b));
        // Ei duita not overloading
        System.out.println("sum: " + sum(a, b, 9));
        System.out.println("sum: " + sum(a, 4.5f, 9));
        System.out.println("sum: " + sum(4.5f, 6.5f));
        int x = sc.nextInt();
        System.out.println(prime(x));
        int z = sc.nextInt();
        prime_in_range(z);
        prime_in_range(min(z, x), max(z, x));
        int n = sc.nextInt();
        System.out.println(decToBin(n));
        n = sc.nextInt();
        System.out.println(binToDec(n));
        sc.close();
    }

    public static int decToBin(int n) {
        int ans = 0, power = 0;
        while (n > 0) {
            ans = ans + ((n % 2) * (int) (Math.pow(10, power++)));
            n = n / 2;
        }
        return ans;
    }

    public static int binToDec(int n) {
        int ans = 0;
        int power = 0;
        while (n > 0) {
            ans = ans + ((n % 10) * (int) Math.pow(2, power++));
            n = n / 10;
        }
        return ans;
    }

    public static int max(int a, int b) {
        if (a > b)
            return a;
        return b;
    }

    public static int min(int a, int b) {
        if (a > b)
            return b;
        return a;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static float sum(int a, float b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void swap1(int a, int b) {
        int tm = a;
        a = b;
        b = tm;
        System.out.println("a: " + a + " b: " + b);
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int fact(int a) {
        if (a <= 1) {
            return 1;
        }
        return a * fact(a - 1);
    }

    public static int fact2(int a) {
        int ans = 1;
        for (int i = 1; i <= a; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int binomial(int n, int r) {
        int lob = fact(n);
        int hor = fact(r) * fact(n - r);
        return lob / hor;
    }

    public static boolean prime(int x) {
        int i = 2;
        while (i * i <= x) {
            if (x % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void prime_in_range(int a) {
        for (int j = 2; j <= a; j++) {
            if (prime(j))
                System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void prime_in_range(int a, int b) {
        for (int j = a; j <= b; j++) {
            if (prime(j))
                System.out.print(j + " ");
        }
        System.out.println();
    }
}
