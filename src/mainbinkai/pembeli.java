
package mainbinkai;

public class pembeli {
    final String nama, tanggal;
    final int id;
    
    public pembeli(String nama, String tanggal, int id ){
    this.nama=nama;
    this.tanggal=tanggal;
    this.id=id;
    }
            
    void display(){
        System.out.println("=======================================");
        System.out.println("Nama            : "+nama);
        System.out.println("Tanggal         : "+tanggal);
    }
    
    
    
}
