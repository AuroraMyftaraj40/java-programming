package day_41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 14, 57);

        System.out.println("nums = " + nums);
        List<Integer> numsList = new ArrayList(Arrays.asList(4,2,4,23,456,76234));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList = " + numsList);


        List<String> drinksWithCaffeine = new ArrayList(Arrays.asList("coffe", "tea", "monster",
                                           "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);
        int caffeineAmount = 0;

        for(String drink : drinksWithCaffeine){
            if(drink.equals("monster") || drink.equals("red bull") || drink.equals("monster") || drink.equals("celsius")){
                caffeineAmount=150;
                System.out.println(drink + "----> " + caffeineAmount);
            }else if(drink.equals("coffe") || drink.equals("kambucha")){
                caffeineAmount = 120;
                System.out.println(drink + "----> " + caffeineAmount);
            }else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink + "----> " + caffeineAmount);
            }
        }

        for(String drink : drinksWithCaffeine){
            switch(drink) {
                case"monster": case"red bull": case"celsius":
                caffeineAmount=150;
                System.out.println(drink + "----> " + caffeineAmount);
                    break;
                case"coffee": case"kambucha":
                caffeineAmount = 120;
                System.out.println(drink + "----> " + caffeineAmount);
                     break;
                case"tea": case"coke": case"pepsi": case"mdew":
                caffeineAmount = 35;
                System.out.println(drink + "----> " + caffeineAmount);
                     break;
            }
        }

        drinksWithCaffeine.forEach(drink-> System.out.println(drink));
        drinksWithCaffeine.forEach(drink -> {
            System.out.println("This is forEach block");
            System.out.println("drink = " + drink);
        });
    }
}


