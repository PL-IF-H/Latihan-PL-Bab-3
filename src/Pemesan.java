public class Pemesan {

	public String id, nama, tanggal;
	
	public void Pemesan(String Id, String Nama, String Tanggal) {
		id = Id;
		nama = Nama;
		tanggal = Tanggal;
	}
	
	public void displayData() {
		System.out.print(id+ "\t" + nama + "\t\t" + tanggal + "\t");
	}
}