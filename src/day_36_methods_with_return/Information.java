package day_36_methods_with_return;
import java.util.*;

public class Information {
    public static void main(String[] args) {
       fullName();
        System.out.println("Full name: " + fullName());


       isMarried();
        System.out.println("Is he married: " + isMarried());


       getAge();
        System.out.println("The age is: " + getAge());

        getRandomYear();
        System.out.println("Year " + getRandomYear(


        ));

    }
    //method 1 name: fullName
    //no parameters
    //returns: "Mike Smith"

    //method 2 name: isMarried
    //return: False

    //method 2 name: getAge
    //return: 35
    public static String fullName() {
      //  System.out.println("inside full name method");
        return "Mike Smith";//whenever there is return, it is exit from method. We print before return method

    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        int age=35;
        return age;//or return 35;
    }
    public static int getRandomYear(){
        Random random= new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;
    }

}
