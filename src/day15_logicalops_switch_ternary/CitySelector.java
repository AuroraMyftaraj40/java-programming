package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Washington DC";

        if(city.equals("Washington DC") || city.equals("Tampa")){
            System.out.println("Lets relocate");
        }else{
            System.out.println("Not considering to move to " + city);
        }

        String teacher = "Saim";

        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is java class with Saim");
        }else{
            System.out.println("We have soft skills class with Nadir");
        }
        String company="Google";
        double salary= 100_000.0;

        if(company.equals("Google") || salary>=100_000.0){
            System.out.println("Accept this offer from " + company + ".");
        }else{
            System.out.println("Reject offer from  " + company + ".");
        }
    }
}
