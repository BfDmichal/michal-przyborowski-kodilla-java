package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3)  {
            return bookList;
        }
        List<Book> list = libraryDatabase.listBookWithCondition(titleFragment);
        if (list.size() > 20) return bookList;
        bookList = list;
        return bookList;
    }
    public List<Book> listBookInHandsOf(LibraryUser libraryUser){
        List<Book> list = new ArrayList<>();
        list = libraryDatabase.listBookInHandsOf(libraryUser);
        return list;
    }
}
