package com.teachmeskiils.lesson18.hw.task1.run;

import com.teachmeskiils.lesson18.hw.task1.factory.ListFactory;
import com.teachmeskiils.lesson18.hw.task1.service.ListService;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Integer> list = ListFactory.getListWithRandomValues();
        System.out.println("Default list: " + list);
        ListService.getDistinctValues(list);
        ListService.getEvenElementsWithinRangeFrom7To17(list);
        ListService.getEachElementMultipliedBy2(list);
        ListService.getSortedFirst4Elements(list);
        ListService.getElementCountInStream(list);
        ListService.getStreamAverage(list);
    }
}
