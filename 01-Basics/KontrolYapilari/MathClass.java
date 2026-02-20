package KontrolYapilari;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.abs(8.1));//mutlak değer alma
        System.out.println(Math.ceil(3.1));//yuvarlama
        System.out.println(Math.pow(2, 3));//üslü ifadeler
        System.out.println(Math.sqrt(8.1));//karekök alma
        System.out.println(Math.max(8.1, 8.9));//En büyüğü bulma
        System.out.println(Math.random());//0.0 - 0.999999 / 0<=x<1
        int sayi = (int) (Math.random() * 100) + 1;
        System.out.println(sayi);
        int onakadarRastgeleSayi = (int) (Math.random() * 10) + 1;//1-10 arası
        System.out.println(onakadarRastgeleSayi);

    }
}
