public class BookAuthor {
    public static void main(String[] args) {
        Book book = new Book();
        String author = book.getAuthorName("Adam Mickiewicz");
        System.out.println(author);

        String title = book.getTitle("Pan Tadeusz");
        System.out.println(title);
    }
    public static void getBook(String author, String title) {
        Book book = new Book ();
        System.out.println();
    }
}
