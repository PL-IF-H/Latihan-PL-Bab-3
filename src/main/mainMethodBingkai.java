package main;

import java.util.Scanner;
import Bingkai.Bingkai;
import Pemesan.Pemesan;
import Diskon.Diskon;

public class mainMethodBingkai {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner on = new Scanner(System.in);
        Bingkai bingkai = new Bingkai();
        Pemesan pesan = new Pemesan();
        Diskon diskon = new Diskon();
        int menu, pilihan, jumlah_bingkai;
        int panjang, lebar,total;
        String id, nama, tanggal, jenis;

        System.out.println("------------------ADIT GO GREEN------------------");
        System.out.println("");
        System.out.print("ID Pemesan    : ");
        id = on.nextLine();
        System.out.print("Nama Pemesan  : ");
        nama = on.nextLine();
        System.out.print("Tanggal Pesan : ");
        tanggal = on.nextLine();
        pesan.setPemesan(id, nama, tanggal);
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
                            System.out.println("1. Hitam Metalik");
                            System.out.println("2. Coklat Metalik");
                            System.out.println("3. Coklat Bercorak");
                            System.out.println("4. Hitam Bercorak");
                            System.out.println("5. Emas");
                            System.out.println("6. Perak");
                            System.out.println("0. Selesai");

                            System.out.print("Masukkan pilihan : ");
                            pilihan = in.nextInt();
                            System.out.println("");
                    
                            switch (pilihan) {

                                case 1:
                                    System.out.println("---------Hitam Metalik---------");

                                    System.out.print("Panjang Bingkai   : ");
                                    panjang = in.nextInt();
                                    System.out.print("Lebar Bingkai     : ");
                                    lebar = in.nextInt();
                                    jenis = "Hitam Metalik";
                                    bingkai= new Bingkai(panjang, lebar,jenis);
                                    total = bingkai.menentukan();
                                    System.out.println("Terima Kasih, silahkan cek menu Total Pembelian");
                                    System.out.println("");

                                    break;
                                case 2:
                                    System.out.println("---------Coklat Metalik---------");

                                    System.out.print("Panjang Bingkai   : ");
                                    panjang = in.nextInt();
                                    System.out.print("Lebar Bingkai     : ");
                                    lebar = in.nextInt();
                                    jenis = "Coklat Metalik";
                                    bingkai= new Bingkai(panjang, lebar,jenis);
                                    total = bingkai.menentukan();
                                    System.out.println("Terima Kasih, silahkan cek menu Total Pembelian");
                                    System.out.println("");

                                    break;
                                case 3:
                                    System.out.println("---------Coklat Bercorak---------");

                                    System.out.print("Panjang Bingkai   : ");
                                    panjang = in.nextInt();
                                    System.out.print("Lebar Bingkai     : ");
                                    lebar = in.nextInt();
                                    jenis = "Coklat Corak";
                                    bingkai= new Bingkai(panjang, lebar,jenis);
                                    total = bingkai.menentukan();
                                    System.out.println("Terima Kasih, silahkan cek menu Total Pembelian");
                                    System.out.println("");

                                    break;
                                case 4:
                                    System.out.println("---------Hitam Bercorak---------");

                                    System.out.print("Panjang Bingkai   : ");
                                    panjang = in.nextInt();
                                    System.out.print("Lebar Bingkai     : ");
                                    lebar = in.nextInt();
                                    jenis = "Hitam Corak";
                                    bingkai= new Bingkai(panjang, lebar,jenis);
                                    total = bingkai.menentukan();
                                    System.out.println("Terima Kasih, silahkan cek menu Total Pembelian");
                                    System.out.println("");

                                    break;
                                case 5:
                                    System.out.println("---------Emas---------");

                                    System.out.print("Panjang Bingkai   : ");
                                    panjang = in.nextInt();
                                    System.out.print("Lebar Bingkai     : ");
                                    lebar = in.nextInt();
                                    jenis = "Emas";
                                    bingkai= new Bingkai(panjang, lebar,jenis);
                                    total = bingkai.menentukan();
                                    System.out.println("Terima Kasih, silahkan cek menu Total Pembelian");
                                    System.out.println("");

                                    break;
                                case 6:
                                    System.out.println("---------Perak---------");

                                    System.out.print("Panjang Bingkai   : ");
                                    panjang = in.nextInt();
                                    System.out.print("Lebar Bingkai     : ");
                                    lebar = in.nextInt();
                                    jenis = "Perak";
                                    bingkai= new Bingkai(panjang, lebar,jenis);
                                    total = bingkai.menentukan();
                                    System.out.println("Terima Kasih, silahkan cek menu Total Pembelian");
                                    System.out.println("");

                                    break;
                                default:
                                    System.out.println("Terima Kasih");
                                    System.out.println("");
                                
                            }break;
                            
                        } while (pilihan != 0);
                    

                    break;

                case 3:
                        bingkai.display();
                        diskon.diskon(bingkai);
                    
                    break;
                default:
                    System.out.println("Terima Kasih telah berbelanja");
                    break;
            }

        } while (menu
                != 4);

    }
}
