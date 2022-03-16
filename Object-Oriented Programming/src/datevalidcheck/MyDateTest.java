package datevalidcheck;

public class MyDateTest {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(2022,2,2);
        MyDate myDate2 = new MyDate(2022,30,2);
        MyDate myDate3 = new MyDate(2022,13,13);

        myDate1.showDate();
        myDate2.showDate();
        myDate3.showDate();

    }
}
