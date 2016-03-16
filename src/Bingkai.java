package tugaspemlan3;
//* Nama : Darin Nadhifah
//* NIM : 155150207111063
//* Kelas : TIF-H
public class Bingkai {

    public Bingkai() {
    }
    String ID, nama, tgl, jenis;
    int p, l;

    public void menuBingkai(String ID, String nama, String tgl, String jenis) {
        this.ID = ID;
        this.nama = nama;
        this.tgl = tgl;
        this.jenis = jenis;
    }

    public void menuBingkai(int p, int l) { //overloading
        this.p = p;
        this.l = l;
    }
    public void display(){
        System.out.println("");
        System.out.println("ID Anda             : "+ID);
        System.out.println("Nama                : "+nama);
        System.out.println("Tanggal Pemesanan   : "+tgl);
        
    }
}
