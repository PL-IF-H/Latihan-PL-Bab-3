package tgs3;

import java.util.Scanner;
public class Pemesanan {
    Scanner in = new Scanner (System.in);
    private int ID;
    private String IDpemesan;
    private String namaPemesan;
    private String tanggalPemesanan;
    private String jenisBingkai;
    // overloading method
    public void Pemesanan (int ID){
        this.ID= ID;
    }
    // overloading method
    public void Pemesanan (String IDpemesan, String namaPemesan, String tanggalPemesanan, String jenisBingkai){
        this.IDpemesan=IDpemesan;
        this.namaPemesan=namaPemesan;
        this.tanggalPemesanan=tanggalPemesanan;
        this.jenisBingkai=jenisBingkai;
    }
    public void pemesan (){
        System.out.println("Masukkan ID pemesan : ");
        int ID=in.nextInt();
        System.out.println("Masukkan nama pemesan : ");
        int namaPemesan = in.next();
        System.out.println("Masukkan tanggal pemesanan : ");
        String tanggalPemesanan = in.next();
    }
}
