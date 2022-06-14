package cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student studentJ = new Student("james", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        Subway subwayGreen = new Subway(2);
        Subway subwayBlue = new Subway(4);
        Taxi taxi = new Taxi(123);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);
        studentE.takeTaxi(taxi);

        studentJ.showInfo();
        studentT.showInfo();
        studentE.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();

        subwayBlue.showSubwayInfo();
        subwayGreen.showSubwayInfo();

        taxi.showTaxiInfo();
    }
}
