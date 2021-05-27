package day_40_arrayList;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>();
        System.out.println(nums);

        System.out.println("size = " +nums.size());
        
        nums.add(34); nums.add(27); nums.add(89); nums.add(49);
        System.out.println("nums = " + nums);
        
        nums.remove(0);
        System.out.println("nums = " + nums);
        
        nums.remove(new Integer(27));//to remove the object 27, not the index
        System.out.println("nums = " + nums);

        for(int i=0; i<nums.size(); i++){ //nums.length -->is for Array,  but nums.size()-->is for array list
            System.out.println(nums.get(i));

            System.out.println();

            for(Integer each: nums){
                System.out.print(each+" ");
            }
        }
    }
}
