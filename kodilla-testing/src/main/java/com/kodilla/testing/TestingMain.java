package com.kodilla.testing;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.ArrayList;

public class TestingMain {
    public static void main(String[] args){
//        System.out.println("Test klasy Calculator:");
//        System.out.println("add method test:");
//        int resultAdd = Calculator.add(3,4);
//        int resultSubtract = Calculator.subtract(3,2);
//
//        if(resultAdd==7){
//            System.out.println("Calculator add method is ready to use");
//        }
//        else{
//            System.out.println("Error, problem with add method");
//        }
//        System.out.println("subtract method test:");
//        if (resultSubtract==1){
//            System.out.println("Calculator subtract method is ready to use");
//        }
//        else{
//            System.out.println("Error, problem with subtract method");
//        }
        OddNumbersExterminator allay = new OddNumbersExterminator();
        //When
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(7);
        ArrayList<Integer> list1 = allay.exterminator(list);
        //Then
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(7);

    }
}
