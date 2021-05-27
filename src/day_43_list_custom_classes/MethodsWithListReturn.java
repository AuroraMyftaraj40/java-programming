package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 nano sec= 1_000_000_000
        long start = System.nanoTime();
        long end = System.nanoTime();
        double listSeconds = (end-start)/1_000_000_000.0;
        System.out.println("Array list time: " +(end-start));
        System.out.println("Array list seconds: " + listSeconds);

        long st= System.nanoTime();
        int[] arr = getIntegerArray();
        long en = System.nanoTime();
        System.out.println("Array time: " + (en-st));

        double seconds = (en-st)/1_000_000_000.0;
        System.out.println("Array time seconds: " + seconds);

        List<Integer> mlnList= getIntegerList();//returns ready ArrayList object, no need new ArrayList
        int[] ar = getIntegerArray();
       // System.out.print(mlnList + " ");
        /**
         * getIntegerList
         * returns List<Integer>
         *     Loop from 0....1_000_000
         *     then add to array list and then return
         */
    } //...getIntegerList...
    public static List<Integer> getIntegerList(){
       List<Integer> nums = new ArrayList<>();
       for(int i = 0; i<= 1000000; i++){
           nums.add(i);
       }
        return nums;
    }
    /**No params
     * getIntegerArray
     * returns int[]
     *     Loop from 0....1_000_000
     *     then add to int[] and then return
     */
    public static int[] getIntegerArray(){
        //declare empty array with size 1000001
        int[] nums = new int[1000001];
        for(int i = 0; i<= 1000000; i++){
            nums[1] = i;//assign the values
        }
        return nums;
    }
    /**

     */
}
