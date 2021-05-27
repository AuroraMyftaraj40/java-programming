package OfficeHours.day_05_11_21;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "two"));
        System.out.println(findIndex(list, "two"));
        System.out.println(findIndex(list, "two", 2));
        System.out.println(findIndex(list, "two", findIndex(list, "two")+1));
    }

    public static int findIndex(ArrayList<String> words, String element) {
        int index = -1;// -1 is a value that does not exist, default value

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int findIndex(ArrayList<String> words, String element, int startIndex) {
        int index = -1;// -1 is a value that does not exist, default value

        for (int i = startIndex; i < words.size(); i++) {
            if (words.get(i).equals(element)) {
                index = i;
                break;
            }
        }
        return index;

    }
}