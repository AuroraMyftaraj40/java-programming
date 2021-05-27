package day10_shorthand_operators;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month: ");
        int rent = scan.nextInt();
        scan.nextLine();// is fixing the bug in this case to allow to use enter and enter the value for the month
        String month = scan.nextLine();
        System.out.println("rent = "+ rent);
        System.out.println("month = " +month);

    }
}
