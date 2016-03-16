package tokobingkai;
import java.util.Scanner;
public class MainTokoBingkai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ID, nama, tanggal;
        int jenis, panjang, lebar, luas, harga, input;
        double D = 0;
        Pemesan p = new Pemesan();
        pesanBingkai b = new pesanBingkai();
        diskon d = new diskon();
        
        //Pemasukan Data Pemesan
        System.out.print("Masukkan ID : ");
        ID = in.nextLine();
        p.setID(ID);
        System.out.print("Masukkan Nama : ");
        nama = in.nextLine();
        p.setNama(nama);
        System.out.print("Masukkan Tanggal : ");
        tanggal = in.nextLine();
        p.setTanggal(tanggal);
        
        //Pemasukan Jenis,Ukuran Bingkai dan penentuan harga
        do {
            System.out.println("Pilih Jenis Bingkai : ");
            b.displayDaftar();
            System.out.print("Input : ");
            jenis = in.nextInt();
            b.setJenis(jenis);
            switch(jenis){
                case 1:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    b.luasdanharga_Bingkai(panjang,lebar);
                    System.out.println("Harga Total = "+b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),3000));
                    System.out.println("Harga Diskon = "+d.diskonBingkai(b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),3000),D));
                    break;
                case 2:  
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    b.luasdanharga_Bingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),2700));
                    break;
                case 3:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    b.luasdanharga_Bingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),2300));
                    break;
                case 4:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    b.luasdanharga_Bingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),2500));
                    break;
                case 5:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    b.luasdanharga_Bingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),5000));
                    System.out.println("Harga Diskon = "+d.diskonBingkai(b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),5000),D));
                    break;
                case 6:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    b.luasdanharga_Bingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),4000));
                    System.out.println("Harga Diskon = "+d.diskonBingkai(b.luasdanharga_Bingkai(b.luasdanharga_Bingkai(panjang,lebar),4000),D));
                    break;
                default : System.out.println("Input Salah!");    
            }
            System.out.println("Ingin Memesan Lagi? (1. Ya/2. Tidak)");
            System.out.print("Input : ");
            input = in.nextInt();
            if (input == 2) {
                System.out.println("Terima Kasih!");
            }
        } while (input == 1);
        

    }    
}
