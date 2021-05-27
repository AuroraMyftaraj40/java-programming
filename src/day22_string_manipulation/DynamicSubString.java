package day22_string_manipulation;

public class DynamicSubString {
    public static void main(String[] args) {
        String word = "I stared [java] today";
        int start = word.indexOf("[");
        int end = word.indexOf("]");
        System.out.println(word.substring(start+1, end));

    }
}
