public class MotorVehicle extends Vehicle {
    int sizeofEngine = 1;
    String licencePlate = "H 1 IDN";

    MotorVehicle() {

    }

    public MotorVehicle(int sizeEng, String lcPlate) {
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;

    }

    public void apa() {
        System.out.println(sizeofEngine);
        System.out.println(licencePlate);

    }

    public int getSizeofEngine() {
        return sizeofEngine;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

}