package workcoffee;

public class Person {
    String Name;
    int Money;

    public Person(String Name, int Money){
        this.Name = Name;
        this.Money = Money;
    }

    public void buyStarCoffee(StarCoffee sc, int Money){
        String message = sc.buyingstar(Money);
        if (message != null){
            this.Money -= Money;
            System.out.println(Name + "님이 " + Money +"원으로"  + message + "을 구입하셨습니다.");
        }
    }
    public void buyBaenCoffee(BeanCoffee bc, int Money){
        String message = bc.buyingbean(Money);
        if (message != null){
            this.Money -= Money;
            System.out.println(Name + "님이 " + Money +"원으로"  + message + "을 구입하셨습니다.");
        }
    }

}
