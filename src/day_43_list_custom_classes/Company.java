package day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        /**
         * add 3 objects of employee class
         * assign name and jobTitle
         *call the work method
         */

        Employee emp1 = new Employee();
        emp1.name = "Ben";
        emp1.jobTitle = "SDET";
        emp1.work();

        Employee emp2 = new Employee();
        emp2.name = "Mark";
        emp2.jobTitle = "SDET";
        emp2.work();
    }
}
