package day_36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(700);
        checkEligible(690);
       // System.out.println(checkEligible(700));
        System.out.println(getCreditScore());
        System.out.println("Credit Score : " + getCreditScore());
        int score= getCreditScore();
        System.out.println("Score: " +score);
    }
    public static void checkEligible(int creditScore) {
        if(creditScore>=700){
            System.out.println("Eligible for leasing this car");
        }else{
            System.out.println("Not eligible to lease this car");
        }
    }
            //public --> visible to everyone
            //static--> do not need object to call method
            // int  --> return to a data type
        public static int getCreditScore() {
            return  800;

        }
}
