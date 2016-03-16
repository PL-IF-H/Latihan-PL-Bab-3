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
	//Overloading method
    public double getHarga(Pesanan a){
        if("Hitam Metalik".equalsIgnoreCase(a.jenis_bingkai)){
            return this.harga_bingkai = 3000;
        } else if("Coklat Metalik".equalsIgnoreCase(a.jenis_bingkai)){
            return this.harga_bingkai = 2700;
        } else if("Coklat Bercorak".equalsIgnoreCase(a.jenis_bingkai)){
            return this.harga_bingkai = 2300;
        } else if("Hitam Bercorak".equalsIgnoreCase(a.jenis_bingkai)){
            return this.harga_bingkai = 2500;
        } else if("Emas".equalsIgnoreCase(a.jenis_bingkai)){
            return this.harga_bingkai = 5000;
        } else if("Perak".equalsIgnoreCase(a.jenis_bingkai)){
            return this.harga_bingkai = 4000;
        } else{
            return this.harga_bingkai = 0;
        }
    }
    //overloading method
    public double getHarga(){
        return this.harga_bingkai * luas;
    }
}
