package day_39_wraper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(4,8));
        System.out.println("Min Int " + Integer.MIN_VALUE);
        System.out.println("Max Int " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.9, 4.6));
        System.out.println("Min Double " + Double.MIN_VALUE);
        System.out.println("Max Value " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,4));//will give 1 if first number is bigger than second
        System.out.println(Double.compare(5,5));//will give 0 when both numbers are equal
        System.out.println(Double.compare(5,56));//will give -1 when first number is smaller than second

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('D'));
        System.out.println(Character.isUpperCase('C'));

        char letter='A';
        if(Character.isUpperCase(letter)) {
            System.out.println("is upper case");
        }
        String word="JAva iS FuN";
        for(int i=0; 0<word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);

        System.out.println(Boolean.TRUE);
        }
    }
