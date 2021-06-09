package day_48_constructor_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //can be called using class name.static method
        Calculator.add(5,3);

        Calculator calculatorObj = new Calculator();
        calculatorObj.multiply(2,4);

    }
}
