package OfficeHours;

public class CampusHours {
    public static void main(String[] args) {
        //Campus time: User enters a time(hour in 24 hour format) and will be able to find out if the campus is open or not
        //> Campus is open from 8 am(8) to 11 pm (23)
        //> If user enters a time within the open time they should see message : “open” but if the time entered is outside
        // of operating hours they should see: “ closed”
        //> If the user enters an invalid hour (negative number or more than 24 hours) they should see an error message: “invalid time”
        int time= 24;
        if(time>=8 && time >=23){
            System.out.println("Open");
        }else if(time>=8 && time>=23){
            System.out.println("Closed");
        }else{
            System.out.println("Invalid time");
        }
        //BMI: Program will ask user to enter their mass (kilogram) and their height (meters). Calculate their
        // BMI and then print the appropriate message based on the provided values: All numbers taken as doubles
        //—> BMI Formula: BMI = mass / height^2
        //—> Values:
        //Less than 18.5 — Underweight
        //From 18.5 to 25 — Normal weight
        //From 25 to 30 — Overweight
        //More than or equal to 30 — Obese
        double mass=60.7;
        double height=1.65;
        double formulaBMI=mass/(height*2);
        System.out.println("BMI " + formulaBMI);
        if(formulaBMI<18.5){
            System.out.println("Underweight");
        }else if(formulaBMI<=18.5 && formulaBMI>=25){
            System.out.println("Normal weight");
        }else if(formulaBMI<=25 && formulaBMI>=30){
            System.out.println("Overweight");
        }else if(formulaBMI>=30){
            System.out.println("Obese");
        }
        //Write a program that will ask the user to enter three numbers.
        //If the numbers are the same print “All integers are the same”
        //If they are not equal, print which is the biggest value of the three numbers
        //—> If there is two numbers which are the largest print the one that came first
        //> Input: 3,2,6
        //> Output: The biggest number from 3, 2 and 6 is: 6

    }
}
