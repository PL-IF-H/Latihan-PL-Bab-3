/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pl.pkg3;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Scanner inStr=new Scanner(System.in);
        System.out.println("=====Selamat Datang di Toko Adit=====");
        System.out.print("ID Pemesan : ");
        String ID=inStr.nextLine();
        System.out.print("Nama Pemesan : ");
        String nama=inStr.nextLine();
        System.out.print("Tanggal Pemesanan : ");
        String tanggal=inStr.nextLine();
        System.out.println("Jenis Bingkai (Hitam Metalik, Coklat Metalik, Coklat Bercorak, Hitam Bercorak, Emas, Perak)? ");
        String bingkai=inStr.nextLine();
        System.out.print("Ukuran: Panjang : ");
        int panjang=in.nextInt();
        System.out.print("        Lebar : ");
        int lebar=in.nextInt();
        Client client=new Client(ID, nama, tanggal);
        client=new Client(bingkai, panjang, lebar);
        Adit adit=new Adit(client);
        if(adit.getHarga()==3000 || adit.getHarga()==4000 || adit.getHarga()==5000){
            System.out.println("Harga yang Harus Dibayar adalah Rp. "+adit.pembayaran(adit.getHarga(), client));
        }
        else System.out.println("Harga yang Harus Dibayar adalah Rp. "+adit.pembayaran((int)adit.getHarga(), client));
    }
}
