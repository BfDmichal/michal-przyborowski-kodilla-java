package com.kodilla.exception.nullpointer;

public class MassageSender {
    public void sendMassageTo(User user, String massage) throws MassageNotSentException {
        if (user != null) {
            System.out.println("Sending massage: " + massage + "to: " + user.getName());
        } else {
            throw new MassageNotSentException("User is null");
        }
    }
}