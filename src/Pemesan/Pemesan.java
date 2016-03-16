
package Pemesan;
public class Pemesan {
    String id, nama, tanggal, jenis;
    int panjang, lebar;
    
    public void setPemesan (String id, String nama, String tanggal){
        id = id;
        nama = nama;
        tanggal = tanggal;

    }
    public void displayPemesan(String nama, String tanggal){
        System.out.println("Pemesan             : "+nama);
        System.out.println("Tanggal             : "+tanggal);
    }
}
