package day17_ternary_nested_conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 30;
        boolean isPrimeMember = true;
        if(isPrimeMember){
            System.out.println("Eligible for free two day shipping");
        }else{
            if(itemPrice > 25) {
                System.out.println("Eligible for regular shipping");
            }else{
                System.out.println("Not eligible for free shipping");
            }
        }
    }

}
