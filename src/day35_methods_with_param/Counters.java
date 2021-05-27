package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(5);
        count(8);
        int num2= 999;
        count(num2);
        String word="wooden spoon";
        count(word.length());

        printAge(1981);
        int birthYear = 1981;
        printAge(birthYear);

    }


    /** * method name: count
     * input: int num
     * it prints from 0 to num in same line
     */
    public static void count(int num){
        for(int i=0; i<= num; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    /**
     * method name: printAge
     * @param/input: int year
     * Birth year: 1981. Age: 40
     */
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("Birth year " + year + ". Age " + age);
    }
}
