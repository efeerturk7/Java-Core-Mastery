package ObjectOrientedProgramming;

public class Ogrenci {
    String ad;
    int ogrenciNo;
    int sinif;
    boolean aktif;

    public Ogrenci() {//Constructor (Kurucu metot)(geriye değer döndürmez)
        aktif = true;
        ad = null;
        sinif = 0;
        ogrenciNo = 0;
    }

    public Ogrenci(String ad, int ogrenciNo, int sinif, boolean aktif) {
        this.ogrenciNo = ogrenciNo;
        this.aktif = aktif;
        this.sinif = sinif;
        this.ad = ad;


    }

    public void dersAl() {
        System.out.println("Öğrenci dersi alıyor");
    }

    public void ogrenciBilgileriniYazdir() {
        if (aktif) {
            System.out.println("Adı : " + ad + " numarası :" + ogrenciNo + " sınıfı :" + sinif);

        } else {
            System.out.println("Bu öğrenci sistemde kayıtlı değil");
        }

    }
}
