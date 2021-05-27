package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letter = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for (char each : letter) {
            System.out.print(each + " ");
        }
        String sentence = new String(letter);
        System.out.println("\nsentence " + sentence);


        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println("\nitemArray.length " + itemArray.length);
        System.out.println("\nitem.length() " + item.length());

        String fruitStr="";
        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};
        for (String each : fruits) {
            System.out.print(each + "-");
            fruitStr+= each+"-";

        }
        System.out.println("\nfruitStr= " + fruitStr);

        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join("<>", languages));
        System.out.println(String.join("##", languages));


    }
}
