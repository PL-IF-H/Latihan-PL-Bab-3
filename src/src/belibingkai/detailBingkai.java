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
        double harga1,harga2,hargafinal;
        
        System.out.println("Masukkan pilihan anda : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1 : harga1 = getLuas()*3000;
            if(harga1<450000){
                harga2= harga1*5/100;
                hargafinal = harga1-harga2;
            }
            else if(harga1<600000){
                harga2= harga1*10/100;
                hargafinal = harga1-harga2;
            }else if (harga1>600000){
                harga2=harga1*15/100;
                hargafinal=harga1-harga2;
            }
            else{
                hargafinal=harga1;
            }
                System.out.println("Total Harga adalah : "+hargafinal);
                break;
                
            case 2 : harga1 = getLuas()*2700;
                System.out.println("Total Harga adalah : "+harga1);
                break;
                
            case 3 : harga1 = getLuas()*2300;
                System.out.println("Total Harga adalah : "+harga1);
                break;
            case 4 : harga1 = getLuas()*2500;
                System.out.println("Total Harga adalah : "+harga1);
                break;
            case 5 : harga1 = getLuas()*5000;
            if(harga1<450000){
                harga2= harga1*5/100;
                hargafinal = harga1-harga2;
            }
            else if(harga1<600000){
                harga2= harga1*10/100;
                hargafinal = harga1-harga2;
            }else if (harga1>600000){
                harga2=harga1*15/100;
                hargafinal=harga1-harga2;
            }
            else{
                hargafinal=harga1;
            }
                System.out.println("Total Harga adalah : "+hargafinal);
                break;
            case 6 : harga1 = getLuas()*4000;
            if(harga1<450000){
                harga2= harga1*5/100;
                hargafinal = harga1-harga2;
            }
            else if(harga1<600000){
                harga2= harga1*10/100;
                hargafinal = harga1-harga2;
            }else if (harga1>600000){
                harga2=harga1*15/100;
                hargafinal=harga1-harga2;
            }
            else{
                
               hargafinal = harga1;
            }
                System.out.println("Total Harga adalah : "+hargafinal);
                break;
        }
        
        
    }
    
}
