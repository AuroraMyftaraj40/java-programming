package OfficeHours;
import java.util.*;
public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        // Do not touch above
        String shortestWord = str[0];
        for (String currentWord : str) {
            if (currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;

            }
        }
        System.out.println(shortestWord);
    }
}

