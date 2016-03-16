/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingkai_lukisan;

import java.util.Scanner;

/**
 *
 * @author auliaselma
 */
public class MainBingkai_lukisan {
    public static void main(String[] args) {
        Bingkai_lukisan bing=new Bingkai_lukisan();
        Scanner in=new Scanner(System.in);
        bing.display();
        System.out.println("==============DAFTAR JENIS BINGKAI==============");
        System.out.print("1");
        System.out.println(". Hitam Metalik = 3000");
        System.out.print("2");
        System.out.println(". Coklat Metalik = 2700");
        System.out.print("3");
        System.out.println(". Coklat Bercorak = 2300");
        System.out.print("4");
        System.out.println(". Hitam Bercorak = 2500");
        System.out.print("5");
        System.out.println(". Emas   = 5000");
        System.out.print("6");
        System.out.println(". Perak   = 4000");
        
        System.out.println("=================================================");
        System.out.print("masukkan jenis bingkai  :");
        bing.jenis=in.next();
        in.nextLine();
        System.out.print("masukkan panjang bingkai:");
        bing.panjang=in.nextInt();
        System.out.print("masukkan lebar bingkai  :");
        bing.lebar=in.nextInt();
        System.out.print("jumlah total bingkai    :"+bing.hitungkel());
       
        switch(bing.jenis){
            case "1" : 
               
                if ((bing.hitungkel()*3000>=300000) && (bing.hitungkel()*3000 < 450000)){
            double total = bing.hitungkel()*3000*0.05;
            
            System.out.println("Anda mendapat diskon 5%, Total  "+total+" Rupiah");
        }
        else if((bing.hitungkel()*3000>=450000) && (bing.hitungkel()*3000 < 600000)){
            double total2 = bing.hitungkel()*3000*0.1;
            
            System.out.println("Anda Mendapat Diskon 10%, Total  "+total2+" Rupiah");
        }
        else if((bing.hitungkel()*3000>=600000)){
            double total3 = bing.hitungkel()*3000*0.15;
            
            System.out.println("Anda Mendapat Diskon 15%, Total  "+total3+" Rupiah");
        }
        else{
             System.out.println(" ");
                System.out.print("Harga total  :");
                System.out.println(bing.hitungkel()*3000);
        }
                break;
                
                
                
                
            case "2" : 
                System.out.println(" ");
                System.out.print("Harga total  :");
                System.out.println(bing.hitungkel()*2700);
                break;
            case "3" : 
                System.out.println(" ");
                System.out.print("Harga total  :");
                System.out.println(bing.hitungkel()*2300);break;
            case "4" : System.out.println("Harga total  :");
                System.out.println(bing.hitungkel()*2500);break;
                
                
                
                
            case "5" : 
                System.out.println(" ");
                System.out.print("Harga total  :");
                System.out.println(bing.hitungkel()*5000);
                if ((bing.hitungkel()*5000>=300000) && (bing.hitungkel()*5000 < 450000)){
                double total = bing.hitungkel()*5000*0.05;
                
                System.out.println("Anda mendapat diskon 5%, Total  "+total+" Rupiah");
        }
        else if((bing.hitungkel()*5000>=450000) && (bing.hitungkel()*5000 < 600000)){
            double total2 = bing.hitungkel()*5000*0.1;
            
            System.out.println("Anda Mendapat Diskon 10%, Total  "+total2+" Rupiah");
        }
        else if((bing.hitungkel()*5000>=600000)){
            double total3 = bing.hitungkel()*3000*0.15;
            
            System.out.println("Anda Mendapat Diskon 15%, Total  "+total3+" Rupiah");
        }
        else{
             System.out.println(" ");
                System.out.print("Harga total  :");
                System.out.println(bing.hitungkel()*5000);
        }
                break;
                
                
                
            case "6" : 
                System.out.println(" ");
                System.out.print("Harga total  :");
                System.out.println(bing.hitungkel()*4000);
                if ((bing.hitungkel()*4000>=300000) && (bing.hitungkel()*4000 < 450000)){
                double total = bing.hitungkel()*4000*0.05;
                
                System.out.println("Anda mendapat diskon 5%, Total  "+total+" Rupiah");
        }
        else if((bing.hitungkel()*4000>=450000) && (bing.hitungkel()*4000 < 600000)){
            double total2 = bing.hitungkel()*4000*0.1;
            
            System.out.println("Anda Mendapat Diskon 10%, Total  "+total2+" Rupiah");
        }
        else if((bing.hitungkel()*4000>=600000)){
            double total3 = bing.hitungkel()*4000*0.15;
            
            System.out.println("Anda Mendapat Diskon 15%, Total  "+total3+" Rupiah");
        }
        else{
             System.out.println(" ");
                System.out.print("Harga total  :");
                System.out.println(bing.hitungkel()*4000);
        }
                
                break;
        }
        
        }
        
    }

