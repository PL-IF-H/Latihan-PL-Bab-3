public class Bingkai {

	private int panjang, lebar, jenis;
	
	//overloading constructor
	public void Bingkai(int jenis) {
		this.jenis = jenis;
	}
	//overloading constructor
	public void Bingkai(int panjang,int lebar) {
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public void ukuranBingkai() {
		luas = panjang * lebar;
	}
}