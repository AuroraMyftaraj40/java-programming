package day_46_encapsulation;

public class Car {
    private String model;
    private int year;
    private int millage;

    public void setModel(String carModel){
       model = carModel;
    }
    public String getModel(){
        return model;

    }
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public int getMillage(){
        return millage;
    }
    public void setMillage( int millage) {
        this.millage = millage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", millage=" + millage +
                '}';
    }
}
