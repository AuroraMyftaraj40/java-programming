package OfficeHours.Practice_04_12_2021;

public class MinAndMaxFromArray {
    public static void main(String[] args) {
        int[] arr= {3,1,5,3,10,4,3};
        int min = arr[0];//we are using the first index of the first number
        int max = arr[0];//same
        //we are going from the begining to the end, for each loop is better

        for(int each:arr){
            if(each<min){
                min=each;
            }
            if(each>max){
                max=each;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }

}
