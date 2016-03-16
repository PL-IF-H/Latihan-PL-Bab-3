/*identifikasi
class   : Bingkai
atribut : panjang bingkai, lebar bingkai, jenis bingkai, harga per meter, harga, total, diskon
behavior: getLuas, displayBingkai, getHarga, getDiskon, hitungTotal, displayData
objek   : bingkai lukisan
*/
public class Bingkai{
	private double panjang, lebar;
	private String jenis;
	public static String jenisBingkai = "1. Hitam Metalik\tRp 3000\n"+"2. Coklat Metalik\tRp 2700\n"+"3. Coklat Bercorak\tRp 2300\n"+"4. Hitam Bercorak\tRp 2500\n"+"5. Emas\t\t\tRp 5000\n"+"6. Perak\t\tRp 4000\n";
	private double[] hargaPerM = {3000, 2700, 2300, 2500, 5000, 4000};
	private double harga, total, diskon;
	public static String nilaiDiskon = "Diskon 5% jika total harga > 300000\n"+"Diskon 10% jika total harga > 450000\n"+"Diskon 15% jika total harga > 600000\n";
	
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
	//overloading method
	public double getLuas(double p, double l){
		return p*l;
	}
	public static String displayBingkai(){
		return jenisBingkai;
	}
	public static String displayDiskon(){
		return nilaiDiskon;
	}
	public double getHarga(){
		if(jenis.equals("Hitam Metalik")){
			harga = getLuas()*hargaPerM[0];
		}
		else if(jenis.equals("Coklat Metalik")){
			harga = getLuas()*hargaPerM[1];
		}
		else if(jenis.equals("Coklat Bercorak")){
			harga = getLuas()*hargaPerM[2];
		}
		else if(jenis.equals("Hitam Bercorak")){
			harga = getLuas()*hargaPerM[3];
		}
		else if(jenis.equals("Emas")){
			harga = getLuas()*hargaPerM[4];
		}
		else if(jenis.equals("Perak")){
			harga = getLuas()*hargaPerM[5];
		}
		return harga;
	}
	public double getDiskon(){
		if(jenis.equals("Hitam Metalik")||jenis.equals("Emas")||jenis.equals("Perak")){
			if(getHarga()>600000){
				diskon = 0.15*harga;
			}
			else if(getHarga()>450000){
				diskon = 0.1*harga;
			}
			else if(getHarga()>300000){
				diskon = 0.05*harga;
			}
		}
		else{
			diskon = 0;
		}
		return diskon;
	}
	public void hitungTotal(){
		if(jenis.equals("Hitam Metalik")){
			total = getLuas()*hargaPerM[0]-getDiskon();
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
			total = getLuas()*hargaPerM[4]-getDiskon();
		}
		else if(jenis.equals("Perak")){
			total = getLuas()*hargaPerM[5]-getDiskon();
		}
	}
	public void displayData(){
		System.out.println("Luas Bingkai    : "+getLuas()+" m2");
		System.out.printf("%s%.1f\n", "Harga           : Rp ", getHarga());
		System.out.printf("%s%.1f\n", "Diskon          : Rp ", diskon);
		System.out.printf("%s%.1f\n", "Total Harga     : Rp ", total);
	}
}