package day_42_arraylist;
import java.lang.reflect.Array;
import java.util.*;

public class CollectionUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();

        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's', 'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println("reversed = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));
        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'a', 'u');
        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("after replace = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);
        
      List<Integer> nums= Arrays.asList(23, 4, 8 ,45, 5, 55, 7, -9, 1,  0);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse : " + nums);
        
        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        
        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);
        
        int countOfOnes= Collections.frequency(nums, 1);
        System.out.println("countOfOnes = " + countOfOnes);
        
        Collections.replaceAll(nums, 5, 50);
        System.out.println("after replace all = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle" + nums);
        
        
    }
}
