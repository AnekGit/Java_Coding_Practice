package java_practice.generics;

import java.util.ArrayList;

/**
 * created by ANEK on Tuesday 8/30/2022 at 2:15 PM
 */

public class GenericsEx {
    public static void main(String[] args) {

        ArrayList<? extends Number> numbers = new ArrayList<>();
       // numbers.add(new Integer(12));

        ArrayList<? extends Number> numbers2 = new ArrayList<Integer>();
       // numbers2.add(new Integer(12));

        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(new Integer(12));


        ArrayList<? super String> ll = new ArrayList<Object>();
        ll.add("aa");
       // ll.add(new Object());

        ArrayList<Integer> p = new ArrayList<Integer>();
                p.add(new Integer(12)) ;
         m1(p);

    }
    public static void m1(ArrayList<? extends Number> l){
        System.out.println(l.get(0));
        l.forEach(System.out::println);
    }
}
