package day_43_list_custom_classes;

public class Person {
    //data
    String firstName;
    int age;
    char gender;
    //behaviour-> method
    public void speak(){
        System.out.println("Person is speaking");
    }
}

class People{
    public static void main(String[] args) {
        //Instantiate Person class (create object from Person class)
        Person person1 = new Person();
        person1.firstName = "Bob";
        person1.age = 33;
        person1.gender = 'M';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);


        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 22;
        person2.gender = 'M';
        person2.speak();

        System.out.println(person2.firstName);
        System.out.println(person2.age);
    }
}
