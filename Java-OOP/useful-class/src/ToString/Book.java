package ToString;

public class Book {
    private String author;
    private String bookName;

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "author='" + author + '\'' + ", bookName='" + bookName + '\'';
    }
}
