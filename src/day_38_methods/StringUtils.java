package day_38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println("isNullOrEmpty(\nhello\n)" + isNullOrEmpty("hello"));
        String word= null;
        System.out.println(word.toUpperCase());
        System.out.println("isNullOrEmpty(word)" +isNullOrEmpty(word));
        word="";
        System.out.println("isNullOrEmpty(word)" +isNullOrEmpty(word));

    }
    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        } else {
            return false;
        }

    }
}
