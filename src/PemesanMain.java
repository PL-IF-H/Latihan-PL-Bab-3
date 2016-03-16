package modul1bab3;

import java.util.Scanner;

public class PemesanMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bingkai bingkai = new Bingkai();
        int lanjut;
        int jenis;
        System.out.print("ID\t\t: ");
        String nama = in.nextLine();
        System.out.print("Nama\t\t: ");
        String ID = in.nextLine();
        System.out.print("Tanggal Pesan\t: ");
        String tanggal = in.nextLine();
        Pemesan X = new Pemesan(ID, nama, tanggal);
        System.out.println();
        do {
            bingkai.Jenis();
            System.out.print("Pilihan Jenis\t: ");
            jenis = in.nextInt();
            bingkai.Jenis(jenis);
            System.out.print("Panjang\t\t: ");
            int panjang = in.nextInt();
            System.out.print("Lebar\t\t: ");
            int lebar = in.nextInt();
            bingkai.Bingkai(panjang, lebar);
            System.out.println("Harga\t\t: " + bingkai.Harga(jenis));
            System.out.println("Diskom\t\t: " + bingkai.Diskon(jenis));
            double total = bingkai.Harga(jenis) - bingkai.Diskon(jenis);
            System.out.println("Yang Harus Dibayar : " + total);
            System.out.print("Mau Lagi 1.Ya 0.Tidak : ");
            lanjut = in.nextInt();
            System.out.println();
        } while (lanjut != 0);
    }

}
