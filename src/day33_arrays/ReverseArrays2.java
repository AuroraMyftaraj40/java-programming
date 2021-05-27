package day33_arrays;

import java.util.Arrays;

public class ReverseArrays2 {
    public static void main(String[] args) {
        int[] nums={5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));

        int temp=nums[0];
        nums[0]=nums[3];
        nums[3]=temp;
        System.out.println("after first and last swap: " + Arrays.toString(nums));

        int[] nums2={5, 10, 4, 100};
        System.out.println("Before: " + Arrays.toString(nums));

        for(int i=0; i<nums2.length/2; i++){
            int temps2=nums2[1];
            nums2[i]= nums2[nums2.length -1 - i];
            nums2[nums2.length -1 - i] = temps2;
        }
        System.out.println("After: " + Arrays.toString(nums));

        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        for(int i=0, j=words.length-1; i<words.length/2; i++, j--){
            String tempWord= words[i];
            words[i]=words[j];
            words[j]=tempWord;

        }
        System.out.println("After reverse: " + Arrays.toString(words));
    }
}
