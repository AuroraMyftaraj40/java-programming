package day_43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {

        System.out.println(getRandomList(10));
        List<Integer> nums= getRandomList(100);
        System.out.println("Num size: " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n<90);//remove nums less than 90
        System.out.println("nums after if = " + nums);

        System.out.println(getDays());
       System.out.println("getDays().size(): " + getDays().size());
        System.out.println("getDays().get(0): " + getDays().get(0));

        List<String> dayNames = getDays();
        System.out.println("Day names: " + dayNames);

        dayNames.removeIf(day -> day.length() <= 6); // " -> "  called lambda
        System.out.println("Day names after  removeIf: " + dayNames);
    }
    public static List<String> getDays(){
      //  List<String> getDays = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday"); days.add("Friday"); days.add("Saturday");
        days.add("Sunday");

        return days;
    }
    /**
     * getRandomList
     * param int
     * generate random numbers (0-100)
     */

    public static List<Integer> getRandomList(int size){
        Random random = new Random(); //to generate random numbers
        List<Integer> nums = new ArrayList<>();
        for(int i =1; i<=size; i++){
            int n =random.nextInt(101);
            if(!nums.contains(n)) {
//                nums.add(n);
            }
            nums.add(random.nextInt(101));//generate random number 1- 100 and add it to array list
        }
        return nums;
    }
}
