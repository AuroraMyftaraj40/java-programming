package OfficeHours.day_05_12_21;

public class Bank {
    public static void main(String[] args) {
        Account bankAccountOne = new Account();
        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.pin = 1234 ;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.accountNumber = 238754865;

        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(1234));
        System.out.println(new Account().accountHolderName);//comes out null because there is no value assigned in the source class

        bankAccountOne = new Account();
        System.out.println(bankAccountOne.accountHolderName);
    }
}
