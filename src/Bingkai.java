public class Bingkai {

	public int panjang, lebar, jenis, harga, diskon;
	
	//overloading constructor
	public void Bingkai(int jenis) {
		this.jenis = jenis;
	}
	//overloading constructor
	public void Bingkai(int panjang,int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public void ukuran() {
		luas = panjang * lebar;
	}
	
	public void harga(int jenis) {
		switch(jenis) {
			case 1:
				harga = luas * 3000;
				break;
			case 2:
				harga = luas * 2700;
				break;
			case 3:
				harga = luas * 2300;
				break;
			case 4:
				harga = luas * 2500;
				break;
			case 5:
				harga = luas * 5000;
				break;
			case 6:
				harga = luas * 4000;
				break;
			default:
				break;
		}
	}
	
	public void Diskon(int jenis) {
		switch(jenis) {
			case 1: case 5: case 6:
				if(harga > 300000) {
					diskon = harga * 0.05;
				} else if(harga > 450000) {
					diskon = harga * 0.10;
				} else if(harga * 600000) {
					diskon = harga * 0.15;
				}
				break;
			default:
				break
		}
	}
}