package day25_loops;

public class PrintStarts {
    public static void main(String[] args) {
        for(int i = 1; i<=15; i++){
            System.out.print("* ");

            System.out.println();
            String myStars="";
            for(int stars=1; stars <=5; stars++){
                myStars+="* ";
            }
            System.out.println("myStars = " + myStars.trim());
        }
    }
}
