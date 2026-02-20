package Switch_Case;

public class SwitchCase {
    public static void main(String[] args) {
        //NOT : Eğer ard arda çok fazla if else if kullanıyorsanız okunabilirlik açısından daha iyi olan switch
        // case i tercih edin
        //Switch Case
        //NOT : Switch içi double veya float değerinde olamaz yani kayan noktalı ifadeler olamaz
        int haftaninKacinciGunu=5;
        switch (haftaninKacinciGunu){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default://durum dışı ifadeler için kullanılır
                System.out.println("Geçersiz bir değer girildi");
                //break ifadesi olmasaydı eğer örneğin int değeri 1 olsun ve 5. de break ifadesi olsun
                //5 de dahil 1 den 5 e kadar hepsi ekrana yazdırılır
        }
        System.out.println("pROGRAMDAN çIKILDI!");





    }
}
