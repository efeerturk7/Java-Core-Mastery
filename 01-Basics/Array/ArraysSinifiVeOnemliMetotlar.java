package Array;

import java.util.Arrays;

public class ArraysSinifiVeOnemliMetotlar {
    public static void main(String[] args) {
        int sayilar[] = {4, 7, 1, 47, 8, 39};
        int sayilar2[] = {4, 7, 1, 47, 8, 39};
        System.out.print("Sıralanmadan once dizi :");
        diziyiYazdir(sayilar);
        int[] dizi = new int[5];
        Arrays.fill(dizi, 10);
        Arrays.fill(dizi, 10, 4, 354);

        System.out.print("Sıralama sonrası dizi :");
        Arrays.sort(sayilar, 2, 5);//2. ve 5. indexle arasını sıralar
        diziyiYazdir(sayilar);
        Arrays.parallelSort(sayilar);// işlemci iyiyse bu daha iyi bir sıralama yapar
        int sonuc = Arrays.binarySearch(sayilar, 12);
        System.out.println(sonuc);
        boolean dogruMu = Arrays.equals(sayilar, sayilar2);
        System.out.println(dogruMu);
    }

    public static void diziyiYazdir(int dizi[]) {
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + ",");
        }
    }


}
