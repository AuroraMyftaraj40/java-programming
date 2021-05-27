package day_37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        repeatString("java", 3, '|');
    }

    public static void repeatString(String word, int times, char delimeter) {
        String repeat = "";
        for (int i = 0; i < times; i++) {
            repeat += word + delimeter;
            System.out.println(repeat);
        }

    }
}
