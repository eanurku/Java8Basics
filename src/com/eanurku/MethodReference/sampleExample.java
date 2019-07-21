package com.eanurku.MethodReference;

import java.util.ArrayList;
import java.util.List;

public class sampleExample {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("anurag");
        list.add("monu");
        list.add("sonu");


        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);

    }
}
