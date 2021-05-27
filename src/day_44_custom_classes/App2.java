package day_44_custom_classes;

public class App2 {
    public static void main(String[] args) {
        App application = new App();
        application.name="UBER";
        application.version= 2.4;
        System.out.println(application.name);
        System.out.println(application.version);
        application.open();



    }
}
