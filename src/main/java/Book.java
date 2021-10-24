public class Book {
    private static String author = "Adam Mickiewicz";
    private static String title = "Pan Tadeusz";

    public Book() {
            this.author = author;
            this.title = title;
            System.out.println(author + title);
        }
    public static void main(String [] args) {
        Book book = new Book();
    }

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
        }
    }





