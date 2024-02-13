package chapter16;

public class L11 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("");
        for (char c = 'a'; c <= 'z'; c++) {
            st.append(c);
        }
        System.out.println(st);
        String stt = "ami valo nei";
        stt = fun(stt);
        System.out.println(stt);
        stt = "azaaabbbba";
        String sss = cmpre(stt);
        System.out.println(sss);
    }

    public static String fun(String s) {
        StringBuilder st = new StringBuilder("");
        char c = Character.toUpperCase(s.charAt(0));
        st.append(c);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                st.append(s.charAt(i));
                i++;
                char z = Character.toUpperCase(s.charAt(i));
                st.append(z);
            } else {
                st.append(s.charAt(i));
            }
        }
        return st.toString();
    }

    public static String cmpre(String a) {
        StringBuilder st = new StringBuilder("");
        for (int i = 0; i < a.length();) {
            st.append(a.charAt(i));
            int te = 1;
            if (i + 1 >= a.length()) {
                st.append(te);
                break;
            }
            while (a.charAt(i) == a.charAt(i + 1)) {
                i++;
                te++;
                if (i + 1 >= a.length()) {
                    break;
                }
            }
            st.append(te);
            i++;
        }
        return st.toString();
    }
}
