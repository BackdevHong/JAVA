package Pizza;

public class Pizza {

    public static void main(String[] args) {
        PizzaClass pz = new PizzaClass("A");
        PizzaClass pz2 = new PizzaClass("B");
        PizzaClass pz3 = new PizzaClass("C");

        int count = PizzaClass.count;
        System.out.println(count);
    }

}
