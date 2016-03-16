package tugasbiasa;
import java.util.Scanner;
public class lukisiaanMain {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        lukisiaan pemesan = new lukisiaan("");
        String kembali;
        do {
            pemesan.bayar=0;
            System.out.println("=====PROGRAM PENJUALAN LUKISAN ADIT ART=====");
            System.out.print("Masukkan ID\t: ");
            pemesan.idpemesan = in.next();
            System.out.print("Masukkan Nama\t: ");
            pemesan.nama = in.next();
            System.out.print("Tanggal\t\t: ");
            pemesan.tanggal = in.next();
            System.out.println("============================================");
            System.out.println("Pilihan Menu");
            System.out.println("No. Pilihan Warna   | Harga per m2");
            System.out.println(" 1. Hitam Metalik   |    3000");
            System.out.println(" 2. Coklat Metalik  |    2700");
            System.out.println(" 3. Coklat Bercorak |    2300");
            System.out.println(" 4. Hitam Bercorak  |    2500");
            System.out.println(" 5. Emas            |    5000");
            System.out.println(" 6. Perak           |    4000");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    