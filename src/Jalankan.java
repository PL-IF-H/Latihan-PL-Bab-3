import java.util.Scanner;
public class Jalankan{
	public static void main(String[] args){
		String nama, id;
		double tanggal;
		Scanner in = new Scanner (System.in);
		Scanner in2 = new Scanner (System.in);

		Jualan b = new Jualan();
		System.out.print("Masukkan nomor ID \t\t: ");
		id = in.next();
		System.out.print("Masukkan Nama Anda \t\t: ");
		nama = in2.nextLine();
		b.Biodata(id,nama);
		System.out.print("Masukkan tanggal pemesanan \t: ");
		tanggal = in.nextDouble();
		b.Biodata(tanggal);
		Kerja lagi = new Kerja();
		lagi.Menu();
		lagi.Proses();
}
}