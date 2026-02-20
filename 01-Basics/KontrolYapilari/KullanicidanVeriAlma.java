package KontrolYapilari;
import java.util.Scanner;
public class KullanicidanVeriAlma {
    public static void main(String[] args) {
        Scanner tara=new Scanner(System.in);
        System.out.println("Lütfen girin :");
        int kullanicininGirdigiDeger= tara.nextInt();
        System.out.println("Kullanıcının girdiği değer : "+kullanicininGirdigiDeger);
        String isim=tara.next();//ifadeyi yazdıktan sonra nerede boşluk koyduysak boşluktan önceki ifadeyi
        //yazdırır next(); methodu
        char harf=tara.next().charAt(0);//burada tek harf olduğu için char olarak tanımlayabildik

    }

}
