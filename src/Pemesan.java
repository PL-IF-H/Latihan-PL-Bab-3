public class Pemesan{
	private String namaPemesan, alamatPemesan;
	private double pjgPesanan, lbrPesanan;
	
	public Pemesan(String nama, String alamat){
		namaPemesan = nama;
		alamatPemesan = alamat;
	}
	public void setPanjang(double panjang){
		pjgPesanan = panjang;
	}
	public void setLebar(double lebar){
		lbrPesanan = lebar;
	}
	public String getNama(){
		return namaPemesan;
	}
	public String getAlamat(){
		return alamatPemesan;
	}
	public double getPanjang(){
		return pjgPesanan;
	}
	public double getLebar(){
		return lbrPesanan;
	}
}