package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        System.out.println(10>5 && 1==1);

        int apples = 10, oranges = 5;
        boolean check= apples>6 && oranges>3;
        System.out.println("check = " + check);

        if (check) {
            System.out.println("I have enough apples and oranges");
        }else {
            System.out.println("I need to go to Walmart to buy some fruit");
        }
    }
}
