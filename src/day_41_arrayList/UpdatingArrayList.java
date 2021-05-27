package day_41_arrayList;
import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();

        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Nissan");
        myCars.add(0,"Jeep");
        myCars.add(1,"Landa");
        myCars.add(2,"Yugo");

        System.out.println(myCars.toString());// print all cars
        String allCarsInOneString = myCars.toString();// save all cars in one string variable

        System.out.println("allCarsInOneString: " +allCarsInOneString);

        myCars.set(0,"Lamborghini");
        System.out.println("after set " + myCars.toString());

        myCars.set(4, "Honda");
        System.out.println("After set " + myCars.toString());
        //if myCars was array
        // myCars[4] = "Honda";

        //find the index number of Ford

        System.out.println("Index of Ford= " + myCars.indexOf("Ford"));
        int yugo = myCars.indexOf("Yugo");
        System.out.println("Yugo index = " + yugo);

        myCars.set(2,"BMW");
        System.out.println(myCars);

        for(int i=0; i< myCars.size(); i++){
            if(myCars.get(i).equals("Lamborghini")){
                myCars.set(i, "prius");
            }else if(myCars.get(i).equals("Lada")){
                myCars.set(i,"Lexus");
            }else if(myCars.get(i).equals("Ford")){
                myCars.set(i, "Audi");
            }
        }
        System.out.println("After loop: " + myCars);
  }
}
