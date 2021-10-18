public class Book {
    private String author;
    private String title;

    public static void main(String[] args) {
    }
    public static String getAuthorName(String author){
        return author;
    }
    public static String getTitle(String title) {
        return title;
    }

    private static String getBookOf (String author, String title) {
       String author = Book.getAuthorName();
       String title = Book.getTitle();
       System.out.println(author + title);
       return author + title;
    }

}
