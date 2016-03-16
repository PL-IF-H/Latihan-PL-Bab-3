public class Bingkai{
	private double panjang, lebar;
	private String jenis;
	private String jenisBingkai = "1. Hitam Metalik\n"+"2. Coklat Metalik\n"+"3. Coklat Bercorak\n"+"4. Hitam Bercorak\n"+"5. Emas\n"+"6. Perak\n";
	private int[] hargaPerM = {3000, 2700, 2300, 2500, 5000, 4000};
	
	public void setJenis(String j){
		jenis = j;
	}
	public void setPanjang(double p){
		panjang = p;
	}
	public void setLebar(double l){
		lebar = l;
	}
	public String displayBingkai(){
		return jenisBingkai;
	}
}