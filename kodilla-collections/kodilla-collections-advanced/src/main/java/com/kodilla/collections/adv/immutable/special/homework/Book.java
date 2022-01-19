package com.kodilla.collections.adv.immutable.special.homework;

import java.util.Objects;

public class Book {
    private String title;
    private String author;

    public String getTitle(){return title;}

    public String getAuthor(){return author;}

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor (String author) {
        this.author = author;
    }

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }

    public boolean equals (Object Book){
        if (this == Book)
            return true;
        if (Book == null || getClass() !=Book.getClass())
            return false;
        Book book = (Book) Book;
        return Objects.equals(title, book.title)
        && Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(title,author);
    }

}
