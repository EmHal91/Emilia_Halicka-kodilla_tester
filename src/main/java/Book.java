public class Book {
    private String author;
    private String title;

    public Book(){
        author = "Adam Mickiewicz";
        title = "Pan Tadeusz";
    }

    public static Book of(Book[] books) {
        Book book = new Book();
        System.out.println(book);
        return book;
    }

}




