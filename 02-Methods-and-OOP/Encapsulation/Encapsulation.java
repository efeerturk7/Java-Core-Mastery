package Encapsulation;
// Encapsulation : sınıfa özel(private) değişkenler kullanmak demek
// direkt olarak main sınıfında nesne oluşturarak ulaşılmaması için
// değer atamak için consturctor kullanarak erişeceğiz.Burada devreye
//giren metotlar ise get ve set metotlarıdır.Bu metotlar private olan değişkenlere
//mainden ulaşmaya yarar get direkt değeri yazdırmaya set ise o değer üzerinden
//farklı tanımlamalar veya değer koymalara yarar.
public class Encapsulation {
    private int ogrenciNo;
    private int sinif;
    private String isim;
    public Encapsulation(String isim,int ogrenciNo,int sinif){
        this.isim=isim;
        this.ogrenciNo=ogrenciNo;
        this.sinif=sinif;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
