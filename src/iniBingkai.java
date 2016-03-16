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
}