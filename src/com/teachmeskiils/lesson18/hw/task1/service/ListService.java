package com.teachmeskiils.lesson18.hw.task1.service;

import java.util.List;
import java.util.stream.Collectors;

public class ListService {

    public static void getDistinctValues(List<Integer> list) {
        list = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("List with unique values: " + list);
    }

    public static void getEvenElementsWithinRangeFrom7To17(List<Integer> list) {
        list = list.stream()
                .limit(18)
                .skip(7)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("List with even elements within range from 7 to 17: " + list);
    }

    public static void getEachElementMultipliedBy2(List<Integer> list) {
        list = list.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList());
        System.out.println("List with each element multiplied by 2: " + list);
    }

    public static void getSortedFirst4Elements(List<Integer> list) {
        list = list.stream()
                .limit(4)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("List with with sorted first 4 elements: " + list);
    }

    public static void getElementCountInStream(List<Integer> list) {
        System.out.println("Element count in stream: " + list.stream().count());
    }

    public static void getStreamAverage(List<Integer> list) {
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
        System.out.println("List average: " + average);
    }
}
