import java.util.Stack;

public class TestStack {
      public static void main(String args[]){
            Mobil mobil = new Mobil();
            System.out.println(mobil.sisaMobil());
 
            mobil.tambahMobil("Volkswagen");
            mobil.tambahMobil("Mercedes Bens");
            mobil.tambahMobil("Mitsubitshi");
            System.out.println(mobil.sisaMobil());
 
            mobil.gantiMobil(2,"Toyota");
            System.out.println(mobil.sisaMobil());
 
            mobil.mobilRusak();
            System.out.println(mobil.sisaMobil());
      }
}
 
class Garasi_Mobil {
      Stack<String> car = new Stack<String>();
 
      public Garasi_Mobil(){
 
      }
      public void setMobil(Stack<String> car) {
            this.car = car;
      }
      public Stack<String> getMobil(){
            return this.car;
      }
} 
 
class Mobil extends Garasi_Mobil {
      public void tambahMobil(String car){
            super.getMobil().push(car);
      }
      public String mobilRusak(){
            return super.getMobil().pop();
      }
      public void gantiMobil(int index,String car){
            super.getMobil().set(index, car);
      }
      public Stack<String> sisaMobil(){
            return super.getMobil();
      }
}

