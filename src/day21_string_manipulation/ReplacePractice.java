package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("h", "l").toUpperCase());
        
        word = word.replace("hub", "lab").toUpperCase();
        System.out.println("word = " + word);
        System.out.println(word.replace('I','O').replace('A', 'I'));
        
        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);
        sentence = sentence.replace("java", "selenium").replace("fun", "a lot of fun").replace(" ", "");
        System.out.println(sentence);
        
        
        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over", "");
        result = result.replace(",", "");
        result = result.replace("results for java book","");
        System.out.println("result = " + result);
    }
}
