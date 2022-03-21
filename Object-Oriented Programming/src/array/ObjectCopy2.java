package array;

public class ObjectCopy2 {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태맥산맥", "조정래");
        library[1] = new Book("태맥산맥2", "조정래");
        library[2] = new Book("태맥산맥3", "조정래");
        library[3] = new Book("태맥산맥4", "조정래");
        library[4] = new Book("태맥산맥5", "조정래");

        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        for (int i = 0; i < library.length; i++){
            copyLibrary[i].setAuthor((library[i].getAuthor()));
            copyLibrary[i].setTitle((library[i].getTitle()));
        }

        library[0].setTitle("나목");
        library[0].setAuthor("박완서");

        for (Book book : library){
            book.showBookInfo();
        }
        System.out.println("=============");
        for (Book book : copyLibrary){
            book.showBookInfo();
        }
    }
}
