package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("태맥산맥", "조정래");
        library[1] = new Book("태맥산맥2", "조정래");
        library[2] = new Book("태맥산맥3", "조정래");
        library[3] = new Book("태맥산맥4", "조정래");
        library[4] = new Book("태맥산맥5", "조정래");

        System.arraycopy(library,0,copyLibrary,0,5);

//        for( Book book : copyLibrary ) { // 향상된 for 문
//            book.showBookInfo();
//        }
    
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
