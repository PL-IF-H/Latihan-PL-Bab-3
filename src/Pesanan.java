package tugasprakbab3;

public class Pesanan {
    private String jenis_bingkai;
    private int harga_bingkai;
    private double luas;
    public void setJenis_bingkai(String jenis){
        this.jenis_bingkai = jenis;
    }

    public String getJenis_bingkai() {
        return jenis_bingkai;
    }
  
    public double hitungLuas(double panjang, double lebar){
        this.luas = panjang * lebar;
        return luas;
    }
}
