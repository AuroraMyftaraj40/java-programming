package day09_scanner_practice;
import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperature outside is:");
        double celsius = scan.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temp outside is:" + fahrenheit);
        System.out.println(fahrenheit + "F is C" + celsius);

    }
}
