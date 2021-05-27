package OfficeHours.Aurora;
import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1= scan.nextLine();
        String word2= scan.nextLine();
        //apple, banana
        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0, 5));

    }


    }

