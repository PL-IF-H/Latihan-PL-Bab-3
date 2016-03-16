package tgs3;
import java.util.Scanner;
public class mainBingkai {

    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        Pemesanan a = new Pemesanan ();
     
        System.out.println("--------------------------------------------------------");
        System.out.println("| No\t|Jenis Bingkai\t\t|"+"\tHarga per meter\t|");
        System.out.println("--------------------------------------------------------");
        System.out.println("| 1\t|Hitam Metalik\t\t|"+"\t 3000\t\t|");
        System.out.println("| 2\t|Coklat Metalik\t\t|"+"\t 2700\t\t|");
        System.out.println("| 3\t|Coklat Bercorak\t|"+"\t 2300\t\t|");
        System.out.println("| 4\t|Hitam Bercorak\t\t|"+"\t 2500\t\t|");
        System.out.println("| 5\t|Emas\t\t\t|"+"\t 5000\t\t|");
        System.out.println("| 6\t|Perak\t\t\t|"+"\t 4000\t\t|");
        System.out.println("--------------------------------------------------------");
        System.out.println ("Masukkan pilihan jenis bingkai :");
        diskon j =  new diskon ();
        switch (pilihan){
            case 1 :
                j.hitamMetalik();
                break;
            case 2:
                j.coklatMetalik();
                break;
            case 3 :
                j.coklatBercorak();
                break;
            case 4 :
                j.hitamBercorak();
                break;
            case 5 :
                j.emas();
                break;
            case 6 :
                j.perak();
                break;
            default : {
                System.out.println ("Tidak ditemukan");
            }
        }
    }
}
