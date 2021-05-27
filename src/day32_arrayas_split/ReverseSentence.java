package day32_arrayas_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence="java is fun";
        String reverseSentenceArray = "";
        String[] sentenceArray = sentence.split(" ");
        for (int i = sentenceArray.length-1; i >= 0; i--) {
            reverseSentenceArray += sentenceArray[i]+" ";
        }
        System.out.println(reverseSentenceArray);

    }
}
