package Array;

public class BinarySearch {
    //BinarySearch algoritması düzensiz bir diziyi selectionsort yardımıyla düzenledikten sonra
    //0. index ile en büyük indexin ortalamasının integer hali yani tam sayı halini alıp bir nevi tam ortadan
    //başlamasıdır örneğin 10 elemanlı bir dizi olsun ve biz bu diziyi selection sort ile
    //kucukten buyuge sıraladığımızı farz edelim.Daha sonra yapacağımız işlem enkucuk index ve
    //en buyuk indeksin ortalamasını almak o da (0+9)/2=4 çıktığından 4. indexe bakarız ve aranması
    //gereken sayı 4. indexteki sayıdan büyükse sol tarafı aramamıza gerek yok sağdan devam ederiz
    // bu da bir nevi en düşük indexi 4 olarak kabul etmemiz anlamına gelir
    public static void main(String[] args) {
        int sayilar[] = {3, 1, 7, 12, 9, 35, 8, 15};
        selectionSort(sayilar);
        System.out.println("dizinin küçükten büyüğe göre sıralanmış hali :");
        diziyiYazdir(sayilar);
        int sonuc = binarySearch(sayilar, 54);
        System.out.println("binary search araması : " + sonuc);


    }

    public static void selectionSort(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            // en küçük elemanın bulunması ve indeksin bulunması
            int oankiEnkucuk = dizi[i];
            int oankiEnkucukIndex = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (oankiEnkucuk > dizi[j]) {
                    oankiEnkucuk = dizi[j];
                    oankiEnkucukIndex = j;
                }
            }
            if (oankiEnkucukIndex != i) {
                dizi[oankiEnkucukIndex] = dizi[i];
                dizi[i] = oankiEnkucuk;

            }
        }

    }

    public static int binarySearch(int[] dizi, int aranacakEleman) {
        int enDusukIndex = 0;
        int enYuksekIndex = dizi.length - 1;
        while (enYuksekIndex >= enDusukIndex) {
            int ortaIndex = (enDusukIndex + enYuksekIndex) / 2;
            if (aranacakEleman < dizi[ortaIndex]) {
                enYuksekIndex = ortaIndex - 1;
            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex;

            } else {
                enDusukIndex = ortaIndex + 1;
            }

        }

        return enDusukIndex - 1;
    }

    public static void diziyiYazdir(int dizi[]) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }
    }
}
