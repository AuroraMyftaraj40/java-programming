package day_47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("9401 Lee Highway");
        cybertekAddress.setCity("Fairfax");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22031");
        cybertekAddress.setCountry("USA");

        System.out.println("cybertekAddress = " + cybertekAddress);

        cybertekAddress.setStreet("9401 Lee Highway, Suite 205");
        System.out.println("cybertekAddress = " + cybertekAddress);

        System.out.println("street info= " + cybertekAddress.getStreet());

        Address address1 = new Address();
        System.out.println(address1.toString());
    }
    
    
}
