package bingkai;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Bingkai bg = new Bingkai();
        System.out.print("Masukkan ID : ");
        bg.setID(in.nextInt());
        System.out.print("Masukkan Nama : ");
        bg.setNama(in.next());
        System.out.print("Masukkan Tanggal Pemesanan : ");
        bg.setTanggal(in.next());
        System.out.print("Masukkan ukuran bingkai (panjang,lebar) : ");
        bg.setUkuran(in.nextDouble(), in.nextDouble());
        String a = in.nextLine();
        System.out.print("Masukkan Jenis bingkai : ");
        bg.setJenis(in.nextLine());
        System.out.println("");
        bg.showData();
    }
}
