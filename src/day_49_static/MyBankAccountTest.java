package day_49_static;


import OfficeHours.day_05_12_21.Account;

public class MyBankAccountTest {
    public static void main(String[] args) {
        MyBankAccount husband = new MyBankAccount();
        husband.user = "husband";
        husband.showBalance();
        husband.spend(100.0);
        husband.showBalance();

        MyBankAccount wife = new MyBankAccount();
        wife.user = "wife";
        wife.showBalance();
        wife.spend(100.0);
        wife.showBalance();

        husband.showBalance();
    }
}
