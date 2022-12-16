public class BookShelfTest {
    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("소드아트온라인 1기");
        bookQueue.enQueue("소드아트온라인 2기");
        bookQueue.enQueue("소드아트온라인 3기");
        bookQueue.enQueue("소드아트온라인 WOU(War Of UnderWorld)");
        bookQueue.enQueue("소드아트온라인 프로그레시브");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.getSize());
    }
}
