package chapter17;

public class L8 {
    public static void main(String[] args) {
        System.out.println("ODD/EVEN");
        checker(12);
        System.out.println("ODD/EVEN");
        checker(13);
        System.out.println("Getbit");
        getbit(14, 3);
        System.out.println("Getbit");
        getbit(15, 3);
        System.out.println("Getbit");
        getbit(16, 3);
        System.out.println("Clearbit");
        clearbit(16, 5);
        System.out.println("Clearbit");
        clearbit(20, 3);
        System.out.println("Clearbit");
        clearbit(23, 4);
        // 10011
        // setbit();
        // updatebit();
        SetLastithBit(16, 3);
        clearRangeBit(31, 2, 4);
    }

    public static void checker(int n) {
        int x = n & 1;
        if (x == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static int decToBin(int number) {
        int ans = 0;
        int power = 0;
        do {
            ans += (number % 2) * Math.pow(10, power++);
            number = number / 2;
        } while (number != 0);
        return ans;
    }

    public static int getbit(int number, int n) {
        int x = decToBin(number);
        System.out.println(x);
        int m = 1 << (n - 1);
        if ((number & m) == 0) {
            System.out.println("n th number bit is 0");
            return 0;
        } else {
            System.out.println("n th number bit is 1");
            return 1;
        }
    }

    public static int setbit(int number, int n) {
        System.out.println(decToBin(number));
        int m = 1 << (n - 1);
        number = number | m;
        System.out.println("number is: " + number);
        return number;
    }

    public static int clearbit(int number, int n) {
        System.out.println(decToBin(number));
        int m = 1 << (n - 1);
        m = ~m;
        number = number & m;
        System.out.println("number is: " + number);
        return number;
    }

    public static int updatebit(int number, int n, int updateto) {
        System.out.println(decToBin(number));
        int m = 1 << (n - 1);
        m = ~m;
        number = number & m;
        System.out.println(decToBin(number));
        m = updateto << (n - 1);
        number = number | m;
        System.out.println(decToBin(number));
        System.out.println("number is: " + number);
        return number;
    }

    public static int clearLastithBit(int number, int bits) {
        for (int i = 1; i <= bits; i++) {
            number = clearbit(number, i);
        }
        System.out.println(decToBin(number));
        System.out.println(number);
        return number;
    }

    public static int SetLastithBit(int number, int bits) {
        for (int i = 1; i <= bits; i++) {
            number = setbit(number, i);
        }
        System.out.println(decToBin(number));
        System.out.println(number);
        return number;
    }

    public static int clearRangeBit(int number, int start, int end) {
        System.out.println("Hi");
        int a = ((~0) << (end + 1));
        int b = (1 << start) - 1;
        int banano = a | b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(decToBin(number));
        System.err.println(decToBin(number & banano));
        System.out.println(number & banano);
        return number & banano;
    }

}
