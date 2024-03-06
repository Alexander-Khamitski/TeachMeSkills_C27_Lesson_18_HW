package com.teachmeskiils.lesson18.hw.task2.service;

import java.util.List;
import java.util.stream.Collectors;

public class ListService {

    public static void getAllNamesWhichStartsWithA(List<String> list) {
        list = list.stream()
                .filter(name -> name.toLowerCase().startsWith("а"))
                .collect(Collectors.toList());
        System.out.println("List with names which starts with 'A': " + list);
    }

    public static void getSortedListAndReturnFirstElement(List<String> list) {
        System.out.println("First element in sorted list: " + list.stream().sorted().findFirst().get());
    }
}
