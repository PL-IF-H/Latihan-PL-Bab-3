public class Pemesan{
	private String namaPemesan, alamatPemesan, tanggalPesan;
	
	//default constructor
	public Pemesan(){
		
	}
	//overloading constructor
	public Pemesan(String n, String a, String t){
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
	public String getNama(){
		return namaPemesan;
	}
	public String getAlamat(){
		return alamatPemesan;
	}
}