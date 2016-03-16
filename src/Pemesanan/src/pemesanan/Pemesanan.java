
package pemesanan;
import java.util.Scanner;

public class Pemesanan {

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    String nama,id,tanggal;
    int lebar, panjang, luas, jenis,harga;
    double totalharga ;
        System.out.print("Masukkan nama               : ");
        nama = input.next();
        System.out.print("Masukkan id                 : ");
        id = input.next();
        System.out.print("Tanggal pemesanan           : ");
        tanggal = input.next();
        pelanggan a = new pelanggan(nama,id,tanggal);
        System.out.print("Masukkan lebar bingkai      : ");
        lebar = input.nextInt();
        System.out.print("Masukkan panjang bingkai    : ");
        panjang = input.nextInt();
        Harga a1 = new Harga();
        a1.Harga(lebar, panjang);
        System.out.println("1.Hitam Metalik      |      3000");
        System.out.println("2.isCoklat Metalik   |      2700");
        System.out.println("3.Coklat Bercorak    |      2300");
        System.out.println("4.Hitam Bercorak     |      2500");
        System.out.println("5.Emas               |      5000");
        System.out.println("6.Perak              |      4000");
        System.out.println("Maukkan Pilihan             : ");
        jenis = input.nextInt();
        a1.Harga(jenis);
        harga = a1.totalHarga();
        if (jenis==1||jenis==5||jenis==6) {
            if(harga> 300000&& harga <=450000){
            totalharga = (double)a1.totalHarga()-(a1.totalHarga()/100*5);
                    }
            else if(harga> 450000 && harga <=600000){
            totalharga = (double)a1.totalHarga()-(a1.totalHarga()/100*10);}
            else if(harga> 600000){
            totalharga = (double)a1.totalHarga()-(a1.totalHarga()/100*15);
            }
            else totalharga = a1.totalHarga();
            }
        else totalharga = harga;
        a.displayMessage();
        a1.displayMessage();
        System.out.println("Harga setelah diskon : "+totalharga);
        
    }
}
        
    


