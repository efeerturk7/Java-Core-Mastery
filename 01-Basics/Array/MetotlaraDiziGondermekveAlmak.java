package Array;

public class MetotlaraDiziGondermekveAlmak {
    //dizilerde elemanı arttırıp azaltma veya eksiltme işlemleri yapılırsa dizilerin son hali dizi
    //üstünde yapılan son işlem neyse ona göre tenilenir
    public static void main(String[] args) {
        int sayilar[]={1,2,4};
        diziGoster(sayilar);
        System.out.println("Metottan önce index 0 :"+sayilar[0]);
        degeriBirArttir(sayilar[0]);
    }

    private static void degeriBirArttir(int i) {
        i++;
    }

    private static void diziGoster(int[] sayilar) {
        for (int i:sayilar){
            System.out.println("for each "+i);

        }
    }
}
