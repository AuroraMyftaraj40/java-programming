package day_39_wraper_classes;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
        //auto-boxing---primitive---> to wrapper class object
        int num1 = 500;
        Integer num2 = num1;
        Integer num3 = 234;

        //Un-boxing-----wrapper class object---->primitive
        Double d1 = new Double(100.5);//wrapper class-->Double(always in uppercase
        double d2 = d1;
        double d3 = new Double(234.5);
    }

}