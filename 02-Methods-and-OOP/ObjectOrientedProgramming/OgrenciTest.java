package ObjectOrientedProgramming;

public class OgrenciTest {
    // birden fazla consturctor oluşturabiliriz kişinin verdiği değerlere
    //göre çağıralacak farklı ifadelerde birden fazla constructor
    //işe yarar
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Emre altunbilek";
        ogrenci.sinif = 9;
        ogrenci.ogrenciNo = 202;
        ogrenci.aktif = true;
        ogrenci.ogrenciBilgileriniYazdir();
        Ogrenci bos = new Ogrenci();//burada eğer consturtor ın içini aktif=true
        //yapmazsak bu öğrenci sistemde kayıtlı değil diye gözükecek
        //çünkü aktiflik durumu false döndüreceği için else yapısındakşi
        //mesajı bastıracaktır ama biz constructor içini true yaptığımız için
        // isimi null diğerlerini ise 0 atadı bu değerleri istersek consturctor
        //içini değiştirerek düzenleyebiliriz
        bos.ogrenciBilgileriniYazdir();
        Ogrenci ogr1 = new Ogrenci("efe", 998, 4, true);
        ogr1.ogrenciBilgileriniYazdir();//ilk başta burada consturctorü
        //doldurmadan önce bu ifadeyi çalıştırsaydık sistemde kayıtlı değil
        //yazacaktı çünkü constructore değişkenler atamış olabilir ama
        //yukarıda yazılan ifadeler o sınıftaki en başta tanımlı olan
        //değişkenlerdir bu yüzden onların bir değeri olmadığı için direkt
        //sistemde görmedi ancak biz constructor ın içini this li ifadelerle
        //eşleştirirsek işte o zaman çalışır

    }
}
