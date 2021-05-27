package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        printAtoZ();
        printAtoZ();
        for(int i=0; i<10; i++){ // to print 10 times AtoZ
            printAtoZ();

        }
    }
    /**
     * *method name: printAtoZ
     * desc: prints all English alphabet in all uppercase
     */
    public static void printAtoZ(){
        for(char i='A'; i<='Z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    /** method name: display US flag
     *
     */



   }

