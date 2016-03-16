
package pemesanan;


public class Harga {
    private int lebar, panjang, luas,harga;
   private int jenis[] = {3000,2700,2300,2500,5000,4000};
    public  void Harga (int lebar, int panjang){
    this.lebar = lebar;
    this.panjang = panjang;
    }
    public int getLuas(){
    return this.lebar*this.panjang;}
    
    public void Harga(int jenis){
    this.harga = getLuas()*this.jenis[jenis-1] ;
    }
     public int totalHarga(){
     return this.harga;
     }
     public void displayMessage(){
         System.out.println("panjang    : "+this.panjang);
         System.out.println("lebar      : "+this.lebar);
         System.out.println("harga awal : "+totalHarga());
     }
}
