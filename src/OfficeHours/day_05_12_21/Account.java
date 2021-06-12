package OfficeHours.day_05_12_21;

public class Account {
    String accountHolderName;
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int inputPin) {
        if(pin == inputPin){
            return balance;
        }
        return -1;
    }
}
