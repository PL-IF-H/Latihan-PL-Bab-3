package programadit;

import java.util.Scanner;

public class ProgramAdit {

    public static void main(String[] args) {
        String nama, jenis;
        int id;
        Scanner in = new Scanner(System.in);
        Scanner masukan = new Scanner(System.in);
        dataPemesan user[] = new dataPemesan[5000];
        int a = 0;
        for (;;) {
            user[a] = new dataPemesan();
            System.out.println("Data Pemesan ke " + (a + 1));
            System.out.print("Masukkan id Pesanan : ");
            user[a].data(in.nextInt());
            System.out.print("Masukkan Nama\t: ");
            nama = masukan.nextLine();
            System.out.print("Masukkan Tanggal: ");
            user[a].data(nama, masukan.nextLine());
            user[a].pilihan();
            System.out.print("Masukkan pilihan : ");
            jenis = masukan.nextLine();
            System.out.print("Masukkan Panjang : ");
            user[a].setPanjang(masukan.nextDouble());
            System.out.print("Masukkan Lebar   : ");
            user[a].setLebar(masukan.nextDouble());
            user[a].setJenis(jenis);
            System.out.println("Total Harga\t : Rp " + user[a].getHarga());
            System.out.println("Apakah ada pesanan lagi ?"
                    + "\n1. Ya "
                    + "\n2. Tidak");
            System.out.print("Masukkan pilihan : ");
            int pilih = in.nextInt();
            masukan.nextLine();
            if (pilih == 1) {
                a++;
            } else {
                break;
            }
        }
    }

}
