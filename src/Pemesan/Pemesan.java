
package Pemesan;
public class Pemesan {
    String id, nama, tanggal, jenis;//fields
    int panjang, lebar;//fields
    
    public void setPemesan (String id, String nama, String tanggal){ //method
        id = id;
        nama = nama;
        tanggal = tanggal;

    }
    public void displayPemesan(String nama, String tanggal){ //method
        System.out.println("Pemesan             : "+nama);
        System.out.println("Tanggal             : "+tanggal);
    }
}
