package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day = 3;
        if(day==1){
            System.out.println("It is Monday");
        }else if(day!=1){
            System.out.println("It is not Monday");
        }
        if(day==2){
            System.out.println("It is Tuesday");
        }
        if(day==3){
            System.out.println("It is Wednesday");
        }
        System.out.println("============MULTI BRANCH IF STATEMENT==============");
        day=1;
        if(day==1){
            System.out.println("It is Monday");
        }else if(day==2){
            System.out.println("It is Tuesday");
        }else if(day==3){
            System.out.println("It is Wednesday");
        }else{
            System.out.println("It is Java day.");
        }
    }
}
