package BAB3;

public class Transaksi {
    String id, nama, tanggal;
    Bingkai bingkai;
    
    public Transaksi(String id, String nama, String tanggal, double panjang, double lebar, String jenis) {
        this.id = id;
        this.nama = nama;
        this.tanggal = tanggal;
        bingkai = new Bingkai(panjang, lebar, jenis);
    }
    
    public void DisplayTransaksi(){
        System.out.println("\n======================================================================");
        System.out.println("Harga yang harus dibayar oleh pelanggan bernama " + nama + ", dengan ID " + id + 
                " \ndan pemesanan pada tanggal " + tanggal + " sebesar " + bingkai.hargaFinal() + " rupiah.");
        System.out.println("======================================================================");
    }
}
