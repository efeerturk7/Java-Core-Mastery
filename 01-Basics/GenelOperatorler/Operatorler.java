package GenelOperatorler;

public class Operatorler {
    public static void main(String[] args) {
        String stringSayi = "150";
        int stringSayi1 = Integer.parseInt(stringSayi); //Integer.valueOf(stringSayi); da olur
        System.out.println("String sayıya çevir : " + stringSayi1);
        stringSayi = String.valueOf(stringSayi1);
        System.out.println("Sayıyı stringe çevir  : " + stringSayi);
        /*Arttırma ve Azaltma Operatörleri
        arttırma veya azaltma operatörlerinin sağda veya solda olması işlemleri değiştirir
        örneğin aşağıdaki gibi sayi2 değeri sayi1 değerinin solunda arttırma operatörü olduğu için
        bu şu anlama gelir önce sayi1 değişkenini arttır sonra sayi2 ye ata anlamındadır
        sayi3 e gelirsek burada ise soldan değil sağdan bir eksiltme işlemi var bu da şu anlama gelir
        sayi3 e sayi1 i ata sonra sayi1 i 1 azalt demektir */
        //son durumda sayi1=10 sayi2=11 sayi3=11

        int sayi1 = 10;
        int sayi2 = ++sayi1;// bu işlemde sayi1 11 oldu çünkü bu operatörler değeri otomatik olarak değiştiriyor
        int sayi3 = sayi1--;// sayi1 son durumda 11 olduğu için vve yukarıda bahsettiğim şeyden dolayıda sayi3 te sayi1 eşit
        System.out.println(sayi3);
        System.out.println(sayi1);
        System.out.println("Sonuc : " + (sayi1) + (--sayi2) + (sayi3++));//result :101011

        //Aritmetik atama operatörleri :
        int sayi12 = 10;
        int sayi21 = 20;
        int sonuc = 0;
        sonuc += sayi12;//sonuc = sonuc + sayi12 =10
        sonuc -= sayi21;//sonuc = sonuc - sayi21 =-10


    }

}