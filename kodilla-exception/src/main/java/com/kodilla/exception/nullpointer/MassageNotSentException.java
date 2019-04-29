package com.kodilla.exception.nullpointer;

public class MassageNotSentException extends Exception{
    public MassageNotSentException(final String massage){
        super(massage);
    }
}
