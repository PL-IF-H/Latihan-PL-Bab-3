package tugasprakbab3;

public class Client {
    private String ID_Pesanan,nama_pemesan,tanggal;
    public Client(){
        ID_Pesanan = "";
        nama_pemesan = "";
        tanggal = "";
    }
    public Client(String id, String nama, String tgl){
        ID_Pesanan = id;
        nama_pemesan = nama;
        tanggal = tgl;
    }

    public String getID_Pesanan() {
        return ID_Pesanan;
    }

    public String getNama_pemesan() {
        return nama_pemesan;
    }

    public String getTanggal() {
        return tanggal;
    }
}
