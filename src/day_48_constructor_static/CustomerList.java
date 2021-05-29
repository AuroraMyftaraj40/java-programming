package day_48_constructor_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerList {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1.toString());//print with default values
        cs1.setName("Bob");
        cs1.setId(1);
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("Jon",3);
        System.out.println(cs2);
        System.out.println(cs3);

        //array of customers
        Customer[] todayCustomers = {cs1, cs2, cs3, new Customer("Bashir", 987)};

        //array list of customer objects
        List<Customer> customersList = new ArrayList<>();
        customersList.add(cs1);
        customersList.add(cs2);
        customersList.add(cs3);
        customersList.add(new Customer("Bashir", 987));
        customersList.add(new Customer("Suleyman", 567));
        customersList.add(new Customer("Amin", 234));

        //print info of first customer object in array and arrayList
        System.out.println(todayCustomers[0]);
        System.out.println(customersList.get(0).toString());

        System.out.println(".............FOR LOOP............");
        for(int i=0; i<customersList.size();i++){
            System.out.println(customersList.get(i));
        }


        System.out.println("...............FOR ECH LOOP..........");
        for(Customer eachCustomer : customersList) {
            System.out.println(eachCustomer);
        }

        //print only the names
        System.out.println("........NAMES OF CUSTOMERS.......");
        for(int i=0; i<customersList.size();i++) {
            System.out.println(customersList.get(i).getName());
        }
        for(Customer eachCustomer : customersList) {
            System.out.println(eachCustomer.getName());
        }
    }
}
