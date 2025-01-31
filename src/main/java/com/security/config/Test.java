package com.security.config;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {

        String s  = "hihello";



        Map<String ,Long> data =  Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new,Collectors.counting()));

        String s1=    data.entrySet().stream().filter(x->x.getValue() ==1).map(d->d.getKey()).findFirst().get();

        System.out.println("Non repeat " + s1);

    }
}
