package OfficeHours.GroupPractice;

public class Day_04_26_2021 {
    public static void main(String[] args) {
        System.out.println(mergeString("abc","defgh"));
        //*[Merge Strings]User is given two Strings, which could vary in length, merge these
        // Strings so these Strings are combined into one String. Any extra characters from mismatched length
        // String are at the end.
        // Ex:
        // String one = abc
        // String two = defgh
        // Output:adbecfgh
        //
        // Ex:
        // String one = java
        // String two = is
        // Output:jiasva
    }
    public static String mergeString(String one, String two){
        String merge= "";
        String bigger="";
        int minLength=0;

        if(one.length()>two.length()){
            bigger=one;
            minLength=two.length();
        }else{
            bigger=two;
            minLength=one.length();
        }
        for(int i=0; i<minLength; i++){
            merge+=one.charAt(i) + "" + two.charAt(i);
        }
        merge+=bigger.substring(minLength);
        return merge;
    }
}
