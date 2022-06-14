package workcoffee;

public class CoffeeTest {
    public static void main(String[] args) {
        Person personkim = new Person("김졸려",4000);
        Person personpg = new Person("이피곤", 4500);

        StarCoffee star = new StarCoffee();
        BeanCoffee bean = new BeanCoffee();

        personkim.buyStarCoffee(star, 4000);
        personpg.buyBaenCoffee(bean, 4500);

    }
}
