package optionbingkai;

import java.util.Scanner;

public class MainPemesan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        OptionBingkai Adit = new OptionBingkai();

        System.out.print("Masukkan ID Pemesan       :");
        String IDPemesan = input.nextLine();
        System.out.print("Masukkan nama pemesan     :");
        String namaPemesan = input.nextLine();
        System.out.print("Masukkan tanggal pemesan  :");
        String tanggalPemesan = input.nextLine();

        System.out.println("Masukkan ukuran bingkai :");
        System.out.print("Masukkan panjang          :");
        Adit.panjang(input.nextInt());

        System.out.print("Masukkan lebar            :");
        Adit.lebar(input.nextInt());

        System.out.println("Masukkan jenis bingkai  :");
        String jenisBingkai = input.next();
        double totalHarga = 0;

        switch (jenisBingkai) {
            case "HitamMetalik":
                totalHarga = Adit.HitungLuas() * 3000;
                System.out.println("Harga " + Adit.HitungLuas() * 3000);
                break;
            case "Cokelat Metalik":
                totalHarga = Adit.HitungLuas() * 2700;
                System.out.println("Harga " + Adit.HitungLuas() * 2700);
                break;
            case "Cokelat Bercorak":
                totalHarga = Adit.HitungLuas() * 2300;
                System.out.println("Harga " + Adit.HitungLuas() * 2300);
                break;
            case "Hitam Bercorak":
                totalHarga = Adit.HitungLuas() * 2500;
                System.out.println("Harga " + Adit.HitungLuas() * 2500);
                break;
            case "Emas":
                totalHarga = Adit.HitungLuas() * 5000;
                System.out.println("Harga " + Adit.HitungLuas() * 5000);
                break;
            case "Perak":
                totalHarga = Adit.HitungLuas() * 4000;
                System.out.println("Harga" + Adit.HitungLuas() * 4000);
                break;

        }
        System.out.println("Diskon Bingkai :" + Adit.diskon(totalHarga));

    }

}
