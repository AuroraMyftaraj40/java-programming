package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student2 = new String[5];
        student2[0] = "1234";
        student2[1] = "Aurora";
        student2[2] = "Myftaraj";
        student2[3] = "22";
        student2[4] = "4567890234";

        String[] student1 = {"1234", "Aurora", "Myftaraj", "22", "4567890234"};
        System.out.println("Student ID: " + student1[0]);
        System.out.println("First name: " + student1[1]);
        System.out.println("Last name: " + student1[2]);
        System.out.println("Batch Number: " + student1[3]);
        System.out.println("Mobile number: " + student1[4]);

        System.out.println("Student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("Student data has correct length.");

        } else {
            System.out.println("Student has wrong data length");
        }
        if (student2.length == student1.length) {
            System.out.println("Each student information has the correct data");
        }else{
            System.out.println("Student data are not equal");
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
    }
}
