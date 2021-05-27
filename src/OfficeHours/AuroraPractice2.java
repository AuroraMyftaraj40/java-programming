package OfficeHours;

public class AuroraPractice2 {
    public static void main(String[] args) {
        int a = 90;
        int b = 45;
        int c = 45;
        int triangle;
        triangle = a + b + c;
        if(triangle ==170){
            System.out.println("Valid triangle");
        }else {
            System.out.println("Not valid triangle");
        }

        //Create a program that will accept a year. Check if the year is a leap year.
        // If it is a leap year print "$year is a leap year" otherwise print "$year is not a leap year"
        int leapYear = 365/4;
        String year= "2020";
        if(year.equals(leapYear)){
            System.out.println("It is a leap year.");
        }else {
            System.out.println("It is not a leap year.");
        }

        //Write a program that will accept your salary amount. Then also ask the user if they are full time or not (boolean).
        // If they are fulltime add 20000 to their salary, but if they are part time then subtract 5000. Print the final salary.
        double fullTimeSalary = 20000;
        double partTimeSalary = fullTimeSalary - 5000;
        boolean fullTime = true;
        if(fullTime){
            System.out.println("Your salary is: " + fullTimeSalary);
        }else{
            System.out.println("Your salary is: " + partTimeSalary);
        }


            }

        }


