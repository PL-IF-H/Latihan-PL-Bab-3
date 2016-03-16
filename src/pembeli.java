package lukisan;

public class pembeli {

    String idPemesan;
    String namaPemesan;
    String tglPemesanan;
    int luas;
    int bayar;
    int potongan;

    //OVERLOADING
    public pembeli(String idPemesan) {
        this.idPemesan = idPemesan;
    }
    public pembeli (int luas) {
        this.luas=luas;
    }

    public void luasLukisan(int panjang, int lebar) {
        luas = panjang * lebar;
    }

    public void displayBingkai() {
        System.out.println("PILIHAN BINGKAI LUKISAN :\n");
        System.out.println("1.Hitam Metalic\n2.Coklat Metalic\n3.Coklat bercorak"
                + "\n4.Hitam Bercorak\n5.Emas\n6.Perak");
        System.out.print("\nPilihan : ");
    }

    public void diskon(int pilihan) {
        int diskon = bayar;
        if (pilihan == 1 || pilihan == 5 || pilihan == 6) {
            if ((bayar > 600000)) {
                System.out.println("Anda mendapat diskon 15% yaitu sebesar \nRp." + (15 * diskon / 100));
                System.out.println("Total yang anda bayar = " + (bayar - (15 * diskon / 100)));
            }else if ((bayar > 450000)) {
                System.out.println("Anda mendapat diskon 10% yaitu sebesar \nRp." + (10 * diskon / 100));
                System.out.println("Total yang anda bayar = " + (bayar - (10 * diskon / 100)));
            }else if (bayar > 300000) {
                System.out.println("Anda mendapat diskon 5% yaitu sebesar \nRp." + (5 * diskon / 100));
                System.out.println("Total yang anda bayar = " + (bayar - (5 * diskon / 100)));
            }   else {
                System.out.println("Tidak mendapat Diskon");
            }
        } else {
            System.out.println("Tidak ada diskon pada bingkai yang dipilih");
        }

    }

    public void uang(int harga, int pilihan) {
        bayar = luas * harga;
        System.out.println("Luas bingkai = " + luas);
        System.out.println("Harga = Rp." + bayar);
        diskon(pilihan);
    }

}
