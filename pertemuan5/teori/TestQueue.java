import java.util.Queue;
import java.util.LinkedList;
public class TestQueue {
      public static void main(String args[]){
            Rokok rokok = new Rokok();
            System.out.println(rokok.sisaRokok());
 
            rokok.tambahRokok("Malboro");
            rokok.tambahRokok("Sampoerna");
            rokok.tambahRokok("Gudang Garam");
            rokok.tambahRokok("Modena");
            rokok.tambahRokok("Esse");
            System.out.println(rokok.sisaRokok());
 
            rokok.rokokHilang(3);
            System.out.println(rokok.sisaRokok());
      }      
}

class Gerai_Rokok {
      Queue<String> cigarette = new LinkedList<String>();
 
      public Gerai_Rokok(){
 
      }
      public void setRokok(Queue<String> cigarette) {
            this.cigarette = cigarette;
      }
      public Queue<String> getRokok(){
            return this.cigarette;
      }
}

class Rokok extends Gerai_Rokok {
      public void tambahRokok(String cigarette){
            super.getRokok().add(cigarette);
      }
      public void rokokHilang(int index){
            System.out.println(super.getRokok().poll());
      }
      public Queue<String> sisaRokok(){
            return super.getRokok();
      }
} 