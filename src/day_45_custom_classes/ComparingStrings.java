package day_45_custom_classes;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java"; //in String Pool
        String word2 = "java"; //will reuse from String Pool
        String word3 = new String("java"); //create new Heap, outside String Pool

        System.out.println(word1 == word2);//true
        System.out.println(word1 == word3);//false

    }
}
