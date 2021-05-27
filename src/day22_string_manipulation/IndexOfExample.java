package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testng, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf(","));

        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at " + indexOfJava);

        int indexOfCss = technologies.indexOf("css");
        System.out.println("css is at " + indexOfCss);

        int idxOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at " + idxOfCucumber);

        if(technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }
        if(technologies.indexOf("maven")>-1){   //or != -1, or >=0
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

    }
}
