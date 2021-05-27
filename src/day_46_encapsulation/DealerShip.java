package day_46_encapsulation;

public class DealerShip {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setModel("Nissan");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMillage(45230);
        System.out.println("car1 millage = " + car1.getMillage());

        System.out.println(car1.toString());
        System.out.println(car1);
    }
}
