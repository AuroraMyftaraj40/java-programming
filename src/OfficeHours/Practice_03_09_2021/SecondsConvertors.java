package OfficeHours.Practice_03_09_2021;
import java.util.Scanner;

public class SecondsConvertors {
    public static void main(String[] args) {
        int inputSeconds, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds: ");
         inputSeconds = scan.nextInt(); // 3695

        hours = inputSeconds/3600; //3965 / 3600 = 1 hour
        inputSeconds %= 3600;//95
        minutes = inputSeconds/60; // 95/60 = 1 minute
        inputSeconds %= 60; // 35
        seconds = inputSeconds;

        System.out.println(hours + "hours, " + minutes + "seconds, " + seconds + "seconds");


    }

}
