package Pemesan;

import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        JenisBingkai jb = new JenisBingkai();
        DataPemesan dp = new DataPemesan();
        Harga h = new Harga();
        int pilihan, pilih;

        do {
            System.out.println("Menu : ");
            System.out.println("1.Daftar Harga Bingkai");
            System.out.println("2.Memesan Bingkai");
            System.out.println("3.Lihat Hasil Pembelian");
            System.out.println("0.Keluar");
            System.out.println("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("DAFTAR HARGA BINGKAI");
                    jb.displayJB();
                    System.out.println("=================================");
                    break;
                case 2:
                    System.out.println("PEMESANAN BINGKAI");
                    dp.getID();
                    dp.getNama();
                    dp.getTanggal();
                    System.out.println("================================");
                    jb.displayJB();
                    h.getPesanan();

                case 3:
                    System.out.println("LIHAT HASIL PEMBELIAN");
                    dp.displayDP();

                    break;
                case 0:
                    System.out.println("KELUAR");
                    break;
                default:
                    System.out.println("");
            }
            
        }while (pilihan != 0);
    }
}
