package chapter23;

import java.util.*;

public class L9 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(4);
        ls.add(5);
        mainlist.add(ls);
        ArrayList<Integer> ls2 = new ArrayList<>();
        ls2.add(98);
        ls2.add(521);
        mainlist.add(ls2);
        System.out.println(mainlist);
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> cur = mainlist.get(i);
            for (int j = 0; j < cur.size(); j++) {
                System.out.print(cur.get(j) + " ");
            }
            System.out.println();
        }
        mainlist.remove(1);
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> cur = mainlist.get(i);
            for (int j = 0; j < cur.size(); j++) {
                System.out.print(cur.get(j) + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> arr = mainlist.get(0);
        arr.remove(2);
        for (int i = 0; i < mainlist.size(); i++) {
            ArrayList<Integer> cur = mainlist.get(i);
            for (int j = 0; j < cur.size(); j++) {
                System.out.print(cur.get(j) + " ");
            }
            System.out.println();
        }
    }
}
