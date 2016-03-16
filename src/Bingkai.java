package BAB3;

public class Bingkai {

    double panjang, lebar;
    private double hargaBingkai;
    String jenis;

    public Bingkai() {
    }
    
    public Bingkai(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public Bingkai(double panjang, double lebar, String jenis) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jenis = jenis;
        
        if (jenis.equalsIgnoreCase("hitam metalik")) {
            hargaBingkai = 3000;
        } else if (jenis.equalsIgnoreCase("coklat metalik")) {
            hargaBingkai = 2700;
        } else if (jenis.equalsIgnoreCase("coklat bercorak")) {
            hargaBingkai = 2300;
        } else if (jenis.equalsIgnoreCase("hitam bercorak")) {
            hargaBingkai = 2500;
        } else if (jenis.equalsIgnoreCase("emas")) {
            hargaBingkai = 5000;
        } else if (jenis.equalsIgnoreCase("perak")) {
            hargaBingkai = 4000;
        } else {
            hargaBingkai = 0;
        }
    }

    private double TotalBayar() {
        return hargaBingkai * panjang * lebar;
    }
    
    public double hargaFinal() {
        double diskon = 0;
        if (jenis.equalsIgnoreCase("hitam metalik") || 
                jenis.equalsIgnoreCase("emas") ||
                jenis.equalsIgnoreCase("perak")) {
            if (TotalBayar() >= 600000) {
                diskon = 0.15;
            } else if (TotalBayar() >= 450000) {
                diskon = 0.1;
            } else if (TotalBayar() >= 300000) {
                diskon = 0.05;
            }
        }
        return TotalBayar() - (TotalBayar() * diskon);
    }

    public void DispalayMessage() {
        System.out.println("\n==========================================================");
        System.out.println("Harga yang harus anda bayarkan sebesar " + hargaFinal() + " rupiah");
        System.out.println("==========================================================");
    }
}
