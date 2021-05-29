package day_47_constructors;

public class Student {
    private String name;
    private int age;
    public Student() {
        System.out.println("No-Args constructor");
    }
    public Student(String name){
        System.out.println("name param constructor -> name = " + name);
    }
    public Student(int age) {
        System.out.println("age of the param -> age= " + age);
    }
    public Student(String name, int age) {
        System.out.println("name and age of the constructor= " + name + " " + age);
    }
}
