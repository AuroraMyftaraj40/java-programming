package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital One";
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("il"));
        System.out.println(company.contains("cap"));
        System.out.println(company.contains("One"));

        if(company.contains(" ")){
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
        }

        String firstName = "Aurora";
        if(firstName.contains("A") && firstName.contains("o"));
        System.out.println("name is Aurora");

        String email = "myftarajaurora@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
        }


        if(email.toLowerCase().contains("a")){
            System.out.println("correct email");
        }else{
            System.out.println("w");
        }
    }
}
