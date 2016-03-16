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
	public double getLuas(){
		return panjang*lebar;
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
	public void hitungHarga(){
		if(jenis.equals("Hitam Metalik")){
			total = getLuas()*hargaPerM[0]-diskon;
		}
		else if(jenis.equals("Coklat Metalik")){
			total = getLuas()*hargaPerM[1];
		}
		else if(jenis.equals("Coklat Bercorak")){
			total = getLuas()*hargaPerM[2];
		}
		else if(jenis.equals("Hitam Bercorak")){
			total = getLuas()*hargaPerM[3];
		}
		else if(jenis.equals("Emas")){
			total = getLuas()*hargaPerM[4]-diskon;
		}
		else if(jenis.equals("Perak")){
			total = getLuas()*hargaPerM[5]-diskon;
		}
	}
	public void displayData(){
		System.out.println("Panjang Bingkai : "+panjang);
		System.out.println("Lebar Bingkai   : "+lebar);
		System.out.println("Luas Bingkai    : "+getLuas());
		System.out.println("Total Harga     : "+total);
	}
}