package day15_logicalops_switch_ternary;

public class OrLogicalOperators {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges > 4);
        if(apples>3||oranges>4){
            System.out.println("I do not need to buy fruits today.");
        }else{
            System.out.println("Go grocery shopping");
        }
        System.out.println(apples>2||oranges>10);
        System.out.println(apples>2&&oranges>10);
        if(apples>2||oranges>10){
            System.out.println("We dod not need fruits.");
        }else{
            System.out.println("We have to buy some fruits.");
        }if(apples==0||oranges==0){
            System.out.println("We dod not need fruits.");
        }else {
            System.out.println("We have to buy some fruits.");
        }
    }
}
