package Donguler;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int a = 0; a < 3; a++) {
            System.out.println("a :" + a);
            for (int b = 0; b < 4; b++) {
                if (a == 1 && b == 2) {
                    break;//break ifadesi nereye yazılmışsa sadece onu etkiler yani burada içteki
                    //döngüye yazıldığı için içteki döngüye etki eder.
                }//Not : dışarı for u etkilemesini istediğimizde ise
                //For yazısının üstüne herhangi bir adlandırma yazıp daha sonra : işareti koyarız
                //alttaki for döngüsüne de aynı şekilde farklı bir isim takarız daha sonra alttaki
                //for döngüsünün icine break üstteki for döngüsünün ismi ;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;// i 4 eşit olduğunda döngüyü durdurur i=0,1,2,3 değerleri gözükür
            }
            System.out.println("İ nin değeri : " + i);
        }
        //break yerine continue ifadesini kullanırsak sadece o şartı sağlayan şey ekrana yazılmıyor
    }
}
