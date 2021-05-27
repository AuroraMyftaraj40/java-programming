package day31_arrays;
import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 1, 7, -4, 0, 44, 33};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: " +nums[0]);
        System.out.println("max value: " +nums[nums.length -1]);

        //Arrays.sort(nums, Collections.reverseOrder());
        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(Arrays.toString(languages));
        System.out.println("["+String.join(", ", languages)+"]");
        Arrays.sort(languages);
        System.out.println(Arrays.toString(languages));

        Arrays.sort(languages, Collections.reverseOrder());
        System.out.println(Arrays.toString(languages));


    }
}
