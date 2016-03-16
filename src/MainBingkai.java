/*identifikasi
class   : MainBingkai
atribut : nama, alamat, tanggal, jenis, panjang, lebar
behavior: 
objek   : pemesan1, bingkai1
*/
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
		Pemesan pemesan1 = new Pemesan(nama, alamat, tanggal);
		System.out.println("\nDaftar Jenis Bingkai : ");
		System.out.println("Jenis Bingkai\t\tHarga per m2");
		System.out.println(Bingkai.displayBingkai());
		System.out.println(Bingkai.displayDiskon());
		
		System.out.print("Pilih Jenis Bingkai : ");
		jenis = in.nextLine();
		System.out.print("Panjang Bingkai (m) : ");
		panjang = in.nextDouble();
		System.out.print("Lebar Bingkai (m)   : ");
		lebar = in.nextDouble();
		Bingkai bingkai1 = new Bingkai(panjang, lebar, jenis);
		in.nextLine();
		bingkai1.hitungTotal();
		pemesan1.displayPemesan();
		bingkai1.displayData();
	}
}