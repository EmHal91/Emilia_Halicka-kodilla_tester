public class Book {
    private static String author = "Adam Mickiewicz";
    private static String title = "Pan Tadeusz";

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        System.out.println(book);
        return book;
        }

    }





