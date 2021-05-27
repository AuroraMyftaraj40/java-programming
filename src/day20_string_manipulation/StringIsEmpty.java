package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());

        String veggie = "carrots";
        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }
    }
}
