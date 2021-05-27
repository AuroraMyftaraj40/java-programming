package day20_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.length());

        String company = "Cybertek";
       // System.out.println("first letter: " + company.charAt(0));
       // System.out.println("second letter: " + company.charAt(1));

        char firstLetter = company.charAt(0);
        System.out.println("firstLetter = " + firstLetter);
        
        char secondLetter = company.charAt(1);
        System.out.println("secondLetter = " + secondLetter);
        
        char thirdLetter = company.charAt(2);
        System.out.println("thirdLetter = " + thirdLetter);
        
        char fourthLetter = company.charAt(3);
        System.out.println("fourthLetter = " + fourthLetter);
        
        char fifthLetter = company.charAt(4);
        System.out.println("fifthLetter = " + fifthLetter);
        
        char sixthLetter = company.charAt(5);
        System.out.println("sixthLetter = " + sixthLetter);
        
        char seventhLetter = company.charAt(6);
        System.out.println("seventhLetter = " + seventhLetter);

        char eighthLetter = company.charAt(7);
        System.out.println("eighthLetter = " + eighthLetter);

        System.out.println("");

        System.out.println(firstLetter + " " + secondLetter + " " + thirdLetter + " " + fourthLetter + " " + fifthLetter +
                " " + sixthLetter + " " + seventhLetter + " " + eighthLetter);


        
    }
}
