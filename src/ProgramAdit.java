package jenisbingkai;
import java.util.Scanner;
public class ProgramAdit {
    public static void main(String[] args) {
        int lanjut;
        Scanner in = new Scanner(System.in);
        JenisBingkai bingkai = new JenisBingkai();
        System.out.print("Masukkan ID : ");
        String ID = in.nextLine();
        System.out.print("Masukkan nama : ");
        String name = in.nextLine();
        System.out.print("Masukkan tanggal : ");
        String tgl = in.nextLine();
        do {
            System.out.println("Masukkan ukuran");
            System.out.print("Panjang : ");
            int pjg = in.nextInt();
            System.out.print("Lebar : ");
            int lbr = in.nextInt();
            JenisBingkai X = new JenisBingkai(pjg, lbr);
            System.out.println("Jenis Bingkai\t\t\t|\tHarga per meter");
            System.out.println("1. Hitam Metalik\t\t|\t3000");
            System.out.println("2. Coklat Metalik\t\t|\t2700");
            System.out.println("3. Coklat Bercorak\t\t|\t2300");
            System.out.println("4. Hitam Bercorak\t\t|\t2500");
            System.out.println("5. Emas\t\t\t\t|\t5000");
            System.out.println("6. Perak\t\t\t|\t4000");
            System.out.print("Masukkan pilihan : ");
            int pilihan = in.nextInt();
            double ini, ini1, ini2, ini3, ini4, ini5;
            if (pilihan == 1) {
                ini = bingkai.luasbingkai(pjg, lbr) * 3000;
                System.out.println("Harga = " + ini);
                System.out.println("diskon = " + bingkai.diskon(ini));
            } else if (pilihan == 2) {
                ini1 = bingkai.luasbingkai(pjg, lbr) * 2700;
                System.out.println("Harga = " + ini1);
            } else if (pilihan == 3) {
                ini2 = bingkai.luasbingkai(pjg, lbr) * 2300;
                System.out.println("Harga = " + ini2);
            } else if (pilihan == 4) {
                ini3 = bingkai.luasbingkai(pjg, lbr) * 2500;
                System.out.println("Harga = " + ini3);
            } else if (pilihan == 5) {
                ini4 = bingkai.luasbingkai(pjg, lbr) * 5000;
                System.out.println("Harga = " + ini4);
                System.out.println("diskon = " + bingkai.diskon(ini4));
            } else if (pilihan == 6) {
                ini5 = bingkai.luasbingkai(pjg, lbr) * 4000;
                System.out.println("Harga = " + ini5);
                System.out.println("diskon = " + bingkai.diskon(ini5));
            } else {
                System.out.println("pilihan tidak ditemukan");
            }
            System.out.print("Pesan lagi? 1.ya 0.tidak : ");
            lanjut = in.nextInt();
        } while (lanjut != 0);
    }
}
