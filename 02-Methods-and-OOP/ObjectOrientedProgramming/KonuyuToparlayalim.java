package ObjectOrientedProgramming;

public class KonuyuToparlayalim {
    public static void main(String[] args) {
        Canli kartal=new Kartal();
        kartal.adiniSoyle(); // Canli sınıfındaki adini soyle metodunu çağıracaktır
        //yani kartal.ucmak(); diyemiyoruz hata verir ancak aşağıdaki gibi casting yaparsak hata vermez
        ((Kartal)kartal).ucmak(); //bu şekilde çağırabiliriz DownCasting



    }
    public static Canli rastgeleSec(){
        int sec=(int) (Math.random()*3);
        Canli canli;
        if (sec==0){
            canli=new Canli();
        } else if (sec==1) {
            canli=new Kartal();
        }else {
            canli=new Panda();
        }
        return canli;
    }
}
class Canli{
    public void adiniSoyle(){
        System.out.println("Ben bir canli sınıfı nesnesiyim");
    }
}
class Kartal extends Canli{
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir kartal sınıfı nesnesiyim");
    }
    public void ucmak(){
        System.out.println("Ben uçabiliyorum");
    }
}
class Panda extends Canli{
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir panda sınıfı nesnesiyim");
    }
    public void oyna(){
        System.out.println("Panda oynuyor");
    }
}
