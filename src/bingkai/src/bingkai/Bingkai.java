package bingkai;
import java.util.Scanner;
public class Bingkai {
    public static void main(String[] args) {
        boolean ya = true;//Atribut
        Scanner input = new Scanner (System.in);//objek input
        Scanner in = new Scanner (System.in);//objek in
        pemesan pesan = new pemesan();//objek pesan
        lukisan lukis = new lukisan();//objek lukis
        while (ya){
        System.out.println("Jenis Bingkai   || Harga Bingkai(per meter)");
        System.out.println("Hitam Metalik   || 3000");
        System.out.println("Coklat Metalik  || 2700");
        System.out.println("Coklat Bercorak || 2300");
        System.out.println("Hitam Bercorak  || 2500");
        System.out.println("Emas            || 5000");
        System.out.println("Perak           || 4000");
        System.out.println("Nama : ");
        pesan.setpemesan(input.nextLine());
        System.out.println("ID : ");
        pesan.setid(input.nextLine());
        System.out.println("Tanggal Pemesanan : ");
        pesan.settanggal(input.nextLine());
        System.out.println("Jenis Bingkai ");
        lukis.setjenis(input.nextLine());
        System.out.println("Masukkan Ukuran ");
        System.out.println("Panjang(m) : ");
        lukis.setlebar(in.nextInt());
        System.out.println("Lebar (m) : ");
        lukis.setpanjang(in.nextInt());
        System.out.println("==================================================");
        System.out.println("Nama : "+pesan.getnama());
        System.out.println("ID   : "+pesan.getid());
        System.out.println("Tanggal Pemesanan : "+pesan.gettanggal());
        System.out.println("Jenis Bingkai : "+lukis.getjenis());
        System.out.println("Ukuran Bingkai : "+lukis.getluas());
        System.out.println("Harga : "+lukis.harga());
        System.out.println("Order lagi?(Ya/Tidak) : ");
        String ulang = in.next();
        if (ulang.equals("Ya")){
            ya = true;
        }else{
            ya = false;
        }
        }
    }
    
}
