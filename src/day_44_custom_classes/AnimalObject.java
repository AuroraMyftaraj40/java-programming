package day_44_custom_classes;

public class AnimalObject {
    //this method will be used as a runner method
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);
        animal.eat("grass");//method overloading
        //new Animal().eat("grass");//this can be used too
        animal.speak();

        System.out.println();

        //create new Animal object - cheetahObj  -> second animal
        Animal cheetahObj = new Animal();
        cheetahObj.type = "cheetah";//reassign value
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
