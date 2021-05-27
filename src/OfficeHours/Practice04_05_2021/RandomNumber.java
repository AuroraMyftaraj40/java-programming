package OfficeHours.Practice04_05_2021;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        String myRandomNumber = "";

        while(myRandomNumber.length() !=6){
            int eachRandom= random.nextInt(10);

            if(!myRandomNumber.contains(""+eachRandom)){
                myRandomNumber += eachRandom;

            }
        }
        System.out.println("Random Number:" + myRandomNumber);
    }
}
