package tgs3;

import java.util.Scanner;

public class diskon {
    Scanner input = new Scanner (System.in);
    private int p;
    private int l;
    private String hitamMetalik;
    private String coklatMetalik;
    private String coklatBercorak;
    private String hitamBercorak;
    private String emas;
    private String perak;
    
    Pemesanan a = new Pemesanan ();
    //overloading construktor
    public diskon (String hitamMrtalik, String coklatMetalik){
        this.hitamMetalik=hitamMetalik;
        this.coklatMetalik=coklatMetalik;
    }
    //overloading construktor
    public diskon() {
        this.p=p;
        this.l=l;
        this.hitamMetalik=hitamMetalik;
        this.coklatBercorak=coklatBercorak;
        this.coklatMetalik=coklatMetalik;
        this.hitamBercorak=hitamBercorak;
        this.emas=emas;
        this.perak=perak;
       
    }
    public void hitamMetalik (){
        System.out.println("Masukkan panjang :");
        int p = input.nextInt();
        System.out.println("Masukkan lebar :");
        int l= input.nextInt ();
        int harga = p*l*3000;
        if (harga>600000){
            System.out.println("Anda mendapat diskon sebesar 15%");
            int hargaTotal = (int) (harga-(harga*0.15));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else if (harga>450000){
            System.out.println("Anda mendapat diskon sebesar 10%");
            int hargaTotal = (int) (harga-(harga*0.1));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else if (harag>300000){
            Sysetem.out.println("Anda mendapat diskon sebesar 5%");
            int hargaTotal = (int) (harga-(harga*0.05));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else {
            System.out.println("Harga total yang harus anda bayar = "+harga);
        }
        }
    public void coklatMetalik (){
        System.out.println("Masukkan panjang : ");
        int p=input.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = input.nextInt();
        int harga = p*l*2700;
        System.out.println("Harga total yanga harus anda bayar = "+harga);
    }
    public void coklatBercorak (){
        System.out.println("Masukkan panjang : ");
        int p= input.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = input.nextInt ();
        int harga=p*l*2300;
        System.out.println("Harga total yang harus anda bayar = "+harga);
    }
    public void hitamBercorak (){
        System.out.println("Masukkan panjang : ");
        int p= input.nextInt();
        System.out.println("Masukkan lebar : ");
        int l= input.nextInt();
        int harga = p*l*2500;
        System.out.println("Harga total yang harus anda bayar = "+harga);
    }
    public void emas (){
        System.out.println("Masukkan panjang : ");
        int p = input.nextInt();
        System.out.println("Masukkan lebar : ");
        int l = input.nextInt();
        int harga = p*l*5000;
        if (harga>600000){
            System.out.println("Anda mendapat diskon sebesar 15%");
            int hargaTotal = (int) (harga-(harga*0.15));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else if (harga>450000){
            System.out.println("Anda mendapat diskon sebesar 10%");
            int hargaTotal = (int) (harga-(harga*0.1));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else if(harga>300000){
            System.out.println("Anda mendapat diskon sebesar 5%");
            int hargaTotal = (int) (harga-(harga*0.05));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else 
            System.out.println("Harga total yang harus anda bayar = "+harga);
    }
    public void perak (){
        System.out.println ("Masukkan panjang : ");
        int p=input.nextInt();
        System.out.println ("Masukkan lebar : ");
        int l= input.nextInt();
        int harga = p*l*4000;
        if (harga>600000){
            System.out.println("Anda mendapat diskon sebesar 15%");
            int hargaTotal = (int) (harga-(harga*0.15));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else if (harga>450000){
            System.out.println("Anda mendapat diskon sebesar 10%");
            int hargaTotal = (int) (harga-(harga*0.1));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else if (harga>300000){
            System.out.println("Anda mendapat diskon sebesar 5%");
            int hargaTotal = (int) (harga-(harga*0.05));
            System.out.println("Harga total yang harus anda bayar = "+hargaTotal);
        }else {
            System.out.println("Harga total yang harus anda bayar = "+harga);
        }
    }
    }
