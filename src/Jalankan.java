import java.util.Scanner;
public class Jalankan{
	public static void main(String[] args){
		String nama, id;
		double tanggal;
		Scanner in = new Scanner (System.in);
		Scanner in2 = new Scanner (System.in);
		System.out.println("--------------------------------------------");
		System.out.println("           Toko Bingkai Bang Adit");
		System.out.println("--------------------------------------------");
		Jualan b = new Jualan();
		System.out.print("Masukkan nomor ID \t\t: ");
		id = in.next();
		System.out.print("Masukkan Nama Anda \t\t: ");
		nama = in2.nextLine();
		b.Biodata(id,nama);
		System.out.print("Masukkan tanggal pemesanan \t: ");
		tanggal = in.nextDouble();
		b.Biodata(tanggal);
		System.out.println("--------------------------------------------");
		System.out.println("------------------- MENU -------------------");
		Kerja lagi = new Kerja();
		lagi.Menu();
		System.out.println("--------------------------------------------");
		lagi.Proses();
		System.out.println("--------------------------------------------");
		System.out.println("                  Tagihan");
		b.DisplayM();
		lagi.Tampil();
		System.out.println("--------------------------------------------");
	}
}