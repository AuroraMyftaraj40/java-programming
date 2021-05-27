package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] cities = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        System.out.println("-----Prices more than 100-----");
        for (double eachPrice : prices) {
            if (eachPrice > 100.0) {
                System.out.println(eachPrice + " ");


                System.out.println("-------Prices between 10 and 70-------");
                for (double price : prices) {
                    if (price >= 10 && price <= 70) {
                        System.out.println(price + " ");
                    }
                }
                System.out.println("-----Count of the prices that are more than 50-----");
                int count = 0;
                for (double each : prices) {
                    if (each > 50) {
                        count++;
                        System.out.println("count = " + count);
                    }
                }
                System.out.println();
                System.out.println("\n------countries with length more than 7------");
                for(String each : cities){
                    if(each.length()>=7){
                        System.out.println(" " + each);
                    }
                }
            }
        }
    }
}
