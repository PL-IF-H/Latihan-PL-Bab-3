package tokobingkai;
import java.util.Scanner;
public class MainTokoBingkai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ID, nama;
        Pemesan p = new Pemesan();
        System.out.print("Masukkan ID : ");
        ID = in.nextLine();
        p.setID(ID);
        System.out.print("Masukkan Nama : ");
        nama = in.nextLine();
        p.setNama(nama);
        p.display();
    }    
}
