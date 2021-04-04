import java.util.ArrayList;

public class TestArrayList {
      public static void main(String args[]){
           Mobil mobil = new Mobil();
           System.out.println(mobil.sisaMobil());

           mobil.tambahMobil("Toyota");
           mobil.tambahMobil("Jazz");
           mobil.tambahMobil("Brio");
           System.out.println(mobil.sisaMobil());

           mobil.gantiMobil(1,"BMW");
           System.out.println(mobil.sisaMobil());

           mobil.mobilRusak(0);
           System.out.println(mobil.sisaMobil());
      }
}

class Garasi_Mobil {
      ArrayList<String> car = new ArrayList<>();

      public Garasi_Mobil(){

      }
      public void setMobil(ArrayList<String> car) {
            this.car = car;
      }
      public ArrayList<String> getMobil(){
            return this.car;
      }
} 

class Mobil extends Garasi_Mobil {
      public void tambahMobil(String car){
            super.getMobil().add(car);
      }
      public String mobilRusak(int index){
            return super.getMobil().remove(index);
      }
      public void gantiMobil(int index, String car){
            super.getMobil().set(index, car);
      }
      public ArrayList<String> sisaMobil(){
            return super.getMobil();
      }
}