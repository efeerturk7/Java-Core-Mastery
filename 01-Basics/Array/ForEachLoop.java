package Array;

public class ForEachLoop {
    public static void main(String[] args) {
        String isimler[]={"zeren","sueda","sude"};
        int sayilar[]={3,5,6,13,78};
        for (int oankiSayi : sayilar){
            System.out.println("For each :"+oankiSayi);
        }
        diziYazdir(isimler);


    }
    public static void diziYazdir(String dizi[]){
        for (String s : dizi){
            System.out.println("for each : "+s);
        }

    }
}
