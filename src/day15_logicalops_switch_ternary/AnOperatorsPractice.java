package day15_logicalops_switch_ternary;

public class AnOperatorsPractice {
    public static void main(String[] args) {
        boolean onSale= true;
        boolean freeShipping= true;
        String item= "shoes";

        if(onSale&&freeShipping){
            System.out.println("Add "+item+" to your cart");
        }else{
            System.out.println("Don not buy it");
        }if(freeShipping && onSale && item.equals("shoes")){
            System.out.println("Add to cart -"+item);
        }else{
            System.out.println("Continue shopping");
        }


    }
}
