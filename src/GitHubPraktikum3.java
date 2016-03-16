package githubpraktikum3;
import java.util.Scanner;
/*
 *NAMA  : I KETUT SIDHARTA YOGATAMA
 *NIM   : 155150200111102
 *KELAS : IF - H
 */
public class GitHubPraktikum3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TokoAdit coba = new TokoAdit("Yoga","16-3-2016","123456");
        int s=2;
        for (int i = 0; i < 1; i++) {
            if (coba.cekId()){
                for (int j = 0; j < 1; j++) {
                    System.out.println("===================================================================");
                    System.out.println("Harga Menu Bingkai : ");
                    System.out.println("1. Warna Hitam Metalik \t\t - 3000/m \t\t(Diskon)");
                    System.out.println("2. Warna Coklat Metalik \t - 2700/m");
                    System.out.println("3. Warna Coklat Bercorak \t - 2300/m");
                    System.out.println("4. Warna Hitam Bercorak \t - 2500/m");
                    System.out.println("5. Warna Emas \t\t\t - 5000/m \t\t(Diskon)");
                    System.out.println("6. Warna Perak \t\t\t - 4000/m \t\t(Diskon) ");
                    System.out.println("Ketentuan Diskon : ");
                    System.out.println("- Jika total bayar lebih dari 300000 maka akan mendapat diskon 5%");
                    System.out.println("- Jika total bayar lebih dari 450000 maka akan mendapat diskon 10%");
                    System.out.println("- Jika total bayar lebih dari 600000 maka akan mendapat diskon 15%");
                    System.out.print("Masukan Pilihan : ");
                    int pilihan=in.nextInt();
                    System.out.println("===================================================================");
                    switch(pilihan){
                        case 1:
                            System.out.print("Masukan panjang : ");
                            double panjang = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            double lebar = in.nextInt();
                            double p = panjang * 3000;
                            double l = lebar * 3000;
                            double hasil = (panjang*3000+lebar*3000);
                            if(hasil>300000&&hasil<450000){
                                double akhir = hasil - (hasil *(0.05));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang+"m"+" x "+lebar+"m");
                            System.out.println("Anda mendapatkan diskon 5%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil>450000&&hasil<600000){
                                double akhir = hasil - (hasil *(0.1));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang+"m"+" x "+lebar+"m");
                            System.out.println("Anda mendapatkan diskon 10%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil>600000){
                                double akhir = hasil - (hasil *(0.15));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang+"m"+" x "+lebar+"m");
                            System.out.println("Anda mendapatkan diskon 15%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else{
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang+"m"+" x "+lebar+"m");
                            System.out.println("Total bayar = Rp. "+hasil+",-");
                            }
                            break;
                        case 2:
                            System.out.print("Masukan panjang : ");
                            double panjang2 = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            double lebar2 = in.nextInt();
                            double p2 = panjang2 * 2700;
                            double l2 = lebar2 * 2700;
                            double hasil2 = p2+l2;
                            if(hasil2>300000&&hasil2<450000){
                                double akhir = hasil2 - (hasil2 *(0.05));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang2+"m"+" x "+lebar2+"m");
                            System.out.println("Anda mendapatkan diskon 5%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil2>450000&&hasil2<600000){
                                double akhir = hasil2 - (hasil2 *(0.1));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang2+"m"+" x "+lebar2+"m");
                            System.out.println("Anda mendapatkan diskon 10%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil2>600000){
                                double akhir = hasil2 - (hasil2 *(0.15));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang2+"m"+" x "+lebar2+"m");
                            System.out.println("Anda mendapatkan diskon 15%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else{
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang2+"m"+" x "+lebar2+"m");
                            System.out.println("Total bayar = Rp. "+hasil2+",-");
                            }
                            break;
                        case 3:
                            System.out.print("Masukan panjang : ");
                            double panjang3 = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            double lebar3 = in.nextInt();
                            double p3 = panjang3 * 2300;
                            double l3 = lebar3 * 2300;
                            double hasil3 = p3+l3;
                            if(hasil3>300000&&hasil3<450000){
                                double akhir = hasil3 - (hasil3 *(0.05));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang3+"m"+" x "+lebar3+"m");
                            System.out.println("Anda mendapatkan diskon 5%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil3>450000&&hasil3<600000){
                                double akhir = hasil3 - (hasil3 *(0.1));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang3+"m"+" x "+lebar3+"m");
                            System.out.println("Anda mendapatkan diskon 10%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil3>600000){
                                double akhir = hasil3 - (hasil3 *(0.15));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang3+"m"+" x "+lebar3+"m");
                            System.out.println("Anda mendapatkan diskon 15%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else{
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang3+"m"+" x "+lebar3+"m");
                            System.out.println("Total bayar = Rp. "+hasil3+",-");
                                }
                            break;                               
                        case 4:
                            System.out.print("Masukan panjang : ");
                            double panjang4 = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            double lebar4 = in.nextInt();
                            double p4 = panjang4 * 2500;
                            double l4 = lebar4 * 2500;
                            double hasil4 = p4+l4;
                            if(hasil4>300000&&hasil4<450000){
                                double akhir = hasil4 - (hasil4 *(0.05));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang4+"m"+" x "+lebar4+"m");
                            System.out.println("Anda mendapatkan diskon 5%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil4>450000&&hasil4<600000){
                                double akhir = hasil4 - (hasil4 *(0.1));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang4+"m"+" x "+lebar4+"m");
                            System.out.println("Anda mendapatkan diskon 10%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil4>600000){
                                double akhir = hasil4 - (hasil4 *(0.15));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang4+"m"+" x "+lebar4+"m");
                            System.out.println("Anda mendapatkan diskon 15%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else{
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang4+"m"+" x "+lebar4+"m");
                            System.out.println("Total bayar = Rp. "+hasil4+",-");
                                }
                            break;
                        case 5:
                            System.out.print("Masukan panjang : ");
                            double panjang5 = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            double lebar5 = in.nextInt();
                            double p5 = panjang5 * 5000;
                            double l5 = lebar5 * 5000;
                            double hasil5 = p5+l5;
                            if(hasil5>300000&&hasil5<450000){
                                double akhir = hasil5 - (hasil5 *(0.05));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang5+"m"+" x "+lebar5+"m");
                            System.out.println("Anda mendapatkan diskon 5%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil5>450000&&hasil5<600000){
                                double akhir = hasil5 - (hasil5 *(0.1));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang5+"m"+" x "+lebar5+"m");
                            System.out.println("Anda mendapatkan diskon 10%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil5>600000){
                                double akhir = hasil5 - (hasil5 *(0.15));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang5+"m"+" x "+lebar5+"m");
                            System.out.println("Anda mendapatkan diskon 15%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else{
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang5+"m"+" x "+lebar5+"m");
                            System.out.println("Total bayar = Rp. "+hasil5+",-");
                                }
                            break;
                        case 6:
                            System.out.print("Masukan panjang : ");
                            double panjang6 = in.nextInt();
                            System.out.print("Masukan lebar \t: ");
                            double lebar6 = in.nextInt();
                            double p6 = panjang6 * 2300;
                            double l6 = lebar6 * 2300;
                            double hasil6 = p6+l6;
                            if(hasil6>300000&&hasil6<450000){
                                double akhir = hasil6 - (hasil6 *(0.05));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang6+"m"+" x "+lebar6+"m");
                            System.out.println("Anda mendapatkan diskon 5%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil6>450000&&hasil6<600000){
                                double akhir = hasil6 - (hasil6 *(0.1));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang6+"m"+" x "+lebar6+"m");
                            System.out.println("Anda mendapatkan diskon 10%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else if(hasil6>600000){
                                double akhir = hasil6 - (hasil6 *(0.15));
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang6+"m"+" x "+lebar6+"m");
                            System.out.println("Anda mendapatkan diskon 15%");
                            System.out.println("Total bayar = Rp. "+akhir+",-");
                            }
                                else{
                            System.out.println("===================================================================");
                            System.out.println("Anda membeli bingkai warna hitam metalik dengan ukuran : "+panjang6+"m"+" x "+lebar6+"m");
                            System.out.println("Total bayar = Rp. "+hasil6+",-");
                                }
                            break;
                        default:
                            System.out.println("maaf pilihan yang anda masukkan tidak tersedia !");
                            break;
                    }
                }
            }else{
                System.out.println("maaf id pemesan/nama tidak tersedia ! coba ulangi !");
                if (s==0){
                    break;
                }else{
                    s--;
                    i--;
                }
            }
        }   
    } 
}