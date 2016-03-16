/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3;

import java.util.Scanner;

/**
 *
 * @author HP 8.1
 */
public class MainTransaksi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner my = new Scanner(System.in);
        String id, nama, tgl, jen, j;
        int p, l, hitung = 0;

        Jenis jens = new Jenis();
        Pemesan pem = new Pemesan();

        System.out.println("===============Selamat Datang===============");
        System.out.print("ID Pemesan\t\t : ");
        id = in.next();
        System.out.print("Nama Pemesan\t\t : ");
        nama = my.nextLine();
        System.out.print("Tanggal Pemesanan\t : ");
        tgl = my.nextLine();
        pem.Pesan(id, nama, tgl);
        pem.Pesan(id, nama);

        System.out.println();
        jens.MenuBarang();

        System.out.println();
        System.out.println("---------------PEMESANAN BINGKAI---------------");
        System.out.print("Jenis Bingkai\t\t : ");
        jen = my.nextLine();
        switch (jen) {
            case "Hitam Metalik":
                j = "Hitam Metalik";
                System.out.println("Harga Per m\t\t : Rp. 3000,-");
                System.out.print("Ukuran Panjang Bingkai\t : ");
                p = in.nextInt();
                System.out.print("Ukuran Lebar Bingkai\t : ");
                l = in.nextInt();
                jens = new Jenis(p,l,j);
                hitung = (p*l)*3000;
                System.out.println();
                break;
            case "Coklat Metalik":
                j = "Coklat Metalik";
                System.out.println("Harga Per m\t\t : Rp. 2700,-");
                System.out.print("Ukuran Panjang Bingkai\t : ");
                p = in.nextInt();
                System.out.print("Ukuran Lebar Bingkai\t : ");
                l = in.nextInt();
                jens = new Jenis(p,l,j);
                hitung = (p*l)*2700;
                System.out.println();
                break;
            case "Coklat Bercorak":
                j = "Coklat Bercorak";
                System.out.println("Harga Per m\t\t : Rp. 2300,-");
                System.out.print("Ukuran Panjang Bingkai\t : ");
                p = in.nextInt();
                System.out.print("Ukuran Lebar Bingkai\t : ");
                l = in.nextInt();
                jens = new Jenis(p,l,j);
                hitung = (p*l)*2300;
                System.out.println();
                break;
            case "Hitam Bercorak":
                j = "Hitam Bercorak";
                System.out.println("Harga Per m\t\t : Rp. 2500,-");
                System.out.print("Ukuran Panjang Bingkai\t : ");
                p = in.nextInt();
                System.out.print("Ukuran Lebar Bingkai\t : ");
                l = in.nextInt();
                jens = new Jenis(p,l,j);
                hitung = (p*l)*2500;
                System.out.println();
                break;
            case "Emas":
                j = "Emas";
                System.out.println("Harga Per m\t\t : Rp. 5000,-");
                System.out.print("Ukuran Panjang Bingkai\t : ");
                p = in.nextInt();
                System.out.print("Ukuran Lebar Bingkai\t : ");
                l = in.nextInt();
                jens = new Jenis(p,l,j);
                hitung = (p*l)*5000;
                System.out.println();
                break;
            case "Perak":
                j = "Perak";
                System.out.println("Harga Per m\t\t : Rp. 4000,-");
                System.out.print("Ukuran Panjang Bingkai\t : ");
                p = in.nextInt();
                System.out.print("Ukuran Lebar Bingkai\t : ");
                l = in.nextInt();
                jens = new Jenis(p,l,j);
                hitung = (p*l)*4000;
                System.out.println();
                break;
            default:
                System.out.println("> Terjadi Kesalahan");
                System.out.println("> Tidak Ada Jenis Barang Lagi");
        }

        System.out.println("\n---------------TOTAL PEMBAYARAN---------------");
        jens.Tampil(hitung);
        jens.Perhitungan(hitung);

        System.out.println();
        System.out.println("=================Terimakasih====================");
    }
}
