package day19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));

        System.out.println(city.equalsIgnoreCase("Chicago"));
        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase("Chicago "));

        if(city.equals("Chicago")){
            System.out.println("equals () true");
        }else{
            System.out.println("equals () false");
        }
        if(city.equalsIgnoreCase("Chicago")){
            System.out.println("equals () true");
        }else {
            System.out.println("equals () false");
        }
    }

}
