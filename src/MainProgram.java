package BAB3;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        Transaksi trans;
        System.out.println("============== Bingkai Adit, dijamin ramah lingkungan! =============");
        System.out.print("\nID pemesan            : ");
        String id = in.nextLine();
        System.out.print("Nama pemesan          : ");
        String nama = in.nextLine();
        System.out.print("Tanggal pemesanan     : ");
        String tanggal = in.nextLine();
        System.out.print("Jenis bingkai         : ");
        String jenisBingkai = in.nextLine();
        System.out.print("Panjang bingkai       : ");
        double panjangBingkai = sc.nextDouble();
        System.out.print("Lebar bingkai         : ");
        double lebarBingkai = sc.nextDouble();
        trans = new Transaksi(id, nama, tanggal, panjangBingkai, lebarBingkai, jenisBingkai);
        trans.DisplayTransaksi();
    }
}
