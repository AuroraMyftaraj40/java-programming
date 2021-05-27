package day32_arrayas_split;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MallShopping {
    public static void main(String[] args) {
        //    0       1         2           3           4           5
        String[] items = {"Shoes", "Jackets", "Gloves", "Airpods", "iPad", "iPhone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};

        System.out.println("---------Find the index of gloves in items array------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
            }
        }
        System.out.println("----Set boolean is true if first iPad is found");
        boolean iPadExists = false;

        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("iPad")) {
                iPadExists = true;
                break;
            }

        }
        System.out.println("iPadExists = " + iPadExists);
        System.out.println("----Look for 'Jacket' in items and print all details");
        for(int n=0; n<items.length; n++){
            if(items[n].equalsIgnoreCase("'Jacket'")){
                System.out.println("'Jacket' exists in items");
            }else{
                System.out.println("'Jacket' does not exist");
                break;
            }
        }
    }

}





