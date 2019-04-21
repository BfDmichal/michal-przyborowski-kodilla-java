package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public final class ForumUser {
    private final int peselID;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(final int peselID, final String name, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int numberOfPosts) {
        this.peselID = peselID;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth) ;
        this.numberOfPosts = numberOfPosts;
    }

    public int getPeselID() {
        return peselID;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public boolean isOlderThan(int age){
        LocalDate now = LocalDate.now();
        int ages = (int) ChronoUnit.YEARS.between(now,getDateOfBirth());
        boolean result = age>=ages;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "peselID=" + peselID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
