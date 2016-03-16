package modul1bab3;

public class Pemesan {

    String ID, nama, tanggal;
//overload
    public Pemesan() {
        this.ID = "";
        this.nama = "";
        this.tanggal = "";
    }
//overload
    public Pemesan(String ID, String nama, String tanggal) {
        this.ID = ID;
        this.nama = nama;
        this.tanggal = tanggal;
    }
}