public class Bingkai{
	private double panjang, lebar;
	private String jenis;
	private String jenisBingkai = "1. Hitam Metalik\n"+"2. Coklat Metalik\n"+"3. Coklat Bercorak\n"+"4. Hitam Bercorak\n"+"5. Emas\n"+"6. Perak\n";
	private double[] hargaPerM = {3000, 2700, 2300, 2500, 5000, 4000};
	private double harga, total, diskon;
	
	public void setJenis(String j){
		jenis = j;
	}
	public String getJenis(){
		return jenis;
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
	public double hitungDiskon(){
		if(jenis.equals("Hitam Metalik")||jenis.equals("Emas")||jenis.equals("Perak")){
			if(harga>300000){
				diskon = 0.5*harga;
			}
			else if(harga>450000){
				diskon = 0.1*harga;
			}
			else if(harga>600000){
				diskon = 1.5*harga;
			}
		}
		else{
			diskon = 0;
		}
		return diskon;
	}
}