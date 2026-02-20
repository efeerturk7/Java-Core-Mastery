package Array;

public class IkiBoyutluDizi {
    //veri tipi [][] diziAdi=new veriTipi[satır sayısı][sütun sayısı];
    // burada dikkat edilmesi gereken bir konuda indextir iki boyutlu diziler genelde
    //tablo tanımlamada kullanılır tabloda arama yapmak istiyorsak o zaman ilk satır ve sütunların 0 dan
    //başladığını unutmamak gereklidir
    public static void main(String[] args) {
        int sayilar[][] = {{3, 4, 5}, {5, 8, 34}, {1, 5, 89}};//3*3 matris sayilar.length == 3
        for (int satir = 0; satir < sayilar.length; satir++) {
            for (int sutun = 0; sutun < sayilar[satir].length; sutun++) {
                System.out.println(satir + " .satırının " + sutun + " .sütunundaki değer : " + sayilar[satir][sutun]);
            }
        }
    }


}
