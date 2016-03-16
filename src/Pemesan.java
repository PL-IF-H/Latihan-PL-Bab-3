public class Pemesan{
	private String namaPemesan, alamatPemesan, tanggalPesan;
	Bingkai x = new Bingkai();
	
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