package OfficeHours.Aurora;

public class StringPractice2 {
    public static void main(String[] args) {
        //james bond
        String fName = "james";
        String lName = "bond";
        System.out.println(fName.substring(0, 1).toUpperCase() + lName.substring(0, 1).toUpperCase());


        String fullName = "james bond";

        String firstInitial = fullName.substring(0, 1).toUpperCase();
        String lastInitial = fullName.substring(fullName.indexOf(" ") + 1,
                fullName.indexOf(" ") + 2).toUpperCase();

        System.out.println("Your initials are: " + firstInitial + lastInitial);
        int z=5;
        for(int i=5; i>0; i--){
            z+=i;
        }
        System.out.println(z);
        }
    }

