package jenisbingkai;

public class pembeli {
    private String IDpembeli, nama, tanggalpesan;
    public pembeli (String IDpembeli, String nama, String tanggalpesan){
        this.IDpembeli = IDpembeli;
        this.nama = nama;
        this.tanggalpesan = tanggalpesan;
    }
    //overload
    public pembeli (){
        this.IDpembeli = " ";
        this.nama = " ";
        this.tanggalpesan = " ";
    }
}
