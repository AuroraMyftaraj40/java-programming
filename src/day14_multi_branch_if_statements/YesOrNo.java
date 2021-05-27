package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char selection = 'i';
        boolean answer;
        String result;

        if (selection == 'Y') {
            System.out.println("Your file will be deleted");
            answer = true;
            result = "deleted";
        }else{
            System.out.println("your file will not be deleted");
            answer = false;
            result = "saved";
        }
        System.out.println("Get file get deleted? - " + answer + " -What was the result? - " + result);
    }
}
