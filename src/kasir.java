package beliFrame;
import java.util.Scanner;
public class kasir {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int pil = 0,p = 0,l = 0;
        Pemesan pemesan = new Pemesan();
        Pesanan pesan = new Pesanan();

        pemesan.Beli();
        pesan.Pesanan();
        pesan.ukurFrame();        
        pesan.hargaBingkai();
        System.out.println("Total Harga     : Rp "+pesan.discHarga());
        
    }
}
