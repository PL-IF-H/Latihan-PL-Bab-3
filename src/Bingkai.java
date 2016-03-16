public class Bingkai{
	private double panjang, lebar;
	private String jenis;
	public static String jenisBingkai = "1. Hitam Metalik\n"+"2. Coklat Metalik\n"+"3. Coklat Bercorak\n"+"4. Hitam Bercorak\n"+"5. Emas\n"+"6. Perak\n";
	private double[] hargaPerM = {3000, 2700, 2300, 2500, 5000, 4000};
	private double harga, total, diskon;
	
	//default constructor
	public Bingkai(){
		panjang = 0;
		lebar = 0;
		jenis = "";
	}
	//overloading constructor
	public Bingkai(double p, double l, String j){
		panjang = p;
		lebar = l;
		jenis = j;
	}
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
	public static String displayBingkai(){
		return jenisBingkai;
	}
	public void hitungDiskon(){
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
	}
	public double getDiskon(){
		return diskon;
	}
	//overloading method
	public void hitungHarga(double p, double l, double diskon){
		
		
		
		
	}
}