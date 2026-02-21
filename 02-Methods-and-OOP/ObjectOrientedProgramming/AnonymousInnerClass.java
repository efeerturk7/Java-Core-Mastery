package ObjectOrientedProgramming;

public class AnonymousInnerClass {
    public static void main(String[] args) {

        Hesaplayici hesaplayici1=new Hesaplayici(){
            @Override
            public void topla(int s1, int s2) {
                System.out.println("İki sayının toplamı :");
            super.topla(s1, s2);
        }
        };
        hesaplayici1.topla(7,8);
        Hesaplayici hesaplayici2=new Hesaplayici();
        hesaplayici2.topla(5,7);
        Canli5 canli5=new Canli5() {//normalde abstract bir sınıfta nesne üretilmez ancak burada biz isimsiz ınner bir sınıf
            //kullandık aynı yukarıdaki gibi burada aslında bir class tanımlayıp abstract sınıfı extends edip
            //metotlarını override ediyor gibi düşünebiliriz
            //aynısını interface ler içinde kullanabilirsiniz
            @Override
            void adiniSoyle() {
                System.out.println("Ben isimsiz sınıftan geliyorum adım anonim");
            }

            @Override
            void selamVer() {
                System.out.println("Ben isimsiz sınıftaki selam ver metoduyum");
            }
        };
        canli5.adiniSoyle();
        canli5.selamVer();

    }
}

class Hesaplayici {
    public void topla(int s1, int s2) {
        System.out.println("Toplam : " + (s1 + s2));
    }
}
class YeniHesaplayici extends Hesaplayici {
    @Override
    public void topla(int s1, int s2) {
        System.out.println("Sonuc :");
        super.topla(s1, s2);
    }
}
abstract class Canli5{
    abstract void adiniSoyle();
    void selamVer(){
        System.out.println("selam");
    }
}
