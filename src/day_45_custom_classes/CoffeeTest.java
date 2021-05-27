package day_45_custom_classes;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount " + myCoffee.getAmount());

        myCoffee.refill();
        System.out.println("Amount after refill = " + myCoffee.getAmount());

        myCoffee.drink(10);
        System.out.println("Amount after drink = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());

        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("Coffee1 Type = " + coffee1.getType());

        Coffee coffee2 = coffee1;
        System.out.println("Coffee2 Type = " + coffee2.getType());

        Coffee coffee3 = new Coffee();
        coffee1.setType("frappucino");
        coffee3=coffee2;
        System.out.println("Coffee3 Type = " + coffee3.getType());

        Coffee coffee4=null;
        coffee4.setType("Turkish");//null pointer exception

    }
}
