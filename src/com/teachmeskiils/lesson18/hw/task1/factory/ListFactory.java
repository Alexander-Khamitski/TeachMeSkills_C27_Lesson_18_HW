package com.teachmeskiils.lesson18.hw.task1.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListFactory {

    public static List<Integer> getListWithRandomValues() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            int value = random.nextInt(0, 10);
            list.add(value);
        }
        return list;
    }
}
