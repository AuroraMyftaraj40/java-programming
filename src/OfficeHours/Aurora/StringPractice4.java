package OfficeHours.Aurora;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class StringPractice4 {
    public static void main(String[] args) {

    }
    public String altPairs(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result += str.substring(i, end);
        }
        return result;
    }
}
