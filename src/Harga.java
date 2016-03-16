package Pemesan;

import java.util.*;

public class Harga {

    private String jenisBingkai;
    private int ukuran = 0, panjang, lebar;
    private double hitammetalik, coklatmetalik, coklatbercorak, hitambercorak, emas, perak;
    Scanner in = new Scanner(System.in);
    int pilihan;
    

    public void setJenis(double hitammetalik, double coklatmetalik, double coklatbercorak, double hitambercorak, double emas, double perak) {//overloadmethod
        this.hitammetalik = hitammetalik;
        this.hitambercorak = hitambercorak;
        this.coklatmetalik = coklatmetalik;
        this.coklatbercorak = coklatbercorak;
        this.emas = emas;
        this.perak = perak;
    }

    public void setJenisBingkai(String JenisBingkai) {
        this.jenisBingkai = JenisBingkai;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getUkuran() {
        System.out.println("Masukkan Ukuran Bingkai Yang Anda Inginkan");
        System.out.println("Masukkan Panjang Bingkai : ");
        panjang = in.nextInt();
        System.out.println("Masukkan Lebar Bingkai : ");
        lebar = in.nextInt();
        ukuran = panjang * lebar;
        return ukuran;
    }

    public double getHItamMetalik() {
        hitammetalik = ukuran * 3000;
        if (hitammetalik > 300000) {
            hitammetalik %= 5;
        }
        if (hitammetalik > 450000) {
            hitammetalik %= 10;
        }
        if (hitammetalik > 600000) {
            hitammetalik %= 15;
        }
        return hitammetalik;
    }

    public double getHitamBercorak() {
        hitambercorak = ukuran * 2500;
        return hitambercorak;
    }

    public double getCoklatMetalik() {
        coklatmetalik = ukuran * 2700;
        return coklatmetalik;
    }

    public double getCoklatBercorak() {
        coklatbercorak = ukuran * 2300;
        return coklatbercorak;
    }

    public double getEmas() {
        emas = ukuran * 5000;
        if (emas > 300000) {
            emas %= 5;
        }
        if (emas > 450000) {
            emas %= 10;
        }
        if (emas > 600000) {
            emas %= 15;
        }
        return emas;
    }

    public double getPerak() {
        perak = ukuran * 4000;
        if (perak > 300000) {
            perak %= 5;
        }
        if (perak > 450000) {
            perak %= 10;
        }
        if (perak > 600000) {
            perak %= 15;
        }
        return perak;
    }

    public String[][] getJenisBingkai() {
        String[][] jenisBingkai = {{"Jenis Bingkai", "Harga/Meter"},
        {"Hitam Metalik", "3000"},
        {"Coklat Metalik", "2700"},
        {"Coklat Bercorak", "2300"},
        {"Hitam Bercorak", "2500"},
        {"Emas", "5000"},
        {"Perak", "4000"}};
        return jenisBingkai;
    }
    

    
    public void getPesanan() {
        Harga h = new Harga();
    JenisBingkai jb = new JenisBingkai();
        System.out.println("================================");
        do {
            System.out.println(jb.getJenisBingkai());
            System.out.println("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Hitam Metalik");
                    System.out.println("" +h.getUkuran());
                    hitammetalik = ukuran*3000;
                    System.out.println(+hitammetalik);
                    System.out.println(""+h.getHItamMetalik());
                    break;
                case 2:
                    System.out.println("Coklat Metalik");
                    System.out.println("" + h.getUkuran());
                    coklatmetalik = ukuran*2700;
                    System.out.println(+coklatmetalik);
                    System.out.println("" + h.getCoklatMetalik());
                    break;
                case 3:
                    System.out.println("Coklat Bercorak");
                    System.out.println("" + h.getUkuran());
                    coklatbercorak = ukuran*2300;
                    System.out.println(+coklatbercorak);
                    System.out.println("" + h.getCoklatBercorak());
                    break;
                case 4:
                    System.out.println("Hitam Bercorak");
                    System.out.println("" + h.getUkuran());
                    hitambercorak = ukuran*3000;
                    System.out.println(+hitambercorak);
                    System.out.println("" + h.getHitamBercorak());
                    break;
                case 5:
                    System.out.println("Emas");
                    System.out.println("" + h.getUkuran());
                    emas = ukuran*3000;
                    System.out.println(+emas);
                    System.out.println("" + h.getEmas());
                    break;
                case 6:
                    System.out.println("Perak");
                    System.out.println("" + h.getUkuran());
                    perak = ukuran*3000;
                    System.out.println(+perak);
                    System.out.println("" + h.getPerak());
                    break;
                case 7:
                    break;
            }
        } while (pilihan != 7);
    }

    public void display() {
        System.out.println("");

    }
}
