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

        System.out.print("\nMasukkan Jenis Bingkai  : ");
        String jenis = input.nextLine();
        switch(jenis){
            case "Hitam Metalik"  :System.out.print("Masukkan panjang     : ");
                                   int p = input.nextInt();
                                   System.out.print("Masukkan lebar       : ");
                                   int l = input.nextInt();
                                   data2.dataPemesanan(p, l);
                                   int hm = data2.hitungUkuran() * 3000;
                                   if (hm > 600000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 5%\nBiaya yang harus Anda bayar : Rp "+ (hm - (hm*0.05)));
                                   }else if (hm > 450000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 10%\nBiaya yang harus Anda bayar : Rp "+(hm - (hm*0.1)));
                                   }else if (hm > 300000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 15%\nBiaya yang harus Anda bayar : Rp "+(hm - (hm*0.15)));
                                   }else{
                                       System.out.println("Biaya yang harus anda bayar : Rp "+hm);
                                   }break;
            case "Emas"           :System.out.print("Masukkan panjang     : ");
                                   int p2 = input.nextInt();
                                   System.out.print("Masukkan lebar       : ");
                                   int l2 = input.nextInt();
                                   data2.dataPemesanan(p2, l2);
                                   int em = data2.hitungUkuran() * 5000;
                                   if (em > 600000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 5%\nBiaya yang harus Anda bayar : Rp "+ (em - (em*0.05)));
                                   }else if (em > 450000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 10%\nBiaya yang harus Anda bayar : Rp "+(em - (em*0.1)));
                                   }else if (em > 300000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 15%\nBiaya yang harus Anda bayar : Rp "+(em - (em*0.15)));
                                   }else{
                                       System.out.println("Biaya yang harus anda bayar : Rp "+em);
                                   }break;
            case "Perak"          :System.out.print("Masukkan panjang     : ");
                                   int p3 = input.nextInt();
                                   System.out.print("Masukkan lebar       : ");
                                   int l3 = input.nextInt();
                                   data2.dataPemesanan(p3, l3);
                                   int prk = data2.hitungUkuran() * 4000;
                                   if (prk > 600000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 5%\nBiaya yang harus Anda bayar : Rp "+ (prk - (prk*0.05)));
                                   }else if (prk > 450000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 10%\nBiaya yang harus Anda bayar : Rp "+(prk - (prk*0.1)));
                                   }else if (prk > 300000){
                                       System.out.println("Selamat Anda mendapatkan diskon sebesar 15%\nBiaya yang harus Anda bayar : Rp "+(prk - (prk*0.15)));
                                   }else{
                                       System.out.println("Biaya yang harus anda bayar : Rp "+prk);
                                   }break;
            case "Coklat Metalik" :System.out.print("Masukkan panjang     : ");
                                   int p4 = input.nextInt();
                                   System.out.print("Masukkan lebar       : ");
                                   int l4 = input.nextInt();
                                   data2.dataPemesanan(p4, l4);
                                   int cm = data2.hitungUkuran() * 2700;
                                   System.out.println("Biaya yang harus Anda bayar : Rp "+cm);
                                   break;
            case "Coklat Bercorak":System.out.print("Masukkan panjang     : ");
                                   int p5 = input.nextInt();
                                   System.out.print("Masukkan lebar       : ");
                                   int l5 = input.nextInt();
                                   data2.dataPemesanan(p5, l5);
                                   int cb = data2.hitungUkuran() * 2300;
                                   System.out.println("Biaya yang harus Anda bayar : Rp "+cb);
                                   break;
            case "Hitam Bercorak" :System.out.print("Masukkan panjang     : ");
                                   int p6 = input.nextInt();
                                   System.out.print("Masukkan lebar       : ");
                                   int l6 = input.nextInt();
                                   data2.dataPemesanan(p6, l6);
                                   int hb = data2.hitungUkuran() * 2500;
                                   System.out.println("Biaya yang harus Anda bayar : Rp "+hb);
                                   break;
            default : System.out.println("Pilihan tidak tersedia");

	}
    }
}
