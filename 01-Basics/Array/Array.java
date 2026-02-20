package Array;

import java.util.Scanner;

public class Array {

    //birden fazla aynı değişkene sahip verileri tutmaya yarar
    // int[]a = new int[10];  //integer tipinde 10 tane alan ayrılıyor
    // a = new int[15]; bu ifade yukarıdaki diziyi değiştirir 15 eleman olarak ayırır
    //dikkat burada dizi genişletilmedi sadece yeni dizi oluşuturuldu
    //dizilerin için indexe göre arama ve atama yapılır index 0 dan başlar yani dizideki
    //ilk eleman 0. indexteki elemandır
    // double[] veriler={3.4,5.6,7.8};

    //Soru 1- 10 elemanlı bir diziye eleman olarak dizi indeksinin karesini atayan uygulama
    public static void main(String[] args) {
        int dizi[] = new int[10];
        for (int index = 0; index < dizi.length; index++) {
            dizi[index] = index * 2;
            System.out.print(dizi[index] + ", ");
        }
        //Soru 2-Kullanıcıdan hangi ayda olduğunun bilgisini alıp ilgili ay değerini yazdırın.
        // Ay adlarını
        //bir dizide saklayın
        String aylar[] = {"", "ocak", "şubat", "mart", "nisan", "mayıs", "haziran", "temmuz", "ağustos", "eylül", "ekim", "kasım", "aralık"};
        Scanner giris = new Scanner(System.in);
        System.out.println("Ay değerini sayı ile ifade ediniz :");
        int sayi = giris.nextInt();
        System.out.println("Seçtiğiniz ay :" + aylar[sayi]);


    }


}
