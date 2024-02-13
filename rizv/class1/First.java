package rizv.class1;

public class First {
    public static void main(String a[]) {
        System.out.println("ami first er main");
        Second sss = new Second();
        sss.staticCharaHello2();
        sss.staticOalaHello2();
        sss.main(a);
        Second.staticOalaHello2();
        boolean t = true;
        while (t) {
            System.out.println("a");
            t = false;
        }

    }
}
