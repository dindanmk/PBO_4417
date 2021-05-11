import java.util.Scanner;

public class HarpindoKitaApp {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Karyawan officer = new Karyawan();
        char i = 'w';

        while(i != 'q') {
            System.out.println("Welcome TO Harpindo Kita");
            System.out.println("Sign Up");
            System.out.println("1. Karyawan");
            System.out.println("2. Pembeli");
            System.out.println("PRESS '0' TO QUIT");
            int choice = myObj.nextInt();
            if (choice == 1) {
                System.out.println("Masukkan No KTP Anda :");
                String noKTP = myObj.nextLine();
                officer.setNoKTP(noKTP);
                System.out.println("Masukkan Nama Anda :");
                String nama = myObj.nextLine();
                officer.setNama(nama);
                
            } else if (choice == 2) {
                System.out.println("Tipe Pembeli : ");
                System.out.println("1. Individu");
                System.out.println("2. Borongan");
                int tCustomer = myObj.nextInt();
                if (tCustomer == 1) {
                    System.out.println("Masukkan No KTP Anda :");
                    String noKTP = myObj.nextLine();
                    System.out.println("Masukkan Nama Anda :");
                    String nama = myObj.nextLine();
                    Pembeli customer = new PembeliIndividu(noKTP, nama);
                    System.out.println(customer.getNama());
                    
                } else {
                    System.out.println("Masukkan No KTP Anda :");
                    String noKTP = myObj.nextLine();
                    System.out.println("Masukkan Nama Anda :");
                    String nama = myObj.nextLine();
                    Pembeli customer2 = new PembeliBorongan(noKTP, nama);
                    System.out.println(customer2.getNama());
                }
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Please Input Only Displayed in Menu");
                continue;
            }
        }
        
    }
}