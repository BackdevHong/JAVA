package workcoffee;

public class StarCoffee {
    int money;

    public String buyingstar(int money){
        this.money = money;
        if (money == Menu.STARMERICANO){
            return " 스타벅스 아메리카노";
        } else if (money == Menu.STARLATTE){
            return " 스타벅스 라떼";
        } else {
            return null;
        }
    }
}
