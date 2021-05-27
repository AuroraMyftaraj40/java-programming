package day09_scanner_practice;
import java.util.Scanner;

public class MilesToKmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The distance fromm house to store is:");
        double mileNum = scan.nextDouble();
        double kmNum = mileNum * 1.609;
        System.out.println("Distance from house to store is: " + kmNum);

    }
}
