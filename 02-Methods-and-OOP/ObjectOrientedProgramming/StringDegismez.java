package ObjectOrientedProgramming;

public class StringDegismez {
    public static void main(String[] args) {
        String isim=new String("Bahadır");
        String ad=new String("Bahadır");
        System.out.println(isim==ad);//burada eğer iki tane eşittir kullanırsak
        // o zaman o nesnelerin tutulduğu adresi karşılaştırır bu yüzden de bunun cevabı false olur
        System.out.println(isim.equals(ad));//equals metodu ile de referansları değil referansların tuttuğu değerleri karşılaştırıyoruz
        // bu yüzden de ikisinde aynı değer olduğu için true döndürecek
        String abc="Abc";
        String abc1="Abc";
        abc1="efe";
        System.out.println(abc==abc1);// normalde burada false döndürülmesi gerek yukarıda anlattığımız gibi
        //ancak işler stringte böyle yürümüyor
        //Orneğin yukarıda yaptığımız işlem (string ile yapılan) abc1 once Abc değerine sahipti sonra biz onu efe olarak değiştirdik
        //ancak bu heapte böyle olmuyor (Stringe özel) Stringte abc1=abc farklı bir yerde tanımlı abc1=efe farklı bir yerde tanımlı oluyor
        //Yukarıda abc ve abc1 değişkenleri aynı değerleri gösteriyor bu da şu demek String sınıfında aynı değer eşit olanlar tek bir
        //yerde tutuluyor
        //concat() metodu sona istediğimiz şeyi ekleme metodudur aşağıda bununla ilgili bir örnek yapalım
        String nick="Bahadır";
        nick.concat(" Ertürk");
        System.out.println(nick);//normalde bu anlattıklarımızı bilmesek temel bilgiyle bunun cevabını anlamaya çalışsak deriz
        //ki nick yani Bahadır değerine ekstra olarak Ertürk değerini ata buradan da nick="Bahadır Ertürk" olması gerekli
        //ve sout un içine yazdığımızda da Bahadır Ertürk çıkar derdik ama yukarıda anlattığımız gibi bu Stringe özel yani
        //Bahadır Ertürk ifadesi Stringin heapinde başka bir yerde depolanıyor Bahadır ifadesi ise başka bir yerde bu yüzden
        //de yukarıda sout(nick) ifadesinin yazdıracağı şey Bahadır olacaktır
        //Peki biz Bahadır Ertürk e nasıl ulaşacağız bu da String türünde ve nick ten farklı bir değişken ismiyle olacaltır
        //Orneğin aşağıdaki gibi
        String isim2 =abc.concat(" Efe Ertürk");
        System.out.println(isim2);
        //buradan da STRİNG sınıfı Immutable olarak anlaşılıyor
        // biz Stringteki bu ifadeyi primitive yani sabit yapılarda kullanıyoruz ama eğer en yukarıda göründüğü gibi nesne
        //oluşturacaksak String cinsinden o zaöam işler değişir çünkü o String pool unun içinde tanımlanmaz
        //Örneğin aşağıdaki ifadeye bakalım
        String s=new String("ALİ").intern();//bu intern() ifadesi hem String poolunun içinde bir s olarak bir değer tutuar
        //hem de String havuzundan farklı bir yerde ama yine heapin içinde bir sınıfın içinde tanımlanır o zaman
        String ad1="ALİ";
        System.out.println(s==ad1);// bu ifadede true değerini görmüş olacağız
        //biz eğer intern yazmadan bu yukarıdaki işlemi yapsaydık biri String havuzunun diğeride String havuzundan başka bir
        //sınıfta tanımlanacağı için ve bu nedenlede mantıken referans değerleri farklı olacağı için false değeri döndürücek
        //s.trim() ifadesi eğer String değişkeni olan s veri adındaki Stringin etrafında herhangi bir yerinde boşluk varsa onu
        //siler ama bu işlem yukarıda anlattığım şeylerin özeti olarak Yeni bir string oluşturma anlamına gelir yani s ifadesini değiştirmez
        // s.equalsIgnoreCase(a) s ve a yı büyük küçük harf saymaksızın eşit mi değil mi ona bakar
        // s.compareTo(a) s ve a yı karşılatırıyor eğer s a dan alfabetik olarak daha önce ise -1 geride ise 1 eşit ise 0 değerini döndürür

    }
}
