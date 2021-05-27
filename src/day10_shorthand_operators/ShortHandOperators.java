package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 18;
        System.out.println("cars = " + cars);
        
        cars += 5;
        System.out.println("cars = " + cars);

        int electricCars = 13;

        cars = cars + electricCars;
        System.out.println(cars);

        String word = "Java";
        System.out.println("word = " + word);
       // word = word + " programming";
        System.out.println(word);
        
        word += " programming";
        System.out.println("word = " + word);
        word += " is fun";
        
        String selenium = " but \"selenium\" is more fun";
        word+= selenium;
        System.out.println("word = " + word);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter+= 3;
        System.out.println("letter = " + letter);
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("normal parking fee is = " + parkingFee);
        
        parkingFee /= 2;
        System.out.println("parkingFee = " + parkingFee);
        System.out.println("early bird parking fee is = " + parkingFee);
        
        parkingFee -= parkingFee;
        System.out.println("parkingFee = " + parkingFee);
        System.out.println("weekend parking is = " + parkingFee);
    }
}
