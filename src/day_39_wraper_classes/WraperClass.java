package day_39_wraper_classes;

public class WraperClass {
    public static void main(String[] args) {
        int num=100;
        System.out.println("num = " + num);
        num+=10;
        System.out.println(num);

        Integer n= new Integer(500);
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(n+300);

        Integer intObject = 1000;
        System.out.println(intObject/50);
        Integer n2= 1000;
        System.out.println(n2/50);

        String numStr= n2+"";
        String numSt= n2.toString();

        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);


        Byte b1= new Byte ((byte)5);
        Byte b2= 10;

        Short sh1= new Short ((short)2);
        short sh2= 1;

        Long l1=new Long((long)300l);
        Long l2=3455l;

        Character ch2= new Character('D');
        Character ch1= 'Q';


    }
}
