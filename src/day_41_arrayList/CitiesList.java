package day_41_arrayList;
import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare array list
        ArrayList<String>cities = new ArrayList<>();
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Vienna");
        cities.add("Adana");
        cities.add("LA");
        //add Ashgabat to 0 index
        cities.add(0, "Ashgabat");
        System.out.println(cities);

        System.out.println("first city: " + cities.get(0));
        //find last index using size -1
        System.out.println("last city: " + cities.get(cities.size()-1));

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list");
        //for loop print all values in the same line

        for(int i=0; i<cities.size()/2; i++){
            System.out.print(cities.get(i)+" ");
        }
        System.out.println();

        for(String each: cities){
            System.out.println(each+" ");

        }
        //delete item from array list
        cities.remove(1);
        System.out.println(cities);

        //make sure it is clear
        //1) print|spit it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");
        }

        //3) check size() == 0
        if(cities.size() == 0) {
            System.out.println("list is empty");
        }
    }
}
