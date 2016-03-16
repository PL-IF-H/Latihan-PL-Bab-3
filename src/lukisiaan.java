//Identifikasi
//Class  : lukisiaan
//Objek  : pemesan
//Method : lukisiaan(constructor), lukisiaan (constructor), setLuas, diskon, displayPesanan 
//Atribut: idpemesan, nama, tanggal, luas, bayar, diskon, kembali


package tugasbiasa;
public class lukisiaan {

    public String idpemesan;
    public String nama;
    public String tanggal;
    public int luas;
    public int bayar;
    public int diskon;

    public lukisiaan (String idpemesan) {
        this.idpemesan = idpemesan;
    }
    public lukisiaan (int luas) {
        this.luas=luas;
    }

    public void setLuas (int panjang, int lebar) {
        luas = panjang * lebar;
    }

    public void diskon(int pilihan, double a) {
        int diskon = bayar;
        if (pilihan == 1 || pilihan == 5 || pilihan == 6) {
            if (bayar > 600000) {
                a = 0.15 * diskon;
                System.out.println("Total\t\t: Rp." + (bayar - a));
            }
            else if ((bayar > 450000)) {
                a = 0.01 * (diskon / 100);
                System.out.println("Total\t\t: Rp." + (bayar - a));
            }
            else if (bayar > 300000) {
                a = 0.05 * diskon;
                System.out.println("Total\t\t: Rp." + (bayar - a));
            }   
            else {
                System.out.println("Tidak mendapat Diskon");
            }
        } 
        else {
            System.out.println("Tidak ada diskon pada bingkai yang dipilih");
        }

    }

    public void displayPesanan(int harga, int pilihan, int a) {
        bayar = luas * harga;
        System.out.println("Luas bingkai\t: " + luas+" m2");
        System.out.println("Harga\t\t: Rp." + bayar);
        diskon(pilihan, a);
    }

}