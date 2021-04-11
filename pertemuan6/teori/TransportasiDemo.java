import Transportasi.Bicycle;
import Transportasi.Car;

public class TransportasiDemo{
    public static void main(String[] args){
        Bicycle Jaw = new Bicycle();
        System.out.println("====== Bicycle ====== ");
        Jaw.JalanKanan();
        Jaw.JalanLurus();
        Car Lal = new Car();
        System.out.println("====== Car ====== ");
        Lal.Menu();
    }
}