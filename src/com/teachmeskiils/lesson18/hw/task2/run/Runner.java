package com.teachmeskiils.lesson18.hw.task2.run;

import com.teachmeskiils.lesson18.hw.task2.factory.ListFactory;
import com.teachmeskiils.lesson18.hw.task2.service.ListService;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = ListFactory.getListOfAllStudents();
        System.out.println("Default list: " + list);
        ListService.getAllNamesWhichStartsWithA(list);
        ListService.getSortedListAndReturnFirstElement(list);
    }
}
