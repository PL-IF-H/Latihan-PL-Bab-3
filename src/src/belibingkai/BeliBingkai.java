
package belibingkai;

import java.util.Scanner;


public class BeliBingkai {

    public static void main(String[] args) {
        String nama,ID, tanggal;
        double panjang,lebar,harga;
        Scanner input = new Scanner(System.in);
        namaPelanggan pembeli = new namaPelanggan();
        System.out.println("---------------------------------------------------");
        System.out.println("---------PROGRAM MENGHITUNG HARGA BINGKAI----------");
        System.out.println("---------------------------------------------------");
        System.out.print("Masukkan Nama       : ");
        nama = input.nextLine();
        System.out.print("Masukkan ID         : ");
        ID = input.nextLine();
        System.out.print("Masukkan Tanggal    : ");
        tanggal = input.nextLine();
        pembeli.dataPelanggan(nama, ID, tanggal);
        
        System.out.print("Masukkan panjang  : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar    : ");
        lebar = input.nextDouble();
        detailBingkai bingkai = new detailBingkai(panjang, lebar);
        bingkai.pilihanBingkai();
        
        
        
        
    }
    
}
