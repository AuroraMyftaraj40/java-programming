package day19_class_vs_object_string;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        System.out.println(word.toLowerCase());
        System.out.println("CyberTek".toUpperCase());
        
        word.toLowerCase();
        System.out.println(word);
        
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
    }
}
