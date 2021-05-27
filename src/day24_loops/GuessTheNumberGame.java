package day24_loops;
import java.util.*;
//add a counter for the attempts
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;

        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();//randomNum.nextInt(101); for computer to play with itself
            if (guessingNumber > secretNumber) {
                System.out.println("Wrong number, is too large");
            } else if (guessingNumber < secretNumber) {
                System.out.println("Wrong number, is too small");
            }

        } while (secretNumber != guessingNumber) ;
            System.out.println("Congratulation! You won.");
        }
        }

