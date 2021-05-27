package day_44_custom_classes;

public class Animal { //custom class,

    String type = "some animal";//type is attribute

    public void eat() { //behaviour -> is always a method
        System.out.println("eating");
    }
    public void eat(String food){
        System.out.println("eating " + food);
    }
    public void speak() { //behaviour -> is always a method
        System.out.println(type + " speaking");
    }
}
