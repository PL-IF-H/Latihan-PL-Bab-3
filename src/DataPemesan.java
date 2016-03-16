package Pemesan;
/*object pemesan,bingkai
class jenisbingkai, data pemesan,harga
atribut id nama tanggal jenis
*/
import java.util.*;

public class DataPemesan {

    private String id, nama, tanggal;
    Scanner in = new Scanner(System.in);

    public void setData(String id, String nama, String tanggal) {//overload method
        this.id = id;
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public String getID() {
        System.out.println("Masukkan ID anda : ");
        id = in.nextLine();
        return id;
    }

    public String getNama() {
        System.out.println("Masukkan Nama Anda : ");
        nama = in.nextLine();
        return nama;
    }

    public String getTanggal() {
        System.out.println("Masukkan Tanggal Pesanan : ");
        tanggal = in.nextLine();
        return tanggal;
    }

    public void displayDP() {
        System.out.println("Nama anda " + nama);
        System.out.println("ID anda " + id);
        System.out.println("Tanggal Pembelian " + tanggal);
    }
}
