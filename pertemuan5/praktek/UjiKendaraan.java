public class UjiKendaraan {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Bicycle sepeda = new Bicycle();
        MotorVehicle motor = new MotorVehicle(3, "H 131 XO");
    

        sepeda.goStraight();
        sepeda.ringBell();
        motor.apa();
        kendaraan.turnRight();
        motor.getSizeofEngine();
    }
}