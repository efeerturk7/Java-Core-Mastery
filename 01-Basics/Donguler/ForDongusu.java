package Donguler;

public class ForDongusu {
    public static void main(String[] args) {
        for (int i = 0, j = 0; (i + j < 10); i++, j++) {
            System.out.println("bAHADIR" + i + j);
        }
        //for(;;) sonsuz döngüdür.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i : " + i + " j : " + j);
            }
        }

    }
}
