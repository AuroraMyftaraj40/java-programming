package day24_loops;
import java.util.Scanner;

public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int dollar = 0;
        while(dollar !=5){
            System.out.println("Give me 5 dollars");
            dollar = scan.nextInt();
        }
        System.out.println("Thank you!");

    }
}


