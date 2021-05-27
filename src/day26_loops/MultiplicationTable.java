package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num=2;
        if(num<1 || num>10){
            System.out.println("Error: invalid input");
            return;
        }

        for(int i=1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
