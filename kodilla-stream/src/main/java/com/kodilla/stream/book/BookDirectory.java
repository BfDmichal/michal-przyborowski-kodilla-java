package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public class BookDirectory {
    private final List<Book> theList = new ArrayList<>();

    public BookDirectory(){
        theList.add(new Book("Dylan Murphy", "Wolf of the mountains", 2003, "0001"));
        theList.add(new Book("Phoebe Pearson", "Slaves of dreams", 2012, "0002"));
        theList.add(new Book("Morgan Walsh", "Obliteration of heaven", 2001, "0003"));
        theList.add(new Book("Aimee Murphy", "Rejecting the night", 2015, "0004"));
        theList.add(new Book("Ryan Talley", "Gangsters and kings", 2007, "0005"));
        theList.add(new Book("Madelynn Carson", "Unity without duty", 2007, "0006"));
        theList.add(new Book("Giancarlo Guerrero", "Enemies of eternity", 2009, "0007"));
    }
    public List<Book> getList(){
        return new ArrayList<>(theList);
    }
}
