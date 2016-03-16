package tugaspemlan3;
//* Nama : Darin Nadhifah
//* NIM : 155150207111063
//* Kelas : TIF-H
import java.util.Scanner;

public class MenuPemesanan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        String ID, nama, tgl, choice;
        int p, l, pilihan = 0, count = 0, totalmain = 0;
        Pembelian[] a = new Pembelian[100];
        Bingkai[] b = new Bingkai[100];
        boolean tutup = false;
        String menuBingkai[] = {"1. Hitam Metalik", "2. Cokelat Metalik", "3. Cokelat Bercorak",
            "4. Hitam Bercorak", "5. Emas", "6. Perak"};
        String hargaBingkai[] = {"3000", "2700", "2300", "2500", "5000", "4000"};
        int hargaBingkaiint[] = {3000, 2700, 2300, 2500, 5000, 4000};
        System.out.println("PILIHAN BINGKAI");
        System.out.printf("%-30s %-13s %s \n","Jenis","||","Harga");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%-30s %-15s %-15s\n",menuBingkai[i],"||",hargaBingkai[i]);
        }
        System.out.println("");

        System.out.println("          Pemesanan         ");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.print("Masukkan ID       : ");
        ID = in2.nextLine();
        System.out.print("Masukkan Nama     : ");
        nama = in2.nextLine();
        System.out.print("Masukkan tanggal  : ");
        tgl = in2.nextLine();
        for (int c = 1; c != 0; c--) {
            System.out.println("----------------------------");
            System.out.print("Masukkan Jenis    : ");
            pilihan = in.nextInt();
            System.out.println();
            System.out.print("\tMasukkan Panjang  : ");
            p = in.nextInt();
            System.out.print("\tMasukkan Lebar    : ");
            l = in.nextInt();
            System.out.println();
            a[count] = new Pembelian();
            b[count] = new Bingkai();
            switch (pilihan) {
                case 1: //hitam metalik
                    b[count].menuBingkai(ID, nama, tgl, "Hitam Metalik");
                    a[count].Keliling(p, l);
                    a[count].Hitung(p, l, hargaBingkaiint[0]);
                    a[count].Diskon();
                    System.out.print("Input lagi? (y/n) : ");
                    choice = in.next();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                    count++;
                    c++;
                    System.out.println();
                    break;
                case 2: //cokelat metalik
                    b[count].menuBingkai(ID, nama, tgl, "Cokelat Metalik");
                    a[count].Keliling(p, l);
                    a[count].Hitung(p, l, hargaBingkaiint[1]);
                    System.out.print("Input lagi? (y/n) : ");
                    choice = in.next();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                    count++;
                    c++;
                    System.out.println();
                    break;
                case 3: //cokelat bercorak
                    b[count].menuBingkai(ID, nama, tgl, "Coklat Bercorak");
                    a[count].Keliling(p, l);
                    a[count].Hitung(p, l, hargaBingkaiint[2]);
                    System.out.print("Input lagi? (y/n) : ");
                    choice = in.next();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                    count++;
                    c++;
                    System.out.println();
                    break;
                case 4: //hitam bercorak
                    b[count].menuBingkai(ID, nama, tgl, "Hitam Bercorak");
                    a[count].Keliling(p, l);
                    a[count].Hitung(p, l, hargaBingkaiint[3]);
                    System.out.print("Input lagi? (y/n) : ");
                    choice = in.next();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                    count++;
                    c++;
                    System.out.println();
                    break;
                case 5: //emas
                    b[count].menuBingkai(ID, nama, tgl, "Emas");
                    a[count].Keliling(p, l);
                    a[count].Hitung(p, l, hargaBingkaiint[4]);
                    a[count].Diskon();
                    System.out.print("Input lagi? (y/n) : ");
                    choice = in.next();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                    count++;
                    c++;
                    System.out.println();
                    break;
                case 6: //perak
                    b[count].menuBingkai(ID, nama, tgl, "Perak");
                    a[count].Keliling(p, l);
                    a[count].Hitung(p, l, hargaBingkaiint[5]);
                    a[count].Diskon();
                    System.out.print("Input lagi? (y/n) : ");
                    choice = in.next();
                    if (choice.equalsIgnoreCase("n")) {
                        break;
                    }
                    count++;
                    c++;
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan yang anda inginkan tidak tersedia");
            }
        }
        b[count].display();
        for (int i = 0; i <= count; i++) {
            totalmain += a[count].total;
        }
        System.out.println("Total         : " + totalmain);
    }
}
