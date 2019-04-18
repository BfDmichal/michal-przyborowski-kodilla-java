package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int quantitiyOfBooks){
        List<Book> resultList = new ArrayList<Book>();
        for(int i = 0; i<quantitiyOfBooks;i++ ){
            Book book = new Book("Title"+i,"Author"+i,1970+i);
            resultList.add(book);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf4Books = generateListOfNBooks(4);
        when(libraryDatabaseMock.listBookWithCondition("Secret")).thenReturn(resultListOf4Books);
        //When
        List<Book> theList = bookLibrary.listBooksWithCondition("Secret");
        //Then
        Assert.assertEquals(4,theList.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOf0Books = generateListOfNBooks(0);
        List<Book> listOf10Books = generateListOfNBooks(10);
        List<Book> listOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBookWithCondition(anyString())).thenReturn(listOf10Books);
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks")).thenReturn(listOf0Books);
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks")).thenReturn(listOf40Books);
        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("Any Title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //Then
        Assert.assertEquals(0,theListOfBooks0.size());
        Assert.assertEquals(10,theListOfBooks10.size());
        Assert.assertEquals(0,theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBookWithCondition(anyString())).thenReturn(resultListOf10Books);
        //When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("an");
        //Then
        Assert.assertEquals(0,theListOfBooks10.size());
        Mockito.verify(libraryDatabaseMock,times(0)).listBookWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf0(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("adam","adam1","222");
        List<Book> list = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBookInHandsOf(libraryUser)).thenReturn(list);
        //When
        List<Book> temporary = bookLibrary.listBookInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(0,temporary.size());
    }
    @Test
    public void testListBooksInHandsOf1(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("adam","adam1","222");
        List<Book> list = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBookInHandsOf(libraryUser)).thenReturn(list);
        //When
        List<Book> temporary = bookLibrary.listBookInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(1,temporary.size());

    }
    @Test
    public void testListBooksInHandsOf5(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("adam","adam1","222");
        List<Book> list = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBookInHandsOf(libraryUser)).thenReturn(list);
        //When
        List<Book> temporary = bookLibrary.listBookInHandsOf(libraryUser);
        //Then
        Assert.assertEquals(5,temporary.size());
    }
}
