package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static void main(String[] args) {
        Scanner inStr = new Scanner (System.in);
        Scanner inDouble = new Scanner (System.in);
        Pemesanan inPemesanan = new Pemesanan ();
        Bingkai inBingkai = new Bingkai ();
        
        System.out.print("Masukkan ID pemesan : ");
        inPemesanan.setID(inStr.nextLine());
        System.out.print("Masukkan Nama pemesan : ");
        inPemesanan.setNama(inStr.nextLine());
        System.out.print("Masukkan Tanggal pemesanan : ");
        inPemesanan.setTanggal(inStr.nextLine());
        System.out.print("Masukkan Jenis bingkai : ");
        inPemesanan.setJenis(inStr.nextLine());
        System.out.print("Masukkan panjang bingkai : ");
        inBingkai.setPanjang(inDouble.nextDouble());
        System.out.print("Masukkan lebar bingkai : ");
        inBingkai.setLebar(inDouble.nextDouble());
        System.out.println("Harga yang harus dibayar adalah : "+inPemesanan.getHarga(inBingkai));
        
        
    } 
}
