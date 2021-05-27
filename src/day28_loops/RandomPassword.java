package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrtuvwxyz0123456789_!@#$%^&*";
        Random random=new Random();
        String password="";

        for(int i=1; i<=8; i++){
            int index=random.nextInt(71);
            System.out.println(source.charAt(index));
            //System.out.println(random.nextInt(source.length()));
           /// password= password+source.charAt(index);
            password+= source.charAt(index);
        }
        //
        // main(null);
        System.out.println("\nYour password = " + password);
    }
}
