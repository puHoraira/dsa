package chapter19;

import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // sc.nextLine();
        // decreasing(n);
        // System.out.println();
        // increasingF(n);
        // System.out.println();
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fibo(n));
        // for (int i = 1; i <= n; i++) {
        // System.err.print(fibo(i) + " ");
        // }
        // System.out.println();
        // int a[] = { 1, 2, 3, 2, 5 };
        // System.out.println(sorted(a, 0));
        // System.out.println(firstOcc(a, n, 0));
        // System.out.println(lastOcc(a, n, a.length - 1));
        // System.out.println(lastOcc2(a, 2, 0));
        // System.out.println(powers(n, n));
        // System.out.println(powers2(n, n));
        // .out.println(tilling(n));
        // String s = sc.nextLine();
        // StringBuilder sb = new StringBuilder("");
        // duplicate(s, 0, sb, new boolean[26]);
        // System.out.println(friends(n));
        printString(n, 0, new String());
        // System.out.println("______________");
        // printString2(n, 1, new String());
        sc.close();
    }

    static void printString(int n, int last, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printString(n - 1, 0, str + "0");
        if (last == 0) {
            printString(n - 1, 1, str + "1");
        }
    }

    static void printString2(int n, int last, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        printString(n - 1, 1, str + "1");
        if (last == 1) {
            printString(n - 1, 0, str + "0");
        }

    }

    static int friends(int n) {
        if (n <= 2) {
            return n;
        }
        return friends(n - 1) + ((n - 1) * friends(n - 2));
    }

    static void duplicate(String s, int idx, StringBuilder sb, boolean map[]) {
        if (idx == s.length()) {
            System.out.println(sb);
            return;
        }
        char c = s.charAt(idx);
        if ((map[c - 'a']) == false) {
            sb.append(c);
            map[c - 'a'] = true;

        }
        duplicate(s, ++idx, sb, map);

    }

    static int tilling(int n) {
        if (n <= 1) {
            return 1;
        }
        int hori = tilling(n - 2);
        int vert = tilling(n - 1);
        return hori + vert;
    }

    static long powers2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        long z = powers2(x, n / 2);
        if (n % 2 == 0) {
            return z * z;
        } else {
            return x * z * z;
        }
    }

    static long powers(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * powers(x, n - 1);
    }

    static int firstOcc(int a[], int key, int i) {
        if (i >= a.length) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return firstOcc(a, key, ++i);

    }

    static int lastOcc(int a[], int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return lastOcc(a, key, --i);

    }

    static int lastOcc2(int a[], int key, int i) {
        if (i == a.length) {
            return -1;
        }
        int x = lastOcc2(a, key, i + 1);
        // if ((a[i] == key)) {
        // return i;
        // }
        if (x != -1) {
            return x;
        }
        if ((a[i] == key)) {
            return i;
        }
        return -1;
    }

    static void decreasing(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        decreasing(n - 1);
    }

    static void increasingF(int n) {
        if (n == 0) {
            return;
        }
        increasingF(n - 1);
        System.out.print(n + " ");
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int x = fibo(n - 1);
        int y = fibo(n - 2);
        return x + y;
    }

    static boolean sorted(int a[], int i) {
        if (i >= a.length - 1) {
            return true;
        }
        if (a[i] <= a[i + 1]) {
            i++;
            return sorted(a, i);
        }
        return false;
    }
}
