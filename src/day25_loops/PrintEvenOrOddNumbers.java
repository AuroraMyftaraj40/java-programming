package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even Numbers: ");
        for(int n=1; n<=100; n++){
            if(n%2==0){
                System.out.println(n + " ");
            }
        }
        System.out.println("Odd Numbers0 - 100: ");
        for(int k=0; k<=100; k++){
            if(k%2!=0){
                System.out.println(k + " ");
            }
        }
    }
}
