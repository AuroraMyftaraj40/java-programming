package day_49_static;

public class StaticTest {
   static String word = "java";

    public static void main(String[] args) {
        StaticMethods.displayMessage("wooden spoon");
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();
        System.out.println(word);
    }
}
