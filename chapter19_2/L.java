package chapter19_2;

public class L {

    public static void main(String[] args) {
        decreasing(3);
        increasing(4);
        System.out.println();
        System.out.println(fact(5));
        System.out.println(sum(5));
        System.out.println(fib(5));
        fib_series(5);
        int a[] = { 1, 2, 3, 4, 4, 9, 8, 4 };
        System.out.println(sorted(a, 0));
        System.out.println(first_occ(a, 0, 4));
        System.out.println(last_occ(a, 0, 4));
        System.out.println(power(5, 50));
        System.out.println(powerMore(5, 50));
        System.out.println(tilling(10));
        System.out.println(friends(10));
        String s = "aaaaaaaaaabbbbbbbbaaaaaaacccccccccccaaaaaabbbbbbbbbddddddddddddaaaaaaaarrrrrrrrrreeeeeeeeeee";
        StringBuilder sb = new StringBuilder();
        boolean map[] = new boolean[26];
        remove_duplicate(s, sb, map, 0);
        System.out.println(sb);
        s = new String();
        binaryString(s, 0, 5);
    }

    static void binaryString(String s, int last, int number) {
        if (number == 0) {
            System.out.println(s);
            return;
        }
        binaryString(s + "0", 0, number - 1);
        if (last == 0) {
            binaryString(s + "1", 1, number - 1);
        }
    }

    static void remove_duplicate(String s, StringBuilder sb, boolean map[], int idx) {
        if (idx == s.length()) {
            return;
        }
        if (map[s.charAt(idx) - 'a'] == false) {
            sb.append(s.charAt(idx));
            map[s.charAt(idx) - 'a'] = true;
        }
        remove_duplicate(s, sb, map, ++idx);
    }

    static int friends(int number) {
        if (number <= 2) {
            return number;
        }
        return friends(number - 1) + (number - 1) * friends(number - 2);
    }

    static int tilling(int number) {
        if (number <= 1) {
            return 1;
        }
        return tilling(number - 1) + tilling(number - 2);
    }

    static int powerMore(int m, int n) {
        if (n == 0) {
            return 1;
        }
        int x = powerMore(m, n / 2);
        if (n % 2 == 0) {
            return x * x;
        }
        return m * x * x;
    }

    static int power(int m, int n) {
        if (n == 0) {
            return 1;
        }
        return m * power(m, --n);
    }

    static int last_occ(int a[], int idx, int key) {
        if (a.length - 1 == idx) {
            return -1;
        }
        int x = last_occ(a, ++idx, key);
        if (x != -1) {
            return x;
        }
        if (a[idx] == key) {
            return idx;
        }
        return -1;
    }

    static int first_occ(int a[], int idx, int key) {
        if (idx == a.length) {
            return -1;
        }
        if (a[idx] == key) {
            return idx;
        }
        return first_occ(a, ++idx, key);
    }

    static boolean sorted(int a[], int idx) {
        if (idx == a.length - 1) {
            return true;
        }
        if (a[idx] > a[idx + 1]) {
            return false;
        }
        return sorted(a, ++idx);
    }

    static int fib(int n) {
        if (n <= 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static void fib_series(int n) {
        if (n == -1) {
            return;
        }

        fib_series(n - 1);
        System.out.print(fib(n) + " ");
    }

    static int sum(int n) {
        if (n == 0) {
            return n;
        }
        return n + sum(n - 1);
    }

    static int fact(int n) {
        if (n <= 1) {
            return n;
        }
        return n * fact(n - 1);
    }

    static void decreasing(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        decreasing(n - 1);
    }

    static void increasing(int n) {
        if (n == 0) {
            return;
        }
        increasing(n - 1);
        System.out.print(n + " ");
    }
}
