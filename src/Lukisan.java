package lukisan;

import java.util.Scanner;

public class Lukisan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pembeli pemesan = new pembeli("Febri");
        String aneh;
        do {
            pemesan.bayar=0;
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.println("+   PROGRAM PENJUALAN LUKISAN ADIT    +");
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            System.out.print("+ Masukkan ID\t: ");
            pemesan.idPemesan = in.next();
            System.out.print("+ Masukkan Nama\t: ");
            pemesan.namaPemesan = in.nextLine();
            pemesan.namaPemesan = in.nextLine();
            System.out.print("+ Tanggal\t: ");
            pemesan.tglPemesanan = in.next();
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
            pemesan.displayBingkai();
            int pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("- Bingkai Hitam Metalik (Rp.3000/m)");
                    System.out.print("+ Masukkan panjang bingkai : ");
                    int panjang = in.nextInt();
                    System.out.print("+ Masukkan lebar bingkai : ");
                    int lebar = in.nextInt();
                    pemesan.luas = panjang * lebar;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    pemesan.uang(3000, pilihan);
                    break;
                case 2:
                    System.out.println("- Bingkai coklat metalik (Rp.2700/m)");
                    System.out.print("+ Masukkan panjang bingkai : ");
                    panjang = in.nextInt();
                    System.out.print("+ Masukkan lebar bingkai : ");
                    lebar = in.nextInt();
                    pemesan.luas = panjang * lebar;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    pemesan.uang(2700, pilihan);
                    break;
                case 3:
                    System.out.println("- Bingkai coklat bercorak (Rp.2300/m)");
                    System.out.print("+ Masukkan panjang bingkai : ");
                    panjang = in.nextInt();
                    System.out.print("+ Masukkan lebar bingkai : ");
                    lebar = in.nextInt();
                    pemesan.luas = panjang * lebar;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    pemesan.uang(2300, pilihan);
                    break;
                case 4:
                    System.out.println("- Bingkai Hitam bercorak (Rp.2500/m)");
                    System.out.print("+ Masukkan panjang bingkai : ");
                    panjang = in.nextInt();
                    System.out.print("+ Masukkan lebar bingkai : ");
                    lebar = in.nextInt();
                    pemesan.luas = panjang * lebar;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    pemesan.uang(2500, pilihan);
                    break;
                case 5:
                    System.out.println("- Bingkai emas(Rp.5000/m)");
                    System.out.print("+ Masukkan panjang bingkai : ");
                    panjang = in.nextInt();
                    System.out.print("+ Masukkan lebar bingkai : ");
                    lebar = in.nextInt();
                    pemesan.luas = panjang * lebar;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    pemesan.uang(5000, pilihan);
                    break;
                case 6:
                    System.out.println("- Bingkai perak (Rp.4000/m)");
                    System.out.print("+ Masukkan panjang bingkai : ");
                    panjang = in.nextInt();
                    System.out.print("+ Masukkan lebar bingkai : ");
                    lebar = in.nextInt();
                    pemesan.luas = panjang * lebar;
                    System.out.println("+++++++++++++++++++++++++++++++++++++++");
                    pemesan.uang(4000, pilihan);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Kembali ke Menu ?  (Ya/Tidak)");
            System.out.print("Pilihan : ");
            aneh = in.next();
        } while ("ya".equalsIgnoreCase(aneh));
        if ("tidak".equalsIgnoreCase(aneh)) {
            System.out.println("\t\t[ SELESAI ]");
            System.exit(0);
        }

    }
}
