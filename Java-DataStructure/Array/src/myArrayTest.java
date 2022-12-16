public class myArrayTest {
    public static void main(String[] args) {
        myArray arr = new myArray(10);
        arr.addElement(10);
        arr.addElement(9);
        arr.addElement(8);
        arr.addElement(7);
        arr.addElement(6);
        arr.addElement(5);

        arr.insertElement(2, 2);
        arr.deleteElement(2);
        arr.checkMyArr();
        System.out.println("==================");
        System.out.println(arr.getCount());
    }
}
