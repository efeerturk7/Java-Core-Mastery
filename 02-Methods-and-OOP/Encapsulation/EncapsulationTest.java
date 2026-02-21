package Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Encapsulation object=new Encapsulation("Ali",200,3);
        System.out.println(object.getIsim());
        object.setIsim("Fatma");
        System.out.println(object.getIsim());
        System.out.println(object.getOgrenciNo());


    }
}
