package Methods;

public class Methods1 {
    //Parametre alan metotlar : Örneğin  void toplam(int s1,int s2){ System.out.println(s1+s2);}
    //Ancak değer döndüren methotlarda ise void yerine değişken konulur mesela
    // int toplamiBul(int s1,int s2){ return s1+s2;}
    // int toplam = toplamiBul(s1,s2);
    //return ifadesi yanına yazılan ifadeden sonra metottan çıkmaya yarar
    public static void main(String[] args) {
        // metotlar kod kalabalığı yapmamak için kullanılabilir
        toplama();//result : 15
        toplama1(45,34);
        toplama2(23,67);
        System.out.println("Toplam 1 : "+ toplama1(56,23));// bu soutun içine ancak geriye
        //döndürülen (return) ifadeleri yazılabilir yani toplama2 be toplama metotları çağırılmaz
        //aynı şekilde değişken tanımlamada da geri dönen (return) ifade kullanılır
    }
    public static void toplama(){//parametresiz
        int a=10;
        int b=5;
        System.out.println("toplam : "+a+b);
        //bu işlem için bu metot yeterli değildir çünkü başka değerlerin toplamını göstermesini istesek
        //metotun için sayıları değiştirmek gerek bu da boş yere zaman harcamamıza neden olur
        //o yüzden parametreli metot kullanmak daha mantıklıdır çünkü main methodu içinden kolaylıkla değerler
        //değiştirilebilir aynen aşağıdaki gibi


    }
    public static int toplama1(int a,int b){//bu 1. yol olarak
        return a+b;
    }
    public static void toplama2(int a,int b){// bu da ikinci yol parametreli dönüşü içermeyen
        System.out.println(a+b);
    }

}
