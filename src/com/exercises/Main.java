package com.exercises;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static double sum = 0;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("John");
        list.add("Doe");

//        1
        List<String> expected = list.stream()
                .map(each -> each.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(expected);

//        2
//        List<String> expected2 = list.stream()
//                .filter(each -> each.length() < 4)
//                .collect(Collectors.toList());
//        System.out.println(expected2);

//        3

//        List<List<String>> listList = Arrays
//                .asList(Arrays.asList("Victor", "Farcic"),
//                        Arrays.asList("John", "Doe", "Third"));
//        List<String> expected3 = listList.stream().flatMap(each -> each.stream()).collect(Collectors.toList());
//        System.out.println(expected3);

//        4
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("asd", 12));
//        personList.add(new Person("ASD", 22));
//        Integer max = personList.stream()
//                .map(each -> each.getAge())
//                .max((i, j) -> i.compareTo(j))
//                .get();
//        personList.stream().forEach(each -> {
//            if (each.getAge() == max)
//                System.out.println("The oldest person is " + each.getName());
//        });

//        5
//        ArrayList<Double> doubleArrayList = new ArrayList<>();
//        doubleArrayList.add(1.5);
//        doubleArrayList.add(2.0);
//        doubleArrayList.stream().forEach(each -> sum += each);
//        System.out.println("The sum is " + sum);

//        6
//        Person sara = new Person("Sara", 4);
//        Person viktor = new Person("Viktor", 40);
//        Person eva = new Person("Eva", 42);
//        Person anna = new Person("Anna", 5);
//        List<Person> personList6 = Arrays.asList(sara, eva, viktor, anna);
//        List<String> kidsNames = personList6.stream()
//                .filter(each -> each.getAge() < 18)
//                .map(each -> each.getName())
//                .collect(Collectors.toList());
//        System.out.println(kidsNames);

//        7
//        Map<Boolean, List<Person>> hashMap = new HashMap<>();
//        List<Person> kids = personList6.stream()
//                .filter(each -> each.getAge() < 18)
//                .collect(Collectors.toList());
//        List<Person> adults = personList6.stream()
//                .filter(each -> each.getAge() >= 18)
//                .collect(Collectors.toList());
//        hashMap.put(true, adults);
//        hashMap.put(false, kids);

//        8
//        Person sara1 = new Person("Sara", 4, "Norwegian");
//        Person viktor1 = new Person("Viktor", 40, "Serbian");
//        Person eva1 = new Person("Eva", 42, "Norwegian");
//        List<Person> personList8 = Arrays.asList(sara1, viktor1, eva1);
//        Map<String, List<Person>> hashMap1 = new HashMap<>();
//        hashMap1.put("Norwegian", groupByNationality(personList8, "Norwegian"));
//        hashMap1.put("Serbian", groupByNationality(personList8, "Serbian"));

//        9
//        List<Person> personList9 = Arrays.asList(sara, eva, viktor, anna);
//        String namesToString = personList9.stream()
//                .map(each -> each.getName())
//                .collect(Collectors.joining(", "));
//        System.out.println("Names: " + namesToString + ". ");


    }


    public static List<Person> groupByNationality(List<Person> list, String nationality) {
        List<Person> newPersonList = list.stream()
                .filter(each -> each.getNationality().equals(nationality))
                .collect(Collectors.toList());
        return newPersonList;
    }
}
