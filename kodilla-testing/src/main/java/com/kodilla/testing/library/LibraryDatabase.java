package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase  {
    public List<Book> listBookWithCondition(String titleFragment);
    public List<Book> listBookInHandsOf(LibraryUser libraryUser);
    public boolean rentABook(LibraryUser libraryUser, Book book);
    public int returnBooks(LibraryUser libraryUser);
}
