package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Toyota";
        String driverName = "Aurora";
        int licenseNum = 35364575;
        short speed = 220;
        boolean isAutomatic = true;
        char licenseClass = 'B';
        System.out.println("Car Model:\t" + carModel);
        System.out.println("Driver Name:\t" + driverName);
        System.out.println("License Number:\t" + licenseNum);
        System.out.println("Speed:\t" + speed);
        System.out.println("Is Automatic:\t" + isAutomatic);
        System.out.println("License Class:\t" + licenseClass);
        System.out.println(driverName + " is driving a " + carModel);
        System.out.println("Car Speed is:\t" + speed);
        System.out.println("Current speed is : " + speed + " mph");
        System.out.println("Is it " + isAutomatic + " that this car is automatic?");
        System.out.println(licenseClass +" "+ isAutomatic);





    }
}
