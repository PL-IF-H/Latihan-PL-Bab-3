package mainbinkai;

import java.util.Scanner;

public class MainBinkai {

    public static void main(String[] args) {
        Scanner inStr = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        System.out.println("============= BINKAI ADIT ============");

        System.out.print("no ID             : ");
        int ID = in.nextInt();
        System.out.print("Nama              : ");
        String nama = inStr.nextLine();
        System.out.print("Tanggal pemesanan : ");
        String tanggal = inStr.nextLine();
        System.out.print("Jenis binkai      : ");
        String jenis = inStr.nextLine();
        System.out.print("Panjang(m)        : ");
        int panjang = in.nextInt();
        System.out.print("Lebar(m)          : ");
        int lebar = in.nextInt();
        System.out.print("jumlah            : ");
        int jumlah = in.nextInt();

        pembeli p[] = new pembeli[10];
        p[0] = new pembeli(nama, tanggal, ID);
        binkai b[] = new binkai[10];
        b[0] = new binkai();

        b[0].set(jenis);
        b[0].set(jumlah, lebar, panjang);

        p[0].display();
        b[0].display();

        System.out.println("Input Data lagi?");
        System.out.println("Jika ya tekan 1");

        System.out.print("Pilihan : ");
        int pilihan = in.nextInt();
        do {
            switch (pilihan) {
                case 1:
                    int i = 1;
                    System.out.print("no ID             : ");
                    ID = in.nextInt();
                    System.out.print("Nama              : ");
                    nama = inStr.nextLine();
                    System.out.print("Tanggal pemesanan : ");
                    tanggal = inStr.nextLine();
                    System.out.print("Jenis binkai      : ");
                    jenis = inStr.nextLine();
                    System.out.print("Panjang(m)        : ");
                    panjang = in.nextInt();
                    System.out.print("Lebar(m)          : ");
                    lebar = in.nextInt();
                    System.out.print("jumlah            : ");
                    jumlah = in.nextInt();
                    p[i] = new pembeli(nama, tanggal, ID);
                    b[i] = new binkai(jenis, panjang, lebar, jumlah);
                    p[i].display();
                    b[i].display();
                    i++;
                    break;
                default:
                    System.out.println("Terima Kasih");

            }
        } while (pilihan == 1);

    }

}
