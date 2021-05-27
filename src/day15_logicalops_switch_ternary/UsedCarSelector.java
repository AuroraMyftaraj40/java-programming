package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5_000.0;
        String make = "BMW";
        double carPrice = 4_999.0;

        if(make.equals("Toyota") && budget<= 5_000.0){
            System.out.println("Go for the deal, buy the " + make);
        }else if(carPrice <= budget && make.equals("Toyota") ||make.equals("Honda") || make.equals("Tesla")){
            System.out.println("Lets buy this car");
        }else{
            System.out.println("Not interested on " + make);
        }
    }
}
