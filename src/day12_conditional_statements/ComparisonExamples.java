package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        System.out.println(currentSpeed>speedLimit);
        System.out.println(speedLimit<currentSpeed);
        System.out.println(speedLimit==currentSpeed);


       boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("Current speed = " + currentSpeed + "mph");
        System.out.println("Speed limit = " + speedLimit + "mph");

        currentSpeed += 20;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("Current speed = " + currentSpeed + "mph");
        System.out.println("Speed limit = " + speedLimit + "mph");

        isSpeeding = currentSpeed > speedLimit;

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >=itemPrice;
        System.out.println("canAfford = " + canAfford);
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);


    }
}
