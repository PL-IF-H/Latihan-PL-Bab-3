package mainbinkai;

import java.util.Scanner;

public class binkai {

    Scanner in = new Scanner(System.in);

    public String jenis;
    public int panjang, lebar, harga, keliling, jum;
    double total, diskon, total_harga;
    
    //overloading constructor
    public binkai(String jenis, int lebar, int panjang, int jum) {
        this.jenis = jenis;
        this.lebar = lebar;
        this.panjang = panjang;
        this.jum = jum;
    }
    //overloading constructor
    public binkai() {
        jenis = "";
        lebar = 0;
        panjang = 0;
        jum = 0;
    }

    //overloading method
    public void set(int jum, int lebar, int panjang) {
        this.jum = jum;
        this.lebar = lebar;
        this.panjang = panjang;
    }

    //overloading method
    public void set(String jenis) {
        this.jenis = jenis;
    }
   
    int Keliling(int lebar, int panjang) {
        return 2 * (panjang + lebar);
    }

    public void hargaJenis() {
        do {
            switch (jenis) {
                case "Hitam Metalik":
                    harga = 4000;
                    break;
                case "Coklat Metalik":
                    harga = 2700;
                    break;
                case "Coklat Bercorak":
                    harga = 2300;
                case "Hitam Bercorak":
                    harga = 2500;
                    break;
                case "Emas":
                    harga = 5000;
                    break;
                case "Perak":
                    harga = 4000;
                    break;
                default:
                    System.out.println("Jenis Salah, Silakan ulangi");
                    System.out.println("Jenis : ");
                    jenis = in.nextLine();
            }
        } while (harga == 0);

    }

    public void total() {

        total = harga * Keliling(panjang, lebar)*jum;

    }

    public void diskon() {

        switch (jenis) {
            case "Hitam Metalik":
                if (total > 600000) {
                    diskon = 15 * total / 100;
                } else if (total > 450000) {
                    diskon = 10 * total / 100;
                } else if (total > 300000) {
                    diskon = 5 * total / 100;
                } else {
                    diskon = 0;
                }
                break;
            case "Emas":
                if (total > 600000) {
                    diskon = 15 * total / 100;
                } else if (total > 450000) {
                    diskon = 10 * total / 100;
                } else if (total > 300000) {
                    diskon = 5 * total / 100;
                } else {
                    diskon = 0;
                }
                break;
            case "Perak":
                if (total > 600000) {
                    diskon = 15 * total / 100;
                } else if (total > 450000) {
                    diskon = 10 * total / 100;
                } else if (total > 300000) {
                    diskon = 5 * total / 100;
                } else {
                    diskon = 0;
                }
                break;
            default:
                diskon = 0;
                break;

        }

    }

    public void tot() {
        total_harga = total - diskon;
    }

    public void display() {
        hargaJenis();
        total();
        diskon();
        System.out.println("Jenis Binkai    : " + jenis);
        System.out.println("Harga Satuan    : " + harga+("/meter"));
        System.out.println("Diskon          : " + diskon);
        tot();
        System.out.println("Total Harga     : " + total_harga);
        System.out.println("=======================================");
    }
}
