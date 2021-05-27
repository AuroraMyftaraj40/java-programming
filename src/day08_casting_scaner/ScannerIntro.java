package day08_casting_scaner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       boolean isTall= scan.nextBoolean();
       boolean isFast = scan.nextBoolean();
       boolean isFlexible = scan.nextBoolean();
       String sport = "";

       if(isTall){
           if(isFast){
               sport="basketball";
           }else if(isFlexible){
               sport= "gymnastics";
           }else{
               sport="voleyball";
           }
       }else{
           if(isFast){
              sport="soccer";
           }else{
               sport="teniss";
           }
       }
        System.out.println(sport);
    }
}
