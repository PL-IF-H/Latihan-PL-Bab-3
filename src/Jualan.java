public class Jualan{
	
	private static String id, nama;
	private static double tanggal;

	public String getNama(){
		return nama;
	}

	public String getID(){
		return id;
	}

	public double getTanggal(){
		return tanggal;
	}
//overload method
	public static void Biodata(String i, String n){
		id = i;
		nama = n;
	}
//overload method
	public static void Biodata(double t){
		tanggal = t;
	}	

	public void DisplayM(){
		System.out.println("ID\t: "+id);
		System.out.println("Nama\t: "+nama);
		System.out.println("Tanggal\t: "+tanggal);
	}

}