package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book = BookManager.createBook("Potop", "Sienkiewicz");
        Book book1 = BookManager.createBook("Pan Tadeusz", "Mickiewicz");
        Book book2 = BookManager.createBook("Potop", "Sienkiewicz");
        System.out.println(book==book1);
        System.out.println(book.equals(book1));
        System.out.println(book==book2);
        System.out.println(book.equals(book2));
    }

    }

