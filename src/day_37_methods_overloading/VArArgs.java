package day_37_methods_overloading;

public class VArArgs {
  public static void main(String[] args) {
        addNumbers(10, 6);
        addNumbers(2,4,67,8,9);
        addNumbers();
  }
    public static void addNumbers(int...nums){
        int sum=0;
        for(int n : nums){
            sum+= n;
        }
        System.out.println("sum " + sum);
    }
}
