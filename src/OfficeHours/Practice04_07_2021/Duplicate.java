package OfficeHours.Practice04_07_2021;

public class Duplicate {
    public static void main(String[] args) {
        String str = "AAABCCDEEF";
        for(int i= 0; i< str.length(); i++){
            int count = 0;
            //str.charAt(i);

            for(int j = 0; j<str.length(); j++){

                if(str.charAt(i)==str.charAt(j)){
                    count++;

                }
            }
            if(count>1){
                System.out.println();
            }
        }
    }
}
