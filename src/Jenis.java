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
public class Jenis {
    Scanner in = new Scanner(System.in);
    Scanner my = new Scanner(System.in);
    String jen;
    int bayar, diskon, pil, ttl;
    private int p, l;
     
    public Jenis(){
        this.jen = jen;
    }
    public Jenis(int p, int l, String j){
        this.p = p;
        this.l = l;
        this.jen = j;
    }
    public void MenuBarang() {
        System.out.println("|-------------------------------+");
        System.out.println("|      DAFTAR MENU BINGKAI      |");
        System.out.println("+-------------------------------+");
        System.out.println("| Jenis Bingkai   | Harga Per m |");
        System.out.println("+-----------------+-------------+");
        System.out.println("|  Hitam Metalik  |  Rp. 3000,- |");
        System.out.println("| Coklat Metalik  |  Rp. 2700,- |");
        System.out.println("| Coklat Bercorak |  Rp. 2300,- |");
        System.out.println("| Hitam Bercorak  |  Rp. 2500,- |");
        System.out.println("|     Emas        |  Rp. 5000,- |");
        System.out.println("|     Perak       |  Rp. 4000,- |");
        System.out.println("+-------------------------------+");
    }

    public void Perhitungan(int x) {
        if (jen=="Hitam Metalik" || jen=="Emas" || jen=="Perak") {
            if (x>300000) {
                ttl = (int) (x - (x * 0.05));
                System.out.println("\nAnda Mendapatkan Diskon 5%");
                System.out.println("Total Harga yang Harus Dibayar : Rp. " + ttl + ",-");
            } else if (x>450000) {
                ttl = (int) (x - (x * 0.1));
                System.out.println("\nAnda Mendapatkan Diskon 10%");
                System.out.println("Total Harga yang Harus Dibayar : Rp." + ttl + ",-");
            } else if (x>600000) {
                ttl = (int) (x - (x * 0.15));
                System.out.println("\nAnda Mendapatkan Diskon 15%");
                System.out.println("Total Harga yang Harus Dibayar : Rp." + ttl + ",-");
            } else {
                System.out.println("* Tidak Termasuk Diskon");
            }
        } else 
            System.out.println("* Tidak Termasuk Diskon");
    }
    public void Tampil(int y){
        System.out.println("Total Harga\t\t : "+y);
    }
}
