import java.util.Scanner;

Public class MainProgram {

	public static void main(String[] args) {
	
		int pilihan, i = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			Pemesan pemesan[] = new Pemesan[100];
			Bingkai bingkai[] = new Bingkai[100];
			System.out.println("1. Masukkan Pesanan");
			System.out.println("2. Daftar Pesanan");
			System.out.println("3. Exit");
			System.out.print("Masukkan pilihan: ");
			pilihan = input.next();
			
			switch(pilihan) {
				case 1:
					System.out.println("Masukkan ID, nama, dan tanggal pemesanan");
					Pemesan pemesan[i] = new Pemesan(input.next(), input.next(), input.next());
					System.out.println("No\tJenis Bingkai \t Harga per m");
					System.out.println("1. Hitam Metalik\t3000");
					System.out.println("2. Coklat Metalik\t2700");
					System.out.println("3. Coklat Bercorak\t2300");
					System.out.println("4. Hitam Bercorak\t2500");
					System.out.println("5. Emas\t5000");
					System.out.println("6. Perak\t4000");
					//use overloading constructor to input jenisBingkai
					Bingkai bingkai[i] = new Bingkai(input.nextInt());
					System.out.println("Masukkan panjang dan lebar bingkai");
					//use overloading constructor to input panjang, lebar
					Bingkai bingkai[i] = new Bingkai(input.nextInt(), input.nextInt());
					bingkai[i].harga(bingkai[i].jenis);
					
					switch(bingkai[i].jenis) {
						case 1: case 5: case 6:
							bingkai[i].diskon(bingkai[i].jenis);
							break;
						default:
							break;
					}
					
					i++;
					break;
			}
		} while(pilihan != 3);
	}
}