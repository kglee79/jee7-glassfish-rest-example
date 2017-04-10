package com.sit.rest;

import com.sit.rest.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookManager {
    private static List<Book> books = new ArrayList<>();

    static {
        Book b = new Book();
        b.setId(1);
        b.setAuthor("Charles Dickens");
        b.setTitle("Great Expectations");
        books.add(b);

        b = new Book();
        b.setId(2);
        b.setAuthor("Mark Twain");
        b.setTitle("Tom Sawyer");
        books.add(b);
    }

    static Book getBookWithId(int id) {
        Optional<Book> book = books.stream().filter(b -> b.getId() == id).findFirst();
        return book.orElse(null);
    }

    static List<Book> getAllBooks() {
        return books;
    }
}
