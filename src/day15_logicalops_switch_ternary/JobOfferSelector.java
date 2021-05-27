package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        //location, salary, remote,benefits

        String location = "Washington DC";
        double salary= 70_000.0;
        boolean remote= true;
        boolean benefits= true;

        if (location.equals("Washington DC") && salary >= 70_000.0 && remote && benefits) {
            System.out.println("Take this offer.");
        }else{
            System.out.println("Negotiate the offer.");
        }

    }
}
