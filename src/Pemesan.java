/*identifikasi
class   : Pemesan
atribut : id, nama pemesan, alamat pemesan, tanggal pemesanan
behavior: setNama, setAlamat, setTanggal
objek   : pemesan 1, pemesan 2,...
*/
public class Pemesan{
	private String idPemesan, namaPemesan, alamatPemesan, tanggalPesan;
	
	//default constructor
	public Pemesan(){
		namaPemesan = "";
		alamatPemesan = "";
		tanggalPesan = "";
	}
	//overloading constructor
	public Pemesan(String id, String n, String a, String t){
		idPemesan = id;
		namaPemesan = n;
		alamatPemesan = a;
		tanggalPesan = t;
	}
	public void setNama(String n){
		namaPemesan = n;
	}
	public void setAlamat(String a){
		alamatPemesan = a;
	}
	public void setTanggal(String t){
		tanggalPesan = t;
	}
	public void displayPemesan(){
		System.out.println("====================");
		System.out.println("Data Pesanan");
		System.out.println("ID              : "+idPemesan);
		System.out.println("Nama            : "+namaPemesan);
		System.out.println("Alamat          : "+alamatPemesan);
		System.out.println("Tanggal Pesan   : "+tanggalPesan);
	}
}