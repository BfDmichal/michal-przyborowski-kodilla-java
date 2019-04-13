package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    ArrayList<Integer> evenList = new ArrayList<Integer>();


    public ArrayList<Integer> exterminator(ArrayList<Integer> numbers) {
        for (Integer in : numbers) {
            if (in % 2 != 0) {
                evenList.add(in);
            }
        }
        return evenList;
    }
}
