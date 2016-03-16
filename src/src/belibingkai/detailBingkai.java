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
    private double lebar;
    private double panjang;
    
    public void setLebar(){
        this.lebar = lebar;
    }
    
    public void setPanjang(){
        this.panjang = panjang;
    }
    
    public double getLebar(){
        return lebar;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public double getLuas(){
        double luas = panjang * lebar;
        return luas;
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
        System.out.println("Masukkan pilihan anda : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            
        }
        
        
    }
    
}
