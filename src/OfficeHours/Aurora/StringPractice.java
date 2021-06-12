package OfficeHours.Aurora;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//Write a return method that can find the frequency of characters
//
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

public class StringPractice {
    public static void main(String[] args) {
        String str= "AAABBCDD";
        System.out.println(FrequencyOfChars(str) );

    }
    public static String FrequencyOfChars(String str){
        int j= 0;

        String expectedStr= "";
        while(j<str.length() ){
            int count= 0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)==str.charAt(j) ){
                    count++;
                }
            }
            expectedStr += ""+str.charAt(j)+ count;
            str= str.replace(""+str.charAt(j) ,"") ;
        }
        return expectedStr ;
    }
}
