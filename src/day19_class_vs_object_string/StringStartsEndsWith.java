package day19_class_vs_object_string;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.endsWith("idea"));


        String firstName = "Dr. Nadir";

        if (firstName.startsWith("Dr.")) {
            System.out.println("He is a doctor");
        } else if (firstName.startsWith("Mr.")) {
            System.out.println("He is a man");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("She is a woman");
        } else if (firstName.startsWith("Mis.")) {
            System.out.println("She is an unmarried woman");
        } else if (firstName.startsWith("Sr.")) {
            System.out.println("He is a senior");
        }
    }
}

