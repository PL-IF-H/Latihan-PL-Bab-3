package bingkai;

import java.util.Scanner;

public class Bingkai {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KelasBingkai bingkai = new KelasBingkai();
        boolean ulang = true;
        while (ulang) {
            System.out.println("====================");
            System.out.print("Masukan ID Pemesanan :");
            bingkai.setIdPemesan(in.next());
            System.out.print("Masukan Nama Pemesan :");
            in.nextLine();
            bingkai.setNamaPemesan(in.nextLine());
            System.out.print("Masukan Tanggal Pemesanan :");
            bingkai.setTanggalPemesanan(in.nextLine());
            System.out.println("1.Hitam Metalik \t|3000/M\n"
                    + "2.Coklat Metalik \t|2700/M\n"
                    + "3.Coklat Bercorak\t|2300/M\n"
                    + "4.Hitam Bercorak \t|2500/M\n"
                    + "5.Emas 	\t\t|5000/M\n"
                    + "6.Perak 	\t|4000/M");
            System.out.print("Masukan Jenis Bingkai :");
            bingkai.setJenisBingkai(in.nextInt());
            System.out.println("Masukan Ukuran Bingkai");
            System.out.print("Masukan Panjang Bingkai :");
            bingkai.setPanjangBingkai(in.nextInt());
            System.out.print("Masukan Lebar Bingkai :");
            bingkai.setLebarBingkai(in.nextInt());
            bingkai.setLuas();
            bingkai.cekHarga();
            bingkai.bayar();
            bingkai.dapetDiskon();
            bingkai.diskon();
            System.out.println("==========================");
            System.out.println("Harga :" + bingkai.getBayar());
            System.out.print("Diskon :" + bingkai.getDiskon());
            if (!bingkai.getDapetDiskon()) {
                System.out.print(" (Anda tidak mendapat diskon karena total harga atau barang tidak sesuais!!!)");
            }
            System.out.println("");
            System.out.println("Total yang dibayarkan :" + (bingkai.getBayar() - bingkai.getDiskon()));
            System.out.println("==========================");
            System.out.println("1.iya");
            System.out.println("2.tidak");
            System.out.println("Apakah anda ingin mengulang lagi?");
            int yesornot = in.nextInt();
            if(yesornot==1){
                ulang=true;
            }else{
                ulang=false;
            }
        }
    }
}
