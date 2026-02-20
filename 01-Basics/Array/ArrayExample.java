package Array;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        //sORU 3- Kullanıcıdan kaç tane sayının ortalamasının bulunmasını istediğini sorun ve
        //buna bağlı olarak aldığınız değerleri bir dizide saklayın.Veri alma işlemi bittikten
        //sonra tüm sayıları ve ortalamasını ekrana yazdırın
        double ortalama = 0;
        System.out.println("Lütfen kaç tane sayının ortalamasınıb bulunmasını istiyorsunuz :");
        Scanner oku = new Scanner(System.in);
        int ortalamaSayip = oku.nextInt();
        double array[] = new double[ortalamaSayip];
        for (int i = 0; i < ortalamaSayip; i++) {
            System.out.println("Değeri giriniz :");
            Scanner diziEle = new Scanner(System.in);
            double oku1 = diziEle.nextDouble();
            array[i] = oku1;
            ortalama = (ortalama + oku1);
        }
        System.out.println(ortalama / ortalamaSayip);

    }
}
