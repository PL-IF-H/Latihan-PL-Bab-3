package Tugas;
public class Pemesanan {
	String ID, nama, tanggal, jenis;
	int panjang, lebar;
    	public Pemesanan (String id, String nm, String tgl){
        ID = id;
        nama = nm;
        tanggal = tgl;
    	}
	public Pemesanan(int p, int l){
        panjang = p;
        lebar = l;
    	}
	public void dataPemesanan (String id, String name, String tgl){
        ID = id;
        nama = name;
        tanggal = tgl;
    	}
    	public void dataPemesanan(int p, int l){
        panjang = p;
        lebar = l;
    	}
    	public int hitungUkuran(){
        return panjang * lebar;
    	}
}