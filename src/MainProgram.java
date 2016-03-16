package tugas;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Bingkai bing = new Bingkai();
        Scanner input = new Scanner (System.in);
        System.out.println("====================PROGRAM BINGKAI=====================");
        System.out.print("Masukkan ID Pemesan            : ");
        String idpe = input.next();
        System.out.print("Masukkan Nama Pemesan          : ");
        String nape = input.next();
        input.nextLine();
        System.out.print("Masukkan Tanggal Pesanan       : ");
        String tape = input.next();
        input.nextLine();
        System.out.println("===================TABEL JENIS BINGKAI===================");
        String [][] jenisbingkai = {{"   Jenis Bingkai","| Harga per meter"},
                                    {"1. Hitam Metalik   : ","3000"},
                                    {"2. Coklat Metalik  : ","2700"},
                                    {"3. Coklat Bercorak : ","2300"},
                                    {"4. Hitam Bercorak  : ","2500"},
                                    {"5. Emas            : ","5000"},
                                    {"6. Perak           : ","4000"}};
        System.out.println("========================================================");
        for (int i = 0; i<jenisbingkai.length;i++){
          System.out.println(jenisbingkai[i][0]+jenisbingkai[i][1]);
        }
        System.out.print("Masukkan Pilihan Jenis Bingkai sesuai nomor urut 1 - 6: ");
        int z = input.nextInt();
        int ubah = Integer.parseInt(jenisbingkai[z][1]);
        
        System.out.print("Masukkan Panjang Bingkai       : ");
        bing.setPanjang(input.nextInt());
        System.out.print("Masukkan Lebar Bingkai         : ");
        bing.setLebar(input.nextInt());
        bing.hitungluas();
        System.out.println("Luas Bingkai : "+bing.hitungluas()+" m");
        int total = ubah*bing.hitungluas();
        System.out.println("Harga total                   Rp. "+total+" Rupiah");
        if ((total>=300000) && (total < 450000)){
            double total1 = total*0.05;
            System.out.println("Selamat Anda Mendapat Diskon 5%");
            System.out.println("Harga yang harus di bayar Rp. "+total1+" Rupiah");
        }
        else if((total>=450000) && (total < 600000)){
            double total2 = total*0.1;
            System.out.println("Selamat Anda Mendapat Diskon 10%");
            System.out.println("Harga yang harus di bayar Rp. "+total2+" Rupiah");
        }
        else{
            double total3 = total*0.15;
            System.out.println("Selamat Anda Mendapat Diskon 15%");
            System.out.println("Harga yang harus di bayar Rp. "+total3+" Rupiah");
        }
        
    }       
        
    }

