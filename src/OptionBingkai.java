package optionbingkai;

/**
 *
 * @author user
 */
public class OptionBingkai {

    String IDPemesan;
    String namaPemesan;
    String tanggalPemesan;
    String jenisBingkai;
    int ukuranBingkai;
    int panjang;
    int lebar;

    public OptionBingkai() {
        this.jenisBingkai = "";
        this.panjang = 0;
        this.lebar = 0;
        this.IDPemesan = "";
        this.namaPemesan = "";
        this.tanggalPemesan = "";
        this.ukuranBingkai = 0;

    }

    public OptionBingkai(String jenisBingkai, int panjang, int lebar) {
        this.jenisBingkai = jenisBingkai;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public String jenisBingkai() {
        return jenisBingkai;
    }

    public void panjang(int s) {
        this.panjang = s;
    }

    public void lebar(int s) {
        this.lebar = s;
    }

    public int HitungLuas() {
        int HitungLuas = this.panjang * this.lebar;
        return HitungLuas;
    }

    public double diskon(double Harga) {
        double diskonnya = 0;

        if (Harga > 300000) {
            diskonnya = Harga * 0.05;

        } else if (Harga > 450000) {
            diskonnya = Harga * 0.1;
        } else if (Harga > 600000) {
            diskonnya = Harga * 0.15;

        }
        return diskonnya;

    }
}
