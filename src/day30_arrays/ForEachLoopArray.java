package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
        for(int each : data){
            System.out.println(each);
        }
        System.out.println();
        for(int each= 0; each<data.length; each++){
            System.out.print(data[each]+ " ");// will give each number
            //System.out.print(each+" ");  will give the index

        }
        System.out.println();
        System.out.println(data[data.length-1]);//gives the value
        System.out.println();
        System.out.println(data.length-1);//gives the index
        System.out.println();
        System.out.println();
        for(int idx=data.length-1; idx>=0; idx--){//to print backwards the data
            System.out.println(data[idx] + " ");
        }
    }

}
