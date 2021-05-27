package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter1 = 'a';
        while (letter1<='z'){
            System.out.print(letter1+" ");
            letter1 ++;
        }
        System.out.println();
        System.out.println();
        char letter = 'z';
       while(letter>='a'){
           System.out.print(letter + " ");
           letter--;
       }
    }
}
