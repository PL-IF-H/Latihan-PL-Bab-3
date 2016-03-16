import java.util.Scanner;
public class iniBingkai{
	Scanner masukan = new Scanner(System.in);
	private final String jBingkai[] = {"Hitam Metalik", "Coklat Metalik", "Coklat Bercorak", "Hitam Bercorak","Emas","Perak"};
	private int hBingkai[] = {3000, 2700, 2300, 2500, 5000, 4000};
	private String nama, id, tgl;
	private int luas, pilihan;
	private double Jml, Total=0;