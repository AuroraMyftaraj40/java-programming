package OfficeHours.Practice_04_13_21;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Practice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many words will you enter");
        String[] words=new String[input.nextInt()];

        for(int i=0; i<words.length; i++){
            System.out.println("Enter word " + (i+1));
            words[i]=input.nextLine();

        }
        System.out.println(Arrays.toString(words));
        //String smallest, largest
        String[] smallAndLarge = new String[2];//null
        for(String each : words){
            if(each.length()< smallAndLarge[0].length()){
            }
        }
        System.out.println("Smallest " + smallAndLarge[0]);
        System.out.println("Largest " + smallAndLarge[1]);
        System.out.println(Arrays.toString(smallAndLarge));
    }
}
