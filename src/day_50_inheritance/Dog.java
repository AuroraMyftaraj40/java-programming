package day_50_inheritance;

public class Dog extends Animal{

        public void jump() {
            System.out.println("The dog runs.");
        }

    @Override
    public void speak() {
        System.out.println("Dog is whofing");
    }
}
