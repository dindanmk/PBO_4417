import java.util.ArrayList;

public class Biodata {
    String noKTP;
    String nama;
    ArrayList<Pembeli> listPembeli = new ArrayList<>();
    ArrayList<Karyawan> listKaryawan = new ArrayList<>();
    ArrayList<Mobil> listMobil = new ArrayList<>();

    Biodata() {

    }

    Biodata(String noKTP, String nama) {

    }

    public void setNoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}