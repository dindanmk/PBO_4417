import java.util.Scanner;
class Mobil {
    String warna;
    int tahunProduksi;
    boolean hidupkanMobil = false;
    boolean matikanMobil = true;
    int ubahGigi;
}
public class MobilDemo2 {
    public static void main(String[] args){
        //Membuat objek
        Mobil mobilku = new Mobil();

        //Membuat Scanner Baru
        Scanner keyboard = new Scanner(System.in);

        //Memanggil atribut dan memberi nilai
        System.out.print(" Warna : ");
        mobilku.warna = keyboard.nextLine();
        System.out.print(" Tahun : ");
        mobilku.tahunProduksi = keyboard.nextInt();
        System.out.println(" Mesin : "+ mobilku.hidupkanMobil);
        System.out.println(" Ubah Gigi : "+ mobilku.ubahGigi);
        mobilku.ubahGigi = 2;
        System.out.println(" Press any key to continue... ");
    }
}