package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Book hobbit = new Book("J.R.R. Tolkien", "Hobbit", 1987, "1234");
        Book panTadeusz = new Book("Adam Mickiewicz", "Pan Taduesz", 1878, "4321");
        Book harryPotter = new Book("J.K. Rowling", "Harry Potter", 1998, "5678");
        Book wiedzmin = new Book("Andrzej Sapkowski", "Wiedźmin", 1995, "8765");
        Book diuna = new Book("Frank Herbert", "Diuna", 1965, "1289");
        Set<Book> books = new HashSet<>();
        books.add(hobbit);
        books.add(panTadeusz);
        books.add(harryPotter);
        books.add(wiedzmin);
        books.add(diuna);
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1987, median);
    }
}
