package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("****Welcome to TD Bank ATM****");
        int secretPincode = 1234;
        int inputPincode = 2234;

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your bank account!");
            System.out.println("You can check your balance and deposit.");
        } else {
            System.out.println("Incorrect pincode");
            System.out.println("Please try again");
        }
        System.out.println("");
        System.out.println("Thank you for using TD Bank ATM!");

    }
}
