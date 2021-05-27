package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
       String weather = "sunny";
       if(weather.equals("warm")){
           System.out.println("Got to park.");
       }else if(weather.equals("rainy")){
           System.out.println(weather + " Stay home.");
       }else if(weather.equals("snowy")){
           System.out.println(weather + " Wear warm clothes.");
       }else if(weather.equals("windy")){
           System.out.println(weather + " Do not go out at all.");
       }else{
           System.out.println("Let's code java");
       }
    }
}
