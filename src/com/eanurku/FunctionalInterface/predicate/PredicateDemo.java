package com.eanurku.FunctionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> check = x -> x > 10;
        boolean res1 = check.test(12);
        System.out.println(res1);

    }

}
