package com.kodilla.exception.index;

import java.util.ArrayList;
import java.util.List;

public class IndexExceptionRunner {
    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> list = videoCollector.getCollection();

        if (list.size()>2) {
            String movie = list.get(0);
            System.out.println(movie);

            String anotherMovie = list.get(2);
            System.out.println(anotherMovie);
        }//
    }

}
