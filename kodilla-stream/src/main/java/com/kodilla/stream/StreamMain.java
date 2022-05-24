package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;

import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {
        BookDirectory bookDirectory = new BookDirectory();

        String resultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(resultStringOfBooks);

    }
}