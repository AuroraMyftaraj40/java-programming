package day_40_arrayList;
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(11);
        nums.add(88);

        System.out.println(nums);
        System.out.println("size = " +nums.size());

        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 3 = " + nums.get(3-1));

        nums.remove(1);
        System.out.println(nums);
    }
}
