package tugasprakbab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Pesanan bingkai = new Pesanan();
        
        System.out.print("Masukkan ID Pesanan : ");
        String id = in2.nextLine();
        System.out.print("Masukkan Nama Pemesan : ");
        String nama = in2.nextLine();
        System.out.print("Masukkan Tanggal Pemesanan (DD/MM/YYYY : ");
        String tgl = in2.nextLine();
        Client client1 = new Client(id,nama,tgl);
        System.out.print("Masukkan Jenis Bingkai : ");
        bingkai.setJenis_bingkai(in2.nextLine());
        System.out.print("Masukkan Panjang Bingkai : ");
        double panjang = in.nextDouble();
        System.out.print("Masukkan Lebar Bingkai : ");
        double lebar = in.nextDouble();
        System.out.println("------------------------------------------------------");
        System.out.println("DETAIL PESANAN");
        System.out.println("ID Pesanan      : "+client1.getID_Pesanan());
        System.out.println("Nama Pemesan    : "+client1.getNama_pemesan());
        System.out.println("Tanggal Pesan   : "+client1.getTanggal());
        System.out.println("Luas            : "+(int)bingkai.hitungLuas(panjang,lebar)+" m persegi");
        System.out.println("Jenis Bingkai   : "+bingkai.getJenis_bingkai());
        System.out.println("Harga permeter  : Rp."+(int)bingkai.getHarga(bingkai));
        System.out.println("Total Harga     : Rp."+(int)bingkai.getHarga());
        System.out.println("Diskon          : Rp."+(int)bingkai.getDiskon(bingkai, bingkai.getHarga()));
        System.out.println("Total Harga setelah didiskon    : Rp."+(int)(bingkai.getHarga() - bingkai.getDiskon(bingkai, bingkai.getHarga())));
    }
}
