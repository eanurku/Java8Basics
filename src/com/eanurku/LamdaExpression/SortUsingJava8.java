package com.eanurku.LamdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingJava8 {

    public static void main(String[] args) {

        System.out.println("welcome to java 8");


        List<String> listJav7 = new ArrayList<>();
        listJav7.add("anurag");
        listJav7.add("monu");
        listJav7.add("sonam");
        listJav7.add("gonu");
        listJav7.add("sonu");
        List<String> listJav8 = new ArrayList<>();
        listJav8.add("anurag");
        listJav8.add("monu");
        listJav8.add("sonam");
        listJav8.add("gonu");
        listJav8.add("sonu");

        Collections.sort(listJav7, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });
        Collections.sort(listJav8,(s, t) -> s.compareTo(t));

        System.out.println(listJav7);
        System.out.println(listJav8);


    }
}
