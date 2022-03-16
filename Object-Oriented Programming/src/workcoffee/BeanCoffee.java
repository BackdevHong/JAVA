package workcoffee;

public class BeanCoffee {

    int Money;

    public String buyingbean(int Money) {
        this.Money = Money;
        if (Money == Menu.BEANMERICANO) {
            return " 콩다방 아메리카노";
        } else if (Money == Menu.BEANLATTE) {
            return " 콩다방 라떼";
        } else {
            return null;
        }
    }
}
