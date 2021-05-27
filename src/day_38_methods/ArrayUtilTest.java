package day_38_methods;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 456, 1, 56, 7};


        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{5, 23, 456, 1, 56, 7});

        System.out.println("sum: " + ArrayUtils.sum(nums));
        System.out.println("sum: " + ArrayUtils.sum(new int[]{5, 23, 456, 1, 56, 7}));

        int[] nums2 = {4, 1, 5, 8};
        System.out.println("5- found = " + ArrayUtils.contains(nums2, 5));
        System.out.println("10- found = " + ArrayUtils.contains(nums2, 10));
    }
}
