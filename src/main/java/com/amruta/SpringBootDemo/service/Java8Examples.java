package com.amruta.SpringBootDemo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Examples {



    public static void main(String[] args) {

        List<Map<Integer, String>> list = new ArrayList();

        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        Map<Integer, String> map3 = new HashMap<>();

        map1.put(1, "Indore");
        map1.put(2, "Amritsar");
        map1.put(3, "Pune");

        map2.put(4, "Mumbai");
        map2.put(5, "Akola");
        map2.put(6, "Kham");

        map3.put(7, "Delhi");
        map3.put(8, "Nanded");
        map3.put(9, "Luck");

        list.add(map1);
        list.add(map2);
        list.add(map3);

        System.out.println(" output : " + list.stream().flatMap(mapx -> mapx.values().stream()).collect(Collectors.toList()).stream().sorted().collect(Collectors.toList()));
    }

}
