import java.util.Scanner;

public class MainBingkai{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String nama, alamat;
		int tanggal;
		Pemesan ID = new Pemesan();
		Bingkai bingkai = new Bingkai();
		System.out.println("===Toko Bingkai Adit===");
		System.out.print("Nama Anda       : ");
		ID.setNama(in.nextLine());
		System.out.print("Alamat          : ");
		ID.setAlamat(in.nextLine());
		System.out.print("Tanggal Pesan   : ");
		ID.setTanggal(in.nextLine());
		System.out.println("\nDaftar Jenis Bingkai : ");
		System.out.println(bingkai.displayBingkai());
		System.out.print("Pilih Jenis Bingkai : ");
		bingkai.setJenis(in.nextLine());
		System.out.print("Panjang Bingkai     : ");
		bingkai.setPanjang(in.nextDouble());
		System.out.print("Lebar Bingkai       : ");
		bingkai.setLebar(in.nextDouble());
		in.nextLine();
	}
}