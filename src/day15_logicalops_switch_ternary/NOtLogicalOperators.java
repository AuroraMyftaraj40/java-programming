package day15_logicalops_switch_ternary;

public class NOtLogicalOperators {
    public static void main(String[] args) {
        int apples = 6;
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        if(apples>2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        int age = 9;
        if(!(age>7)){
            System.out.println("Need to seat in child car seat");
        }else{
            System.out.println("NO need for car seat");
        }
        boolean isSmokingAllowed = false;
        if(!isSmokingAllowed){
            System.out.println("Smoking is not alloed here. Exit");
        }
        boolean isAffordable = false;
        if(!isAffordable){
            System.out.println("Item not affordable");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if(!inputPassword.equals("abc123")){
            System.out.println("Incorrect password.");
        }
        if(!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password.");
        }
    }
}
