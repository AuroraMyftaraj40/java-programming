package day_37_methods_overloading;

import java.util.Arrays;

public class OverLoadMain {
    public static void main(String[] args) {
        System.out.println("Hello from real main method");
        main(10);
        System.out.println(Arrays.toString(args));
    }
        public static void main(int num){
            System.out.println("num = " + num);
        }
    public static void main(boolean b) {
        System.out.println("b = " + b);
    }
}
