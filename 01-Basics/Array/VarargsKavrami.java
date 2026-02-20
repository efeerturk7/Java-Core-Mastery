package Array;

public class VarargsKavrami {
    public static void main(String[] args) {
        toplamiBul(4,5,6,2);

    }
    //birden fazla değişken yazmanın kolay yolu bunu bir diğer yol olan overloading dediğimiz kısmın
    //birden daha fazla olması durumunda bu yöntem daha kolay ve kısadır
    public static void toplamiBul(int ... parametreListesi){
        int toplam =0;

        for (int oankiSayi:parametreListesi){
            toplam=toplam+oankiSayi;
            System.out.println(toplam);
        }

    }
    public static void cikarimiBul(double ... aListe){
        double cikarma=aListe[0];
    }
}
