package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class BookTestSuite {

    @Test
    void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        assertEquals(3, numberOfBooksPublicatedAfter2007);
    }

    @Test
    void testGetListUsingIntStream() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size()) // [1]
                .filter(z -> books.get(z).getYearOfPublication() > 2007)             // [2]
                .map(z -> 1)                                                         // [3]
                .sum();                                                              // [4]
        assertEquals(3, numberOfBooksPublicatedAfter2007);                      // [5]
    }

    @Test
    void testGetListUsingIntStream1() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        long numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication() > 2007)
                .count();
        assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}