package tugasbab3;
import java.util.Scanner;
public class TugasBab3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner masukan = new Scanner(System.in);
        String nama, tanggal;
        int panjang, lebar;
        int id;
        User pemesan = new User();
        System.out.print("Masukkan ID      : ");
        id = in.nextInt();
        System.out.print("Masukkan Nama    : ");
        nama = masukan.nextLine();
        System.out.print("Masukkan tanggal :");
        tanggal = masukan.nextLine();
        System.out.print("Masukkan panjang :");
        pemesan.setSisi1(masukan.nextInt());
        System.out.print("Masukkan lebar   :");
        pemesan.setSisi2(masukan.nextInt());
        pemesan.Pemesan(id, nama, tanggal);
        pemesan.Display();
        System.out.print("Masukkan pilihan : ");
        pemesan.jenisFrame(masukan.nextInt());
        System.out.println("Total Harga : Rp "+pemesan.harga());
        
        
    }

}
