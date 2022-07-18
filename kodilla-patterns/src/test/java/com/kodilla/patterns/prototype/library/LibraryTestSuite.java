package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        library.getBooks().add(new Book("Robinson Crusoe", "Daniel Defoe", LocalDate.of(1719,1,1)));
        library.getBooks().add(new Book("The Picture of Dorian Gray", "Oscar Wilde", LocalDate.of(1891,1,1)));
        library.getBooks().add(new Book("Dracula", "Bram Stoker", LocalDate.of(1897,1,1)));
        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), clonedLibrary.getBooks());
        assertEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }

}
