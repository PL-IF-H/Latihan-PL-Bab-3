import java.util.Scanner;
public class mainBingkai{
	public static void main (String [] args){
		Scanner masukan = new Scanner(System.in);
		int p, l;
		int pilihan;
		String id, nama, tgl;
		iniBingkai bingkai = new iniBingkai();
		System.out.print("ID pemesan : ");
		id = masukan.nextLine();
		System.out.print("Nama : ");
		nama = masukan.nextLine();
		System.out.print("Tanggal : ");
		tgl = masukan.nextLine();
		bingkai.inputData(id, nama);
		bingkai.inputData(tgl);
		bingkai.keluarBingkai();
		System.out.print("Panjang : ");
		p = masukan.nextInt();
		System.out.print("Lebar : ");
		l = masukan.nextInt();
		bingkai.luasBingkai(p, l);