package chapter16;

public class L8 {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if (s1 == s2) {
            System.out.println("EQUALS");
        } else
            System.out.println("NOt eqals");
        if (s1 == s3) {
            System.out.println("EQUALS");
        } else
            System.out.println("NOt eqals");

        if (s1.equals(s2))
            System.out.println("EQUALS");
        else
            System.out.println("NOt eqals");
        if (s1.equals(s3))
            System.out.println("EQUALS");
        else
            System.out.println("NOt eqals");
    }
}
