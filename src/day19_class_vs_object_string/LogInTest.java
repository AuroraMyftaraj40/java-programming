package day19_class_vs_object_string;

public class LogInTest {
    public static void main(String[] args) {
        String expUsername="Cybertek";
        String expPassword="Abc123";

        String userName="CYBERTEK";
        String password="Abc123";

        if(expUsername.equalsIgnoreCase(userName) && expPassword.equals(password)){
            System.out.println("Pass - user successfully logged in");
        }else if(!expUsername.equalsIgnoreCase(userName)){
            System.out.println("incorrect username");
        }else{
            System.out.println("incorrect password");
        }
    }
}
