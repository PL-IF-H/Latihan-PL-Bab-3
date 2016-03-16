package githubpraktikum3;
import java.util.Scanner;
/*
 *NAMA  : I KETUT SIDHARTA YOGATAMA
 *NIM   : 155150200111102
 *KELAS : IF - H
 */
public class GitHubPraktikum3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        TokoAdit coba = new TokoAdit("nama","tanggal","id");
        int s=2;
        for (int i = 0; i < 1; i++) {
            if (coba.cekId()){
                for (int j = 0; j < 1; j++) {
                    System.out.println("===================================================================");
                    System.out.println("Harga Menu Bingkai : ");
                    System.out.println("1. Warna Hitam Metalik \t\t - 3000/m \t\t(Diskon)");
                    System.out.println("2. Warna Coklat Metalik \t - 2700/m");
                    System.out.println("3. Warna Coklat Bercorak \t - 2300/m");
                    System.out.println("4. Warna Hitam Bercorak \t - 2500/m");
                    System.out.println("5. Warna Emas \t\t\t - 5000/m \t\t(Diskon)");
                    System.out.println("6. Warna Perak \t\t\t - 4000/m \t\t(Diskon) ");
                    System.out.println("Ketentuan Diskon : ");
                    System.out.println("1. Jika total bayar lebih dari 300000 maka akan mendapat diskon 5%");
                    System.out.println("1. Jika total bayar lebih dari 450000 maka akan mendapat diskon 10%");
                    System.out.println("1. Jika total bayar lebih dari 600000 maka akan mendapat diskon 15%");
                    System.out.print("Masukan Pilihan : ");
                    int pilihan=in.nextInt();
                    System.out.println("===================================================================");
                    switch(pilihan){
                        case 1:
                            System.out.print("Masukan panjang : ");
                            int panjang = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            int lebar = in.nextInt();
                            double p = panjang * 3000;
                            double l = lebar * 3000;
                            double hasil1 = p+l;
                            System.out.println("Total bayar = "+hasil1);
                            break;
                        case 2:
                            System.out.print("Masukan panjang : ");
                            int panjang2 = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            int lebar2 = in.nextInt();
                            double p2 = panjang2 * 2700;
                            double l2 = lebar2 * 2700;
                            double hasil2 = p2+l2;
                            System.out.println("Total bayar = "+hasil2);
                            break;
                        case 3:
                            
                            break;
                            
                        default:
                            System.out.println("silahkan ambil kartu anda !");
                            break;
                    }
                }
            }else{
                System.out.println("id pemesan salah !");
                if (s==0){
                    break;
                }else{
                    s--;
                    i--;
                }
            }
        }
        
    } 
}