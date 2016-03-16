
package pemesanan;


public class pelanggan {
    private String nama, id, tanggal;
    
    public pelanggan(String nama, String id, String tanggal){
    this.nama=nama;
    this.id=id;
    this.tanggal=tanggal;
   
    }
    public void displayMessage(){
        System.out.println("nama    : "+this.nama);
        System.out.println("id      : "+this.id);
        System.out.println("tanggal : "+this.tanggal);
    }
}
