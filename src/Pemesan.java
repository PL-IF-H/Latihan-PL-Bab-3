package beliFrame;
import java.util.Scanner;
public class Pemesan {
    Scanner in = new Scanner(System.in);
    private String ID, namaPemesan, tglPesan;
    Pesanan pesan = new Pesanan();
    
    public Pemesan(){
        
    }
    public Pemesan(String id, String pemesan, String tgl){
        this.ID = id;
        this.namaPemesan = pemesan;
        this.tglPesan = tgl;
    }
    public void Beli(){
        System.out.print("ID Pemesan      : "); ID = in.nextLine();
        System.out.print("Nama Pemesan    : "); namaPemesan = in.nextLine();
        System.out.print("Tanggal Pesan   : "); tglPesan = in.nextLine();
    }
}
