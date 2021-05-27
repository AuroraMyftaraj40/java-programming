package OfficeHours;

public class PersonInfo {
    public static void main(String[] args) {
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;


        name = "Saim";
        age = 50;
        gender = 'M';
        student = true;
        favoriteNumber = 3L;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
        fullBirthDate = "" + birthDate + "." + year;
        favoriteQuote = "have a good mindset";

        System.out.println(fullBirthDate);


    }
}
