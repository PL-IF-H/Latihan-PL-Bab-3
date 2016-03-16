import java.util.Scanner;
public class Kerja{
	Scanner in = new Scanner (System.in);
	int pesan, q, harga, p,l;
	double sum=0;
	double diskon;
	String data [][] = 	{{"No.","Jenis Bingkai","Harga per m"},
						 {"1","Hitam Metalik","3000"},
						 {"2","Coklat Metalik","2700"},
						 {"3","Coklat Bercorak","2300"},
						 {"4","Hitam Bercorak","2500"},
						 {"5","Emas","5000"},
						 {"6","Perak","4000"}};

	public void Menu(){
		for (int i=0;i<data.length;i++) {
			System.out.printf("| %-3s | %-15s | %-12s |\n",data[i][0],data[i][1],data[i][2]);
		}
		System.out.println("7 untuk keluar");
	}
}