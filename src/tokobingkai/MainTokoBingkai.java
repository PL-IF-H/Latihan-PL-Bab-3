package tokobingkai;
import java.util.Scanner;
public class MainTokoBingkai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ID, nama, tanggal;
        int jenis, panjang, lebar, luas, harga;
        Pemesan p = new Pemesan();
        pesanBingkai b = new pesanBingkai();
        
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
                    harga = 3000 * b.luasBingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+harga);
                case 2:  
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    harga = 2700 * b.luasBingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+harga);
                case 3:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    harga = 2300 * b.luasBingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+harga);
                case 4:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    harga = 2500 * b.luasBingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+harga);
                case 5:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    harga = 5000 * b.luasBingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+harga);
                case 6:
                    System.out.println("Masukkan Ukuran Bingkai : ");
                    System.out.print("Panjang : ");
                    panjang = in.nextInt();
                    b.setPanjang(panjang);
                    System.out.print("Lebar : ");
                    lebar = in.nextInt();
                    b.setLebar(lebar);
                    harga = 4000 * b.luasBingkai(panjang,lebar);
                    System.out.println("Harga Totalnya adalah = "+harga);
            }
        } while (true);
        

    }    
}
