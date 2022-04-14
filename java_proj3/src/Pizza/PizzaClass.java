package Pizza;

public class PizzaClass {
    private String topping;
    private int rad;
    static final double PI = 3.14;
    static int count = 0;

    public PizzaClass(String topping){
        this.topping = topping;
        count++;
    }

}
