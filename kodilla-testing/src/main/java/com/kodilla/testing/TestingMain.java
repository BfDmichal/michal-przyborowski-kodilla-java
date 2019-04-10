package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Test klasy Calculator:");
        System.out.println("add method test:");
        int resultAdd = Calculator.add(3,4);
        int resultSubtract = Calculator.subtract(3,2);

        if(resultAdd==7){
            System.out.println("Calculator add method is ready to use");
        }
        else{
            System.out.println("Error, problem with add method");
        }
        System.out.println("subtract method test:");
        if (resultSubtract==1){
            System.out.println("Calculator subtract method is ready to use");
        }
        else{
            System.out.println("Error, problem with subtract method");
        }
    }
}
