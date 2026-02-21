package ObjectOrientedProgramming;
//adıyla da bilinen immutable objects(değiştirilemeyen nesneler): Dışarıdan birinin
// immutable olarak atadığımız değişkenlere veya metotlara erişemez biz sadece bir başlangıç değeri
//veririz sonrası da değiştirilemez
//Immutable Objects yapabilmek için önce o değişkenler veya metotlar kesinlikle private
//olmalı.Setter metotlar olmamalı.Getter metotlar da herhangi bir referans döndürülmemeli

public class ImmutableObjects {
    public static void main(String[] args) {
        Bilgisayar pc1 = new Bilgisayar(6, 16, new String[]{"apple", "hp", "samsung"});
        bilgisayariYazdir(pc1);
    }

    public static void bilgisayariYazdir(Bilgisayar yazdirilacakPC) {
        System.out.println("Çekirdek Sayısı: " + yazdirilacakPC.getCekirdekSayisi());

    }

}

class Bilgisayar {
    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalari;

    //Diziler referans tipli oldukları için direkt kopyalarını değil kendilerini
    // atadıkları için final bunun için de türemiştir eğer primitive bir değişken tipi olsaydı
    //onlar stackte kopyasını bulundurduğu için onlarda bir problem olmaz ancak referans tiplilerde
    //yukarıda tanımladığınız diziyi birkaç işlemden sonra başka bir diziye atarsanız aynı diziden
    //iki tane olmuş olur. Bu da ikisinden herhangi biri içinde yapılacak bir değişiklik diğerine de
    //yansıyacaktır demek
    public Bilgisayar(int cekirdekSayisi, int ramBoyutu, String[] ureticiFirmalari) {
        this.cekirdekSayisi = cekirdekSayisi;
        this.ramBoyutu = ramBoyutu;
        this.ureticiFirmalari = ureticiFirmalari;
    }

    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

    public String[] getUreticiFirmalari() {
        //return ureticiFirmalari;//bu yukarıda anlattığım gibi kullanıcıya aslında asıl olan diziyi değiştirme imkanı
        //vermiş oluyoruz bu da bizim istemediğimiz bir şey bu yüzden de bunu yapmak için birkaç yol var mesela
        String kopyaFirmaIsimleri[] = new String[ureticiFirmalari.length];
        for (int i = 0; i < ureticiFirmalari.length; i++) {
            //kopyaFirmaIsimleri=ureticiFirmalari;// eğer bu ifadeyi yazarsak yine yukarıda
            //bahsettiğimiz olay olur yani kopya firmalarında yapacağımız herhangi bir değişiklik uretici firmaları da
            //değiştirecektir.Bunun sebebi dizinin referansındaki adres değerleri aynı oluyor o yüzden ikisinede aynı değişikliği
            //yapmış oluyoruz.Bunu düzeltmenin bir yolu aşağıda yapacağımız adımla olacak
            kopyaFirmaIsimleri[i] = ureticiFirmalari[i];
            //burada dizilerin referansları aynı yerde değil artık biz bunları primitive hale döndürmüş
            //olduk yani artık ana bizim tanımladığımız uretici firmalarının referans numarası değişmeyecek
            //ve kopya firmalarında yaptığımız herhangi bir değişiklik uretici firmaları da aynı şekilde değiştirmeyecektir.
        }
        return kopyaFirmaIsimleri;// ve bu ifadeylede artık ana yapımız bozulmayacak
    }
}
