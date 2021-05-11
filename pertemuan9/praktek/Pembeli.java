import java.util.ArrayList;

public class Pembeli {
    private String noKTP;
    private String nama;
    ArrayList<Mobil> listMbl = new ArrayList<>();

    Pembeli() {

    }

    Pembeli(String noKTP, String nama) {

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

    void beliMobil(Mobil mbl) {

    }

    void invoice() {

    }

}