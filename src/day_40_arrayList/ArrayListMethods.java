package day_40_arrayList;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " +shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());

        if(shoppingList.isEmpty()){
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("If is empty, keep coding java and go to the mall");
        }

        shoppingList.add("shoes");
        shoppingList.add("bag");
        shoppingList.add("mask");
        shoppingList.add("books");
        shoppingList.add("shampoo");
        shoppingList.add("parfume");

        int count= shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("Shoes"));

        System.out.println();

        if(shoppingList.contains("shoes")){
            System.out.println("Shoes is in the list");
        }else{
            System.out.println("Shoes is not iin the list");
        }
        System.out.println("buying shoes...$80");

       shoppingList.remove("shoes");
        System.out.println("Shopping list = " +shoppingList);
    }
}
