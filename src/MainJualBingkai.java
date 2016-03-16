package pemlan.tugas3;
import java.util.Scanner ;
public class MainJualBingkai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        String Nama, ID, Jenis, Tanggal;
        double P, L ;
        DagangBingkai jual = new DagangBingkai();
        System.out.print("Masukan Nama                   : ");
        Nama = input.nextLine();
        System.out.print("Masukan ID                     : ");
        ID = input.nextLine();
        System.out.print("Masukan Tanggal Pemesanan      : ");
        Tanggal = input.nextLine();
        System.out.print("Masukan Panjang Bingkai        : ");
        P = in.nextInt();
        jual.setPanjang(P);
        System.out.print("Masukan Lebar Bingkai          : ");
        L = in.nextInt();
        jual.setLebar(L);
        System.out.println("=================||=======================");
        System.out.println("||     Kode      ||   Nama Barang       ||");
        System.out.println("==========================================");
        System.out.println("||      HM       ||   Hitam Metalik     ||");
        System.out.println("||      CM       ||   Coklat Metalik    ||");
        System.out.println("||      CB       ||   Coklat Bercorak   ||");
        System.out.println("||      HB       ||   Hitam Bercorak    ||");
        System.out.println("||      E        ||   Emas              ||");
        System.out.println("||      P        ||   Perak             ||");
        System.out.println("=================||=======================");
        System.out.print("Masukan Kode Jenis Barang      : ");
        Jenis = input.nextLine();
        jual.hitungHarga(Jenis);
        jual.inputPesan(ID, Nama, Tanggal, Jenis);
        jual.displayF();
    }   
}
