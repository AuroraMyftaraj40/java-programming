package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection = "drink";
        String drink = "tea";
        String snack = "snack";
        String snackItem = "chips";
        if(selection.equals("drink")){
            System.out.println("Drink is selected");
        }if(drink.equals("tea")){
            System.out.println("Tea is selected");
        }else{
            System.out.println("Coke is selected");
        }if(snack.equals("snack")){
            System.out.println("Snack item is selected");
        }if(snackItem.equals("chips")){
            System.out.println("Chips is selected");
        }else if(snackItem.equals("candy")){
            System.out.println("Candy is selected");
        }else{
            System.out.println("Invalid item");
        }

    }
}
