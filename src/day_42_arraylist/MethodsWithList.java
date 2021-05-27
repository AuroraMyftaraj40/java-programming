package day_42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        words.add("title");

        printStringList(words);

        printStringList(Arrays.asList("select", "options", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23,45,67,75,54567,343,775,33,3,6,8);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }

    public static void printStringList(List<String> str) {
        for (String each : str) {
            System.out.print(each + " ");
        }
        System.out.println();
    }

    public static int sumIntegerList(List<Integer> list) {
       int sum = 0;
       for(int i : list){
           sum += i;
       }
       return sum;
    }
}

