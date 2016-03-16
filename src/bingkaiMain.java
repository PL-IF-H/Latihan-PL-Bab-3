 import java.util.Scanner;
 public class bingkaiMain {     
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         bingkai pemesan = new bingkai("");
         String kembali;
         do {
             pemesan.bayar=0;
             System.out.println("===== Selamat Datang =====");
             System.out.print("Masukkan ID\t: ");
             pemesan.idpemesan = in.next();
             System.out.print("Masukkan Nama\t: ");
             pemesan.nama = in.next();
             System.out.print("Tanggal\t\t: ");
             pemesan.tanggal = in.next();
             System.out.println("============================================");
             System.out.println("Pilihan Menu");
             System.out.println("No. Pilihan Warna   | Harga per m");
             System.out.println(" 1. Hitam Metalik   |    3000");
             System.out.println(" 2. Coklat Metalik  |    2700");
             System.out.println(" 3. Coklat Bercorak |    2300");
             System.out.println(" 4. Hitam Bercorak  |    2500");
             System.out.println(" 5. Emas            |    5000");
             System.out.println(" 6. Perak           |    4000");
             System.out.print("Masukkan Pilihan: ");
              int pilihan = in.nextInt();
              switch (pilihan) {
                  case 1:                    
                    System.out.print("Masukkan panjang bingkai : ");
                     int panjang = in.nextInt();
                     System.out.print("Masukkan lebar bingkai   : ");
                     int lebar = in.nextInt();
                     pemesan.zzz = 2*(panjang + lebar);
                     pemesan.displayPesanan(3000, pilihan, 1);break;
                 case 2:
                     System.out.print("Masukkan panjang bingkai : ");
                     panjang = in.nextInt();
                     System.out.print("Masukkan lebar bingkai   : ");
                     lebar = in.nextInt();
                     pemesan.zzz = 2*(panjang + lebar);
                     pemesan.displayPesanan(2700, pilihan, 1);break;
                 case 3:
                     System.out.print("Masukkan panjang bingkai : ");
                     panjang = in.nextInt();
                     System.out.print("Masukkan lebar bingkai   : ");
                     lebar = in.nextInt();
                     pemesan.zzz = 2*(panjang + lebar);
                     pemesan.displayPesanan(2300, pilihan, 1);break;
                 case 4:
                     System.out.print("Masukkan panjang bingkai : ");
                     panjang = in.nextInt();
                     System.out.print("Masukkan lebar bingkai   : ");
                     lebar = in.nextInt();
                     pemesan.zzz = 2*(panjang + lebar);
                     pemesan.displayPesanan(2500, pilihan, 1);break;
                 case 5:
                     System.out.print("Masukkan panjang bingkai : ");
                     panjang = in.nextInt();
                     System.out.print("Masukkan lebar bingkai   : ");
                     lebar = in.nextInt();
                     pemesan.zzz = 2*(panjang + lebar);
                     pemesan.displayPesanan(5000, pilihan, 1);break;
                 case 6:
                     System.out.print("Masukkan panjang bingkai : ");
                     panjang = in.nextInt();
                     System.out.print("Masukkan lebar bingkai   : ");
                     lebar = in.nextInt();
                     pemesan.zzz = 2*(panjang + lebar);
                     pemesan.displayPesanan(4000, pilihan, 1);break;
                 default:
                     System.out.println("Pilihan anda salah");
             }
             System.out.println("Ingin memesan lagi?  (Y/N)");
             kembali = in.next();
         } while ("Y".equalsIgnoreCase(kembali));
         if ("N".equalsIgnoreCase(kembali)) {
             System.out.println("Terimakasih");
             
         }
 
     }
 } 