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
	
	public void Proses(){
		do{
			System.out.print("Masukkan pilihan menu : ");
			pesan = in.nextInt(); 
			switch (pesan){
				case 1 : 
					System.out.println("Anda akan memesan bingkai Hitam Metalik");
					System.out.println("Masukkan pesanan anda");
					System.out.print("Panjang\t : ");
					p = in.nextInt();
					System.out.print("Lebar\t : ");
					l = in.nextInt();
					harga = (p*l)*3000;
					if (harga>300000){
						diskon = (int)(harga*5)/100;
						harga -= diskon;
					}else if(harga>450000){
						diskon = (int)(harga*10)/100;
						harga -= diskon;
					}else if(harga>600000){
						diskon = (int)(harga*15)/100;
						harga -= diskon;
					}
					System.out.println("Apakah anda ingin membeli yang lainnya?(1. yes 2. no)");
            			q = in.nextInt();
            		if (q == 1) {
                		break;
            		}continue;
				case 2 :
					System.out.println("Anda akan memesan bingkai Coklat Metalik");
					System.out.println("Masukkan pesanan anda");
					System.out.print("Panjang\t : ");
					p = in.nextInt();
					System.out.print("Lebar\t : ");
					l = in.nextInt();
					harga = (p*l)*2700;
					System.out.println("Apakah anda ingin membeli yang lainnya?(1. yes 2. no)");
            			q = in.nextInt();
            		if (q == 1) {
                		break;
            		}continue;
				case 3 :
					System.out.println("Anda akan memesan bingkai Coklat Bercorak");
					System.out.println("Masukkan pesanan anda");
					System.out.print("Panjang\t : ");
					p = in.nextInt();
					System.out.print("Lebar\t : ");
					l = in.nextInt();
					harga = (p*l)*2300;
					System.out.println("Apakah anda ingin membeli yang lainnya?(1. yes 2. no)");
            			q = in.nextInt();
            		if (q == 1) {
                		break;
            		}continue;
				case 4 :
					System.out.println("Anda akan memesan bingkai Hitam Bercorak");
					System.out.println("Masukkan pesanan anda");
					System.out.print("Panjang\t : ");
					p = in.nextInt();
					System.out.print("Lebar\t : ");
					l = in.nextInt();
					harga = (p*l)*2500;
					System.out.println("Apakah anda ingin membeli yang lainnya?(1. yes 2. no)");
            			q = in.nextInt();
            		if (q == 1) {
                		break;
            		}continue;
				case 5 :
					System.out.println("Anda akan memesan bingkai Emas");
					System.out.println("Masukkan pesanan anda");
					System.out.print("Panjang\t : ");
					p = in.nextInt();
					System.out.print("Lebar\t : ");
					l = in.nextInt();
					harga = (p*l)*5000;
					if (harga>300000){
						diskon = (int)(harga*5)/100;
						harga -= diskon;
					}else if(harga>450000){
						diskon = (int)(harga*10)/100;
						harga -= diskon;
					}else if(harga>600000){
						diskon = (int)(harga*15)/100;
						harga -= diskon;
					}
					System.out.println("Apakah anda ingin membeli yang lainnya?(1. yes 2. no)");
            			q = in.nextInt();
            		if (q == 1) {
                		break;
            		}continue;
				case 6 :
					System.out.println("Anda akan memesan bingkai Perak");
					System.out.println("Masukkan pesanan anda");
					System.out.print("Panjang\t : ");
					p = in.nextInt();
					System.out.print("Lebar\t : ");
					l = in.nextInt();
					harga = (p*l)*4000;
					if (harga>300000){
						diskon = (int)(harga*5)/100;
						harga -= diskon;
					}else if(harga>450000){
						diskon = (int)(harga*10)/100;
						harga -= diskon;
					}else if(harga>600000){
						diskon = (int)(harga*15)/100;
						harga -= diskon;
					}
					System.out.println("Apakah anda ingin membeli yang lainnya?(1. yes 2. no)");
            			q = in.nextInt();
            		if (q == 1) {
                		break;
            		}continue;
			}
			sum += harga;
		}while(pesan<7);
	}

	public void Tampil(){
		System.out.printf("Total harga Rp. %.0f,00\n",sum);
	}
}