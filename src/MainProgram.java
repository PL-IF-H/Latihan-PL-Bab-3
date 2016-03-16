import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
	
		int pilihan, i = 0;
		
		Scanner input = new Scanner(System.in);
		
		Pemesan pemesan[] = new Pemesan[100];
		Bingkai bingkai[] = new Bingkai[100];
		
		do {
			pemesan[i] = new Pemesan();
			bingkai[i] = new Bingkai();
			System.out.println("=======================================");
			System.out.println("1. Masukkan Pesanan");
			System.out.println("2. Daftar Pesanan");
			System.out.println("3. Exit");
			System.out.print("Masukkan pilihan: ");
			pilihan = input.nextInt();
			if(pilihan == 1) {
				System.out.println("=======================================");
				System.out.println("Masukkan ID, Nama, dan Tanggal pemesanan");
				pemesan[i].Pemesan(input.next(), input.next(), input.next());
				System.out.println("=======================================");
				System.out.println("No\tJenis Bingkai \t Harga per m");
				System.out.println("1. Hitam Metalik\t3000");
				System.out.println("2. Coklat Metalik\t2700");
				System.out.println("3. Coklat Bercorak\t2300");
				System.out.println("4. Hitam Bercorak\t2500");
				System.out.println("5. Emas\t\t\t5000");
				System.out.println("6. Perak\t\t4000");
				System.out.print("Masukkan pilihan: ");
				//use overloading constructor to input jenisBingkai
				bingkai[i].Bingkai(input.nextInt());
				System.out.println("=======================================");
				System.out.println("Masukkan panjang dan lebar bingkai");
				//use overloading constructor to input panjang, lebar
				bingkai[i].Bingkai(input.nextInt(), input.nextInt());
				bingkai[i].ukuran();
				bingkai[i].harga(bingkai[i].jenis);
				
				if (bingkai[i].jenis == 1 || bingkai[i].jenis == 5 || bingkai[i].jenis == 6) {						
					bingkai[i].diskon(bingkai[i].jenis);
				}
				i++;
				
			} else if(pilihan == 2) {
				System.out.println("=======================================");
				System.out.println("Dafter Pesanan");
				System.out.println("ID\tNama\t\tTanggal pemesanan\tJenis\tHarga\tDiskon\t\t| Bayar");
				for (int j = 0; j < i; j++) {
					pemesan[j].displayData();
					bingkai[j].displayData();
				}
			}
		} while(pilihan != 3);
	}
}