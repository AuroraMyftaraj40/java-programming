package day_45_custom_classes;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficObject = new TrafficLight();
        trafficObject.changeColor("red");
        System.out.println(trafficObject.color);
        trafficObject.showColor();

    }
}
