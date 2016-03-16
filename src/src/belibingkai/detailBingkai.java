/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belibingkai;

import java.util.Scanner;

/**
 *
 * @author IANLORD
 */
public class detailBingkai {
private double panjang;
private double lebar;
    
        public detailBingkai (double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getLuas(){
        return panjang*lebar;
    }
    
    public void pilihanBingkai (){
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih jenis bingkai yang anda inginkan : ");
        System.out.println("1. Hitam Metalik    = Rp3000 Permeter");
        System.out.println("2. Coklat Metalik   = Rp2700 Permeter");
        System.out.println("3. Coklat Bercorak  = Rp2300 Permeter");
        System.out.println("4. Hitam Bercorak   = Rp2500 Permeter");
        System.out.println("5. Emas             = Rp5000 Permeter");
        System.out.println("6. Perak            = Rp4000 Permeter");
        int pilihan;
        double harga;
        System.out.println("Masukkan pilihan anda : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1 : harga = getLuas()*3000;
                System.out.println("Total Harga adalah : "+harga);
                break;
            case 2 : harga = getLuas()*2700;
                System.out.println("Total Harga adalah : "+harga);
                break;
            case 3 : harga = getLuas()*2300;
                System.out.println("Total Harga adalah : "+harga);
                break;
            case 4 : harga = getLuas()*2500;
                System.out.println("Total Harga adalah : "+harga);
                break;
            case 5 : harga = getLuas()*5000;
                System.out.println("Total Harga adalah : "+harga);
                break;
            case 6 : harga = getLuas()*4000;
                System.out.println("Total Harga adalah : "+harga);
                break;
        }
        
        
    }
    
}
