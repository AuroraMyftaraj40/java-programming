package day_47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Burak");
        Student st4 = new Student("Ali");

        Student st5 = new Student(34);
        Student st6 = new Student("Nasiba", 35);


    }
}
