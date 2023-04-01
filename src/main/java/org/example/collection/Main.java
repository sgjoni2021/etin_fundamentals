package org.example.collection;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>();
//        System.out.println(list.size());
//        for (int i =0; i<5; i++){
//            list.add("bckdfj");
//        }
//        System.out.println(list.size());
//
//
//        for (int i = 0; i< list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        for (String element: list) {
//            System.out.println(element);
//        }
//        // list.iterator(); kthen nje object
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next().toString());
//        }

        Map<Integer,String> map = new HashMap<>();

//        map.put(1,"sonila");
//        System.out.println();
//        System.out.println(map.get(1));

        map.put(1,"etien");
//        System.out.println(map.get(1));

        Map<Integer,String> map1 = new TreeMap<>(map);
        map1.values();

        for (String element: map1.values()) {
            System.out.println(element);
        }
        System.out.println(map1.get(2));

    }

}
