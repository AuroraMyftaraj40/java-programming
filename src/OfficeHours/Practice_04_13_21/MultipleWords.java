package OfficeHours.Practice_04_13_21;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoon, plates, cups, forks, pans, pot, trash can";
        String[] arrWords = words.split(", ");
        for (String eachWord : arrWords) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);

            }
            }
        }
    }