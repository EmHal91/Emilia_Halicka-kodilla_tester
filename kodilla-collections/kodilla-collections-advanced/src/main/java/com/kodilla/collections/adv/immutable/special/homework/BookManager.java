package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public static Book createBook (String title, String author) {
        Book book = new Book(title, author);
        for (Book books : bookList)
            if(books.equals(book))
                return books;
       bookList.add(book);
        return book;
    }

    static List<Book> bookList = new ArrayList<>();



}
