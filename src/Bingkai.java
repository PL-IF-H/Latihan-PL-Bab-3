public class Bingkai {

	public int panjang, lebar, luas, jenis, harga;
	public double diskon;
	
	//overloading constructor
	public void Bingkai(int jenis) {
		this.jenis = jenis;
	}
	//overloading constructor
	public void Bingkai(int panjang, int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public void ukuran() {
		luas = panjang * lebar;
	}
	
	public void harga(int jenis) {
		if (jenis == 1)
			harga = luas * 3000;
		else if (jenis == 2)
			harga = luas * 2700;
		else if (jenis == 3)
			harga = luas * 2300;
		else if (jenis == 4)
			harga = luas * 2500;
		else if (jenis == 5)
			harga = luas * 3000;
		else if (jenis == 6)
			harga = luas * 4000;
	}
	
	public void diskon(int jenis) {
		if (jenis == 1 || jenis == 5 || jenis == 6) {
				if(harga > 300000) {
					diskon = harga * 0.05;
				} else if(harga > 450000) {
					diskon = harga * 0.10;
				} else if(harga > 600000) {
					diskon = harga * 0.15;
				}
		}
	}
	
	public void displayData() {
		System.out.print("\t" +jenis+ "\t" +harga+ "\t" +diskon+ "\t\t| " + (double)(harga - diskon) + "\n");
	}
}