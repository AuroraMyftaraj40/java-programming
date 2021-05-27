package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        if(floorNum == 1){
            System.out.println("Floor one selected. Companies: Lobby, Verizon");
        }else if(floorNum == 2){
            System.out.println("Floor two selected. Companies: Cybertek, NASA");
        }else if(floorNum == 3){
            System.out.println("Floor three selected. Companies: Lyft, Bofa");
        }else{
            System.out.println("Invalid floor - " + floorNum);
        }
        System.out.println("==============SWITCH STATEMENT VERSION==============");
        floorNum = 3;
        switch(floorNum){
            case 1:
                System.out.println("Floor one selected. Companies: Lobby, Verizon");
                break;//exit switch
            case 2:
                System.out.println("Floor two selected. Companies: Cybertek, NASA");
                break;//exit switch
            case 3:
                System.out.println("Floor three selected. Companies: Lyft, Bofa");
                break;//exit switch
            default:
                System.out.println("Invalid floor - " + floorNum);

        }
    }
}
