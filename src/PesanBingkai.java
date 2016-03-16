import java.util.Scanner;
public class PesanBingkai {
    public static void main(String[] args) {
        String IDPemesan, NamaPemesan, TanggalPemesanan, JenisBingkai;
        int PanjangBingkai, LebarBingkai, BanyakPesanan;
        String pilihan="", temp[], MiniDB;
        Scanner input = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        
        Bingkai bingkai[];
        System.out.println("========================================");
        System.out.println("            Pemesanan Bingkai");
        System.out.println("========================================");
        System.out.print("ID Pemesan: ");
        IDPemesan = inputStr.nextLine();
        System.out.print("Nama Pemesan: ");
        NamaPemesan = inputStr.nextLine();
        System.out.print("Tanggal Pemesanan: ");
        TanggalPemesanan = inputStr.nextLine();
        Pemesan pemesan = new Pemesan(IDPemesan, NamaPemesan, TanggalPemesanan);
        System.out.print("Banyak Pesanan: ");
        BanyakPesanan = input.nextInt();
        System.out.println("Bingkai\n[JENIS BINGKAI],[PANJANG],[LEBAR]");
        bingkai = new Bingkai[BanyakPesanan];
        for (int i = 0; i < BanyakPesanan; i++) {
            pilihan = inputStr.nextLine();
            temp = pilihan.split(",");
            bingkai[i] = new Bingkai(temp[0], temp[1], temp[2]);
        }
        System.out.printf("Harga: %.2f\n", harga(bingkai));
        
        
    }
	
	private static double cekHarga(double hargaDiskon, Bingkai bingkai){
		double harga;
		harga = hargaDiskon + bingkai.harga();
        if (harga>600000) {
            harga-=harga*0.15;
        }
        else if (harga>450000) {
            harga-=harga*0.10;
        }
        else if (harga>300000) {
            harga-=harga*0.05;
		}
		return harga;
	}
    private static double cekHarga(Bingkai bingkai){
		return bingkai.harga();
	}
    
    private static double harga(Bingkai[] bingkai){
        double hargaTanpaDiskon=0;
        double hargaDiskon=0;
        for (int i = 0; i < bingkai.length; i++) {
            String jenis = bingkai[i].jenis();
            if (jenis.equals("Hitam Metalik") || jenis.equals("Emas") || jenis.equals("Perak")) 
				hargaDiskon = cekHarga(hargaDiskon, bingkai[i]);
            
            else
                hargaTanpaDiskon += cekHarga(bingkai[i]);
        
        }
        return hargaTanpaDiskon + hargaDiskon;
    }
    
}
