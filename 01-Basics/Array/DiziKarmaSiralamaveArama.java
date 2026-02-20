package Array;

public class DiziKarmaSiralamaveArama {
    public static void main(String[] args) {
        int sayilar[]={1,9,5,2,7,9,60,120,55,-9};
        diziyiYerDegistir(sayilar);
        selectionSort(sayilar);
        dizileriYazdir(sayilar);
    }
    public static void dizileriYazdir(int dizi[]){
        for (int i : dizi){
            System.out.print(i+",");
        }
    }
    public static void diziyiYerDegistir(int dizi[]){
        for (int index=dizi.length-1;index>0;index--){
            int rastgeleIndex=(int) Math.random()*(index+1);
            int temp=dizi[index];
            dizi[index]=dizi[rastgeleIndex];
            dizi[rastgeleIndex]=temp;

        }

    }
    //ilk indexteki elemanı dizideki en kucuk eleman olarak kabul ederiz daha sonra
    //kendi indexinden sonraki indexteki elemanlarla büyük mü kücük mü diye karşılaştırma yapar
    //eger kucukse onun yerine gecer bu böyle devam eder ve en sonunda dizideki 0.index en kucuk
    //sonuncu olan index ise en büyük eleman olur yani dizi kısacası kucukten buyuge dogru sıralanmış
    //olur

    public static void selectionSort(int[]dizi){
        for (int i=0;i< dizi.length-1;i++){
            // en küçük elemanın bulunması ve indeksin bulunması
            int oankiEnkucuk=dizi[i];
            int oankiEnkucukIndex=i;
            for (int j=i+1;j<dizi.length;j++){
                if (oankiEnkucuk>dizi[j]){
                    oankiEnkucuk=dizi[j];
                    oankiEnkucukIndex=j;
                }
            }
            if (oankiEnkucukIndex!=i){
                dizi[oankiEnkucukIndex]=dizi[i];
                dizi[i]=oankiEnkucuk;

            }
        }

    }
}
