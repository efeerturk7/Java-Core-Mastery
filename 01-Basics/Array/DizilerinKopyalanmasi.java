package Array;

public class DizilerinKopyalanmasi {
    public static void main(String[] args) {
        //Diziyi kopyalamak için manuel yöntem
        int dizi[]={1,4,6,7};
        int kopyaDizi[]=new int[dizi.length];
        for(int index=0;index<dizi.length;index++){
            kopyaDizi[index]=dizi[index];
            diziYazdir(kopyaDizi);
            dizi[0]=100;
            diziYazdir(kopyaDizi);

        }
        for (int sayi : kopyaDizi){
            System.out.println(sayi);
        }
        //arraycopy yöntemi
        int kopyaDizi1[]=new int[dizi.length];
        System.arraycopy(dizi,0,kopyaDizi1,0,dizi.length);
        //ilk yer : kaynak olacak yer neresi ikinci yer : kaynak olan yerden hangi indexten
        //üçüncü yer : hangi diziye kopyalama dördüncü yer : kaynaktan diğer diziye kaç eleman ekleyeceksin
        diziYazdir(kopyaDizi1);

    }
    public static void diziYazdir(int [] yazdirilacakDizi){
        for (int sayi : yazdirilacakDizi ){
            System.out.println(sayi);
        }
    }
}
