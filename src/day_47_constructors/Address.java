package day_47_constructors;

public class Address {
   private String street = "9401 Lee Highway";
   private String city = "Fairfax";
   private String state = "VA";
   private String zipCode = "22031";
   private String country = "USA";

    //constructor(has no return type, has same name as class name
    public Address() {
        System.out.println("Address constructor.");
        street="7745 Tiverton Dr";
        city="Springfield";
        state="VA";
        zipCode="22152";
        country="USA";
}
public Address(String street, String city, String zipCode, String country) {


}

    public String toString() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
