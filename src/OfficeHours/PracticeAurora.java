package OfficeHours;

public class PracticeAurora {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println("b = " + b);
        System.out.println("a = " + a);

        int a1 = 200;
        int b1 = -a1++ + --a1 * a1-- % 2 + a1;
        System.out.println("b1 = " + b1);
        System.out.println("a1 = " + a1);


        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        System.out.println("z = " + z);
        //Output:
        //65 is  by 2: false
        //65 is  by 3: false
        //65 is  by 5: true

        // Write a java program that can identify if a person is eligible to vote for the president. Age of voting: 18.
        // Print "Eligible to vote" or "not eligible to vote".

        int age = 18;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }
    }
}





