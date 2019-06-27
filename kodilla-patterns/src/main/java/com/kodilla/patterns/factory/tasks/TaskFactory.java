package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";
    public static Task makeTask( final String task){
        switch (task){
            case SHOPPING:
                return new ShoppingTask("shop","apples",3);
            case PAINT:
                return new PaintingTask("paint","black","london");
            case DRIVE:
                return new DrivingTask("taxi","paris","volvo");
            default:
                return null;
        }
    }
}
