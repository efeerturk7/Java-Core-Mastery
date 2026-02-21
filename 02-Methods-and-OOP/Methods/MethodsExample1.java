package Methods;

import java.util.Scanner;

public class MethodsExample1 {
    // kullanıcıdan 3 işlemden birini seçmesini istenecek,0 a basıldığında program duracak
    //ayrıca 2 değişken olacak
    // 1- İki sayının çarpımı 2-İki sayının toplamı 3-kuvveti
    public static void main(String[] args) {

        int kullaniciSecimi;
        for (;;){
            kullaniciSecimi=menuGoster();
            if (kullaniciSecimi==0){
                break;
            }
            Scanner scanner=new Scanner(System.in);
            System.out.println("Birinci Sayıyı giriniz :");
            int birinciSayi =scanner.nextInt();
            System.out.println("İkinci Sayiyi giriniz : ");
            int ikinciSayi=scanner.nextInt();
            switch (kullaniciSecimi){
             case 1 : carpma(birinciSayi,ikinciSayi);
             break;
             case 2 : toplama(birinciSayi,ikinciSayi);
             break;
             case 3 : kuvvet(birinciSayi,ikinciSayi);
             break;
        }

        }

    }
    public static int menuGoster(){
        System.out.println("************** menu ************");
        System.out.println("İki sayının çarpımı için 1");
        System.out.println("İki sayının toplamı için 2");
        System.out.println("İki sayının kuvveti için 3");
        System.out.println("Çıkmak için 0 'a basın");
        Scanner scanner =new Scanner(System.in);
        int secim=  scanner.nextInt();
        return secim;

    }
    public static void toplama(int birinciSayi,int ikinciSayi){
        System.out.println("İki  sayının toplamı : "+birinciSayi+ikinciSayi);

    }
    //yukarıdaki ve aşağıdaki metotların ikiside aynı ama hata vermiyor neden çünkü bu ifadeye biz
    //overloading diyoruz yani yukarıda kullanıcı eğer double girerse double olan çalışacak
    //integer girerse integer olan çalışacak
    public static void toplama(double birinciSayi,double ikinciSayi){
        System.out.println("İki sayının toplamı double : "+birinciSayi+ikinciSayi);
    }
    public static void carpma(int birinciSayi,int ikinciSayi){
        System.out.println("İki sayının çarpımı : "+birinciSayi*ikinciSayi);
    }
    public static void kuvvet(int birinciSayi,int ikinciSayi){
        System.out.println("Kuvveti :"+Math.pow(birinciSayi,ikinciSayi));
    }


}
