package com.kodilla.exception.nullpointer;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;

        MassageSender massageSender = new MassageSender();
        try {
            massageSender.sendMassageTo(user,"Hello");
        } catch (MassageNotSentException e) {
            System.out.println("Message is not send,"+
                    "but my program still running well!");
        }
        System.out.println("Processing other logic!");
    }
}
