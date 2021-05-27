package day35_methods_with_param;

import java.util.Scanner;

public class MultiplePrams {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two doubles");
        double d1=scan.nextDouble();
        double d2=scan.nextDouble();
        showSum(d1, d2);
        showSum(6.99, 7.76);


    }
    /**
     * method name: showSum
     * @PARAM/INPUTS: double num1, double num2
     * it adds numbers and print results
     */
    public static void showSum(double num1,double num2){
        double sum = num1+num2;
        System.out.println("The sum is " + sum);
    }
}
