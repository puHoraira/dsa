package chapter6;

public class L15 {
    public static void main(String[] args) {
        byte bb = 9;
        byte cc = 99;
        byte z = (byte) (bb + cc);// byte na dile hobe na
        System.out.println(z);
        short m = 5;
        char c = 'a';
        byte x = (byte) (m + c + bb);
        System.out.println(x);
        bb = 'a';
        cc = 'b';
        System.out.println(bb + cc);
        char ff = (char) ('a' + 'b');
        System.out.println(ff);

    }
}
