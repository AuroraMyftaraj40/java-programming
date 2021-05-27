package day29_nestedLoop_arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int minutes = 1; minutes<=5; minutes++){
            System.out.println("\nminutes = " + minutes);
            for(int seconds = 1; seconds<=60; seconds++){
                System.out.print(seconds+ " ");
            }
        }
        for(int min = 0; min<=2; min++){
            for(int sec=0; sec<=59;sec++){
                System.out.println(min+":"+sec);
            }
        }
    }
}
