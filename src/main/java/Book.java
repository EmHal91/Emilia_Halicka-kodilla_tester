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

    public static String getOf() {
        author = author;
        title = title;
        if (author == author) {
            System.out.println(Book.author);
        }
        if (title == title) {
            System.out.println(Book.title);
        }
        return Book.author+ Book.title;
    }
}




