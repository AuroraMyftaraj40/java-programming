package day32_arrayas_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        //   0    1      2       3
        String words = "java,python,selenium,html";
        String[] wordArray = words.split(",");
        System.out.println(Arrays.toString(wordArray));
        System.out.println("Length of array = " + wordArray.length);

        for(String each : wordArray){
            System.out.println(each);
        }
        String sentence = "today:class:is:java:class";
        String[] wordInSentence= sentence.split(":");
        System.out.println("first word: " + wordInSentence[0]);
        System.out.println("number of words in sentence: " + wordInSentence.length);

        for(String each:wordInSentence){
            System.out.println(each);
        }
    }

}
