package day08_casting_scaner;

public class ShopingBalanceCalculator {
    public static void main(String[] args) {
        double balance= 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;

       // double remainingBalance = balance - price1 - price2 - price3;
        double remainingBalance = balance - (price1 - price2 - price3);
        System.out.println("Your initial balance is: $" + balance);
        System.out.println("Your remaining balance is: $" + remainingBalance);

        int balanceWithNoCents = (int)remainingBalance;
        System.out.println(balanceWithNoCents);


    }
}
