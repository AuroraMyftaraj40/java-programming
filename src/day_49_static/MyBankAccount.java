package day_49_static;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class MyBankAccount {
    static double balance = 500.0;
    String user;

    public void spend(double amount) {
        System.out.println(user + " is spending $" + amount);
        balance -= amount;
    }

    public void showBalance() {
        System.out.println("Current balance = " + balance);
    }

}