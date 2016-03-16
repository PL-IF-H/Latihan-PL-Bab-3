import java.util.Scanner;

public class MainBingkai{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String nama, alamat, tanggal, jenis;
		double panjang, lebar;
		
		System.out.println("===Toko Bingkai Adit===");
		System.out.print("Nama Anda       : ");
		nama = in.nextLine();
		System.out.print("Alamat          : ");
		alamat = in.nextLine();
		System.out.print("Tanggal Pesan   : ");
		tanggal = in.nextLine();
		Pemesan ID = new Pemesan(nama, alamat, tanggal);
		System.out.println("\nDaftar Jenis Bingkai : ");
		System.out.println(Bingkai.displayBingkai());
		
		System.out.print("Pilih Jenis Bingkai : ");
		jenis = in.nextLine();
		System.out.print("Panjang Bingkai     : ");
		panjang = in.nextDouble();
		System.out.print("Lebar Bingkai       : ");
		lebar = in.nextDouble();
		Bingkai bingkai = new Bingkai(panjang, lebar, jenis);
		in.nextLine();
		if(bingkai.getJenis().equals("Hitam Metalik")||bingkai.getJenis().equals("Emas")||bingkai.getJenis().equals("Perak")){
			bingkai.hitungDiskon();
		}
		bingkai.hitungHarga();
		bingkai.displayData();
	}
}