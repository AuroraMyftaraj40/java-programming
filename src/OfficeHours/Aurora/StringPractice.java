package OfficeHours.Aurora;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//Write a return method that can find the frequency of characters
//
//Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

public class StringPractice {
    public static void main(String[] args) {
        frequencyStr("AAABBCDD");
    }
    public static String frequencyStr(String str){
        String nonDup= "", result = "";
        for(int i=0; i<str.length(); i++){
            if(!nonDup.contains("" + str.charAt(i))){
                nonDup+=str.charAt(i);

                for(int j=0; j<nonDup.length(); j++){
                    int num= Collections.frequency(Arrays.asList(str.split("")), ""+nonDup.charAt(j));
                    result+= ""+nonDup.charAt(j) + num;
                }
            }
        }
        return result;
    }
}
