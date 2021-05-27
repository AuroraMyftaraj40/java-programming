package day_42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFormList {
    public static void main(String[] args) {
        List<Integer> uniqueList = getUniqueList();
        System.out.println("\nuniqueList = " + uniqueList);
    }
        //to extract method, select the part you want to change, refactor, extract method
    public static List<Integer> getUniqueList() {
        List<Integer> nums = new ArrayList(Arrays.asList(2,4,4,1, 5,6,0,6));
        System.out.println(nums);

        List<Integer> uniqueList = new ArrayList<>();


        for(int each : nums){
            if(Collections.frequency(nums, each) == 1) {
                System.out.print(each + " ");

                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
