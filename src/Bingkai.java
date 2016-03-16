package Tugas;
//class     : Pemesanan, Bingkai
//objek     : data, data2
//atribut   : ID, nama, tanggal, jenis, panjang, lebar
//method    : hitungUkuran
import java.util.Scanner;
public class Bingkai {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    Pemesanan data = new Pemesanan("","","");
    Pemesanan data2 = new Pemesanan(0, 0);
        System.out.println("=========BINGKAI LUKISAN==========");
        System.out.println("JENIS BINGKAI   || HARGA PER METER\n==================================");
        System.out.println("Hitam Metalik 	||\t3000\nCoklat Metalik 	||\t2700\nCoklat Bercorak ||\t2300\nHitam Bercorak 	||\t2500\nEmas 		||\t5000\nPerak 		||\t4000");
        System.out.println("==================================\n");

	System.out.print("Masukkan ID         : ");
        String id = input.nextLine();
        System.out.print("Masukkan Nama       : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Tanggal    : ");
        String tgl = input.nextLine();
        data.dataPemesanan(id, nama, tgl);

    }
}
