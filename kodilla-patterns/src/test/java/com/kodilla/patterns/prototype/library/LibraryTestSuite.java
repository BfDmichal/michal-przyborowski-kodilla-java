package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Library");
        Book book = new Book("Wolf of the mountains","Dylan Murphy", LocalDate.of(2003,6,15));
        library.getBooks().add(book);
        library.getBooks().add(new Book("Phoebe Pearson","Slaves of dreams",LocalDate.of(2012,3,28)));
        library.getBooks().add(new Book("Gangsters and kings","Ryan Talley",LocalDate.of(2007,10,13)));
        library.getBooks().add(new Book("Unity without duty","Madelynn Carson",LocalDate.of(2007,9,03)));

        library.setName("First library");
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second library");
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        //deep copy
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Library");
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        //When
        library.getBooks().remove(book);
        //Then
        Assert.assertEquals(4,deepClonedLibrary.getBooks().size());
        Assert.assertEquals(3,library.getBooks().size());
        Assert.assertEquals(library.getBooks().size(),clonedLibrary.getBooks().size());
    }
}
