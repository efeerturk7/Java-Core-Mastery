package Array;

public class IkiBoyutluExample {
    public static void main(String[] args) {
        //Soru : 3'e 3'lük bir tabloda Emrenin kendine 0 Hasana 100 Ali ye 200
        //Hasanın emreye 350 hasanın kendisine 0 hasanın aliye 250
        //alinin emreye 150 alinin hasana 500 alinin kendisine 0 tl borcu var bunu gösterecek
        //şekilde bir program yazınız
        int emreBorc=0;
        int hasanBorc=0;
        int aliBorc=0;
         String []isimler={"Emre","Hasan","Ali"};
         int borclar[][]={{0,100,200},{350,0,250},{150,500,0}};
         for (int satir=0;satir<borclar.length;satir++){
             for (int sutun=0;sutun< borclar.length;sutun++){
                 System.out.println(isimler[satir]+" nin "+borclar[satir][sutun]+"TL Borcu var "+isimler[sutun]+" a ");
             }
         }


    }
}
