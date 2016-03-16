import java.util.Scanner;
public class iniBingkai{
	Scanner masukan = new Scanner(System.in);
	private final String jBingkai[] = {"Hitam Metalik", "Coklat Metalik", "Coklat Bercorak", "Hitam Bercorak","Emas","Perak"};
	private int hBingkai[] = {3000, 2700, 2300, 2500, 5000, 4000};
	private String nama, id, tgl;
	private int luas, pilihan;
	private double Jml, Total=0;

public void inputData(String id, String nama){ // overload
	this.id = id;
	this.nama = nama;
}
public void inputData(String tgl){	//overload
	this.tgl = tgl;
}

public void luasBingkai(int p, int l){
	luas = p*l;
}

public void keluarBingkai(){
	for (int a = 0; a<jBingkai.length; a++){
		System.out.println((a+1)+" "+jBingkai[a]);
	}
	System.out.print("Pilihan : ");
	pilihan = masukan.nextInt();
}
public void hitungJml(){
	Jml=luas*hBingkai[pilihan-1];
}

public void hitungTotal(){
	if (pilihan==1 || pilihan==5 || pilihan==6){
		if (Jml>600000){
			Total += (Jml*0.85);
		}
		else if (Jml>450000){
			Total += (Jml*0.90);
		}
		else if (Jml>300000){
			Total += (Jml*0.95);
		}
		else {Total += Jml;}
	} else {Total += Jml;}
}

public double gethitungTotal(){
	return Total;
}
public void displayData(){
	System.out.println("===================================");
	System.out.println(tgl);
	System.out.println("|ID| "+"\t"+"Nama"+"\t |"+"Total Harga|");
	System.out.println("|"+id+"| "+"\t"+nama+"\t |"+Total+"|");
	System.out.println("===================================");
}
}