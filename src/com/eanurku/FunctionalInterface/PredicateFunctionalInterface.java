package com.eanurku.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    public static void main(String[] args) {


        Predicate<Integer> allnum = n -> true;
        Predicate<Integer> evennum = n -> n%2==0;
        Predicate<Integer> oddnum = n -> n%2 != 0;

        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(22);
        list.add(12);
        list.add(2);
        list.add(11);
        list.add(10);


        counterFun(list,allnum);
        System.out.println();
        counterFun(list,evennum);
        System.out.println();
        counterFun(list,oddnum);

    }

    private static void  counterFun(List<Integer> list, Predicate<Integer> p) {


        list.forEach(n->{if(p.test(n)) System.out.println(n);});


    }
}
