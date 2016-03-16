package Soal_GitHub;

import java.util.Scanner;

public class MainBingkai {
    public static void main(String[] args) {
        BingkaiLukisan bl = new BingkaiLukisan();
        Scanner in = new Scanner (System.in);
        String idp, psn, tgl;
        System.out.println("========================================================");
        System.out.println("                    BINGKAI LUKISAN                     ");
        System.out.println("========================================================");
        System.out.print("Masukkan ID Pemesan            : ");
        idp = in.next();
        System.out.print("Masukkan Nama Pemesan          : ");
        psn = in.next();
        in.nextLine();
        System.out.print("Masukkan Tanggal Pesanan       : ");
        tgl = in.next();
        in.nextLine();
        System.out.println("--------------------------------------------------------");
        System.out.println("                   TABEL JENIS BINGKAI                  ");
        System.out.println("--------------------------------------------------------");
        String [][] jenisbingkai = {{"Jenis Bingkai", "|| Harga per meter"},
                                    {"1.Hitam Metalik       : ","3000"},
                                    {"2.Coklat Metalik      : ","2700"},
                                    {"3.Coklat Bercorak     : ","2300"},
                                    {"4.Hitam Bercorak      : ","2500"},
                                    {"5.Emas                : ","5000"},
                                    {"6.Perak               : ","4000"}};
        System.out.println("========================================================");
            for (int i = 0; i<jenisbingkai.length;i++){
                System.out.println(jenisbingkai[i][0]+jenisbingkai[i][1]);
        }
        System.out.println("========================================================");    
        System.out.print("Masukkan Pilihan Jenis Bingkai : ");
        int h = in.nextInt();
        int ubah = Integer.parseInt(jenisbingkai[h][1]);
        
        System.out.print("Masukkan Panjang Bingkai       : ");
            bl.setPanjang(in.nextInt());
        System.out.print("Masukkan Lebar Bingkai         : ");
            bl.setLebar(in.nextInt());
            bl.hitungluas();
        System.out.println("Luas Bingkai : "+bl.hitungluas()+" m");
            int total = ubah*bl.hitungluas();
        System.out.println("Harga total  Rp."+total+" Rupiah");
            if ((total>=300000) && (total < 450000)){
                double total1 = total*0.05;
            System.out.println("");
            System.out.println("----------------------------------------------------");    
            System.out.println("         Selamat Anda Mendapat Diskon 5%            ");
            System.out.println("----------------------------------------------------");
            System.out.println("");
            System.out.println("Harga yang harus di bayar Rp. "+total1+" Rupiah");
        }
        else if((total>=450000) && (total < 600000)){
            double total2 = total*0.1;
            System.out.println("");
            System.out.println("----------------------------------------------------");    
            System.out.println("         Selamat Anda Mendapat Diskon 10%            ");
            System.out.println("----------------------------------------------------");
            System.out.println("");
            System.out.println("Harga yang harus di bayar Rp. "+total2+" Rupiah");
        }
        else{
            double total3 = total*0.15;
            System.out.println("");
            System.out.println("----------------------------------------------------");    
            System.out.println("         Selamat Anda Mendapat Diskon 15%            ");
            System.out.println("----------------------------------------------------");
            System.out.println("");
            System.out.println("Harga yang harus di bayar Rp. "+total3+" Rupiah");
        }
        
    }       
        
    }
