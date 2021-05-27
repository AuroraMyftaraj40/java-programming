package day_45_custom_classes;

public class TrafficLight {

    String color;
    // this is read only method, displays value of color variable
    public void showColor() {
        System.out.println("Show color " + color);
    }
        //this method updates the color value of the color variable
        public void changeColor(String newColor) {
            System.out.println("Changing color to " + newColor);
            color = newColor;
        }
    }
