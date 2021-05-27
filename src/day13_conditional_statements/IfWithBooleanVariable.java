package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry == false) {
            System.out.println("I am hungry and I will get something to eat.");
        } else {
            System.out.println("I will not eat anything.");
        }
        double price = 300.0;
        boolean isAffordable = price <= 200;
        System.out.println("Is affordable? - " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it.");
        } else {
            System.out.println("I can not afford it, let's code Java.");
        }
        boolean isRemoteJob = true;
        if(isRemoteJob) {
            System.out.println("Sorry I am not interested.");
        }else{
            System.out.println("Sure I am interested.");
        }
    }
}
