public class bingkai {
    public String nama, tanggal, idpemesan;
    public int zzz, bayar, diskon;
    public bingkai(String idpemesan) {
        this.idpemesan = idpemesan;
    }
    public bingkai(int zzz) {
        this.zzz = zzz;
    }
    public void setzzz(int panjang, int lebar) {
        zzz = 2*(panjang + lebar);
    }
    public void diskon(int pilihan, double a) {
        int diskon = bayar;
        if (pilihan == 1 || pilihan == 5 || pilihan == 6) {
            if (bayar > 600000) {
                a = 0.15 * diskon;
                System.out.println("Total\t\t: Rp." + (bayar - a));
            } else if ((bayar > 450000)) {
                a = 0.01 * (diskon / 100);
                System.out.println("Total\t\t: Rp." + (bayar - a));
            } else if (bayar > 300000) {
                a = 0.05 * diskon;
                System.out.println("Total\t\t: Rp." + (bayar - a));
            } else {
                System.out.println("Maaf anda tidak mendapat diskon");
            }
        } else {
            System.out.println("Diskon tidak tersedia pada bingkai yang dipilih");
        }

    }
    public void displayPesanan(int harga, int pilihan, int a) {
        bayar = zzz * harga;
        System.out.println("Panjang bingkai\t: " + zzz + " m");
        System.out.println("Harga\t\t: Rp." + bayar);
        diskon(pilihan, a);
    }
}