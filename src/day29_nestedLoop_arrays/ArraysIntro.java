package day29_nestedLoop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] num;// array variable, collection of data
        //int[] num = new int[3]; int array that can store three variables
          //  num[0]=5;
        //  num [1]=2;
        //   num[2]=7;
        //double i = new double[45]; double variable that can store 45 double variable
        // same thing for other type of variables
        int nums[] = new int[3];
        nums[0]=5;
        nums [1]=10;
        nums[2]=7;
        System.out.println("value at index 0: "+nums[0]);
        System.out.println("value at index 1: "+nums[1]);
        System.out.println("value at index 2: "+nums[2]);

        int i = 0;
        System.out.println(nums[i]);
        System.out.println("Number of elements is = "+ nums.length); // to find size of array-- name of variable.length; in this case is nums.length;
        //to find the size of String is word.length();

       // int len = nums.length;

        //there are different ways of declaring and assigning values to arrays. we use this when we have the numbers but not the values for each
        //long way     num[0]=5;
        //             num [1]=2;
        //             num[2]=7;

        // short way, declare and assign value in same statement
        //int nums[]= {123, 345, 235, 88775765}; here we have array with size 7

        //short way and mix
        //double[] prices= new int[] {123.98, 345.5, 23516, 88775.765}
    }
}
