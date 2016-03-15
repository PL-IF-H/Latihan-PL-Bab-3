package main;

import java.util.Scanner;
import Bingkai.Bingkai;
import Pemesan.Pemesan;

public class mainMethodBingkai {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner on = new Scanner(System.in);
        Bingkai bingkai = new Bingkai();
        Pemesan pesan = new Pemesan();
        String hitam_metalik = null, coklat_metalik = null, coklat_corak = null, hitam_corak = null, emas = null, perak = null;
        int menu, pilihan;
        int panjang, lebar,luas;
        String id, nama, tanggal, jenis;

        System.out.println("------------------ADIT GO GREEN------------------");
        System.out.println("");

        do {
            System.out.println("1. Lihat Harga Bingkai");
            System.out.println("2. Pesan Bingkai");
            System.out.println("3. Total Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilihan   : ");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    bingkai.displayDaftarBingkai();
                    System.out.println("");
                    break;
                case 2:
                    do {
                        System.out.println("----------Pilihan Bingkai----------");
                        System.out.print("1. Hitam Metalik");
                        System.out.print("2. Coklat Metalik");
                        System.out.print("3. Coklat Bercorak");
                        System.out.print("4. Hitam Bercorak");
                        System.out.print("5. Emas");
                        System.out.print("6. Perak");
                        System.out.print("0. Selesai");
                        System.out.println("Masukkan pilihan : ");
                        pilihan = in.nextInt();
                        switch (pilihan) {
                            case 1:
                                System.out.println("1. Hitam Metalik");
                                System.out.print("ID Pemesan    : ");
                                id = on.nextLine();
                                System.out.print("Nama Pemesan  : ");
                                nama = on.nextLine();
                                System.out.print("Tanggal Pesan : ");
                                tanggal = on.nextLine();
                                pesan.setPemesan(id, nama, tanggal, hitam_metalik);
                                System.out.print("Panjang Bingkai   : ");
                                panjang = in.nextInt();
                                System.out.print("Lebar Bingkai     : ");
                                lebar = in.nextInt();
                                luas = bingkai.hitam_metalik(panjang, lebar);
                                
                                break;
                            case 2:
                                System.out.println("2. Coklat Metalik");
                                System.out.print("ID Pemesan    : ");
                                id = on.nextLine();
                                System.out.print("Nama Pemesan  : ");
                                nama = on.nextLine();
                                System.out.print("Tanggal Pesan : ");
                                tanggal = on.nextLine();
                                pesan.setPemesan(id, nama, tanggal, coklat_metalik);
                                System.out.print("Panjang Bingkai   : ");
                                panjang = in.nextInt();
                                System.out.print("Lebar Bingkai     : ");
                                lebar = in.nextInt();
                                luas = bingkai.coklat_metalik(panjang, lebar);
                                
                                break;
                            case 3:
                                System.out.println("3. Coklat Bercorak");
                                System.out.print("ID Pemesan    : ");
                                id = on.nextLine();
                                System.out.print("Nama Pemesan  : ");
                                nama = on.nextLine();
                                System.out.print("Tanggal Pesan : ");
                                tanggal = on.nextLine();
                                pesan.setPemesan(id, nama, tanggal, coklat_metalik);
                                System.out.print("Panjang Bingkai   : ");
                                panjang = in.nextInt();
                                System.out.print("Lebar Bingkai     : ");
                                lebar = in.nextInt();
                                luas = bingkai.coklat_corak(panjang, lebar);
                                
                                break;
                            case 4:
                                System.out.println("4. Hitam Bercorak");
                                System.out.print("ID Pemesan    : ");
                                id = on.nextLine();
                                System.out.print("Nama Pemesan  : ");
                                nama = on.nextLine();
                                System.out.print("Tanggal Pesan : ");
                                tanggal = on.nextLine();
                                pesan.setPemesan(id, nama, tanggal, coklat_metalik);
                                System.out.print("Panjang Bingkai   : ");
                                panjang = in.nextInt();
                                System.out.print("Lebar Bingkai     : ");
                                lebar = in.nextInt();
                                luas = bingkai.hitam_corak(panjang, lebar);
                                
                                break;
                            case 5:
                                System.out.println("5. Emas");
                                System.out.print("ID Pemesan    : ");
                                id = on.nextLine();
                                System.out.print("Nama Pemesan  : ");
                                nama = on.nextLine();
                                System.out.print("Tanggal Pesan : ");
                                tanggal = on.nextLine();
                                pesan.setPemesan(id, nama, tanggal, coklat_metalik);
                                System.out.print("Panjang Bingkai   : ");
                                panjang = in.nextInt();
                                System.out.print("Lebar Bingkai     : ");
                                lebar = in.nextInt();
                                luas = bingkai.emas(panjang, lebar);
                                
                                break;
                            case 6:
                                System.out.println("6. Perak");
                                System.out.print("ID Pemesan    : ");
                                id = on.nextLine();
                                System.out.print("Nama Pemesan  : ");
                                nama = on.nextLine();
                                System.out.print("Tanggal Pesan : ");
                                tanggal = on.nextLine();
                                pesan.setPemesan(id, nama, tanggal, coklat_metalik);
                                System.out.print("Panjang Bingkai   : ");
                                panjang = in.nextInt();
                                System.out.print("Lebar Bingkai     : ");
                                lebar = in.nextInt();
                                luas = bingkai.perak(panjang, lebar);
                                
                                break;
                            default:
                                System.out.println("Terima Kasih, silahkan cek menu Total Pembelian");
                                break;
                        }

                    } while (pilihan != 6);

                    break;
                case 3:
                    break;
                default:
                    System.out.println("Terima Kasih telah berbelanja");
                    break;
            }

        } while (menu != 4);

    }
}
