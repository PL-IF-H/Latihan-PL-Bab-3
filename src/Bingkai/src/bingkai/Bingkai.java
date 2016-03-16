package bingkai;
public class Bingkai {
    String nama, jenis, tanggal;        
    int id;
    double panjang, lebar, ukuran, harga;
      
    void setNama(String nm){
        this.nama = nm;
    }
    void setJenis(String jenis){
        this.jenis = jenis;
        if(jenis.equals("Hitam metalik")){
           harga = ukuran*3000;
        }else if(jenis.equals("Coklat metalik")){
            harga=ukuran*2700;
        }else if(jenis.equals("Coklat bercorak")){
            harga=ukuran*2300;
        }else if(jenis.equals("Hitam bercorak")){
            harga=ukuran*2500;
        }else if(jenis.equals("Emas")){
            harga=ukuran*5000;
        }else if(jenis.equals("Perak")){
            harga=ukuran*4000;
        }else{
            System.out.println("");
            System.out.println("Jenis bingkai tidak ditemukan");
        }
    }
    void setTanggal(String tgl){
        this.tanggal = tgl;
    }
    void setID(int ID){
        this.id = ID;
    }
    void setPanjang(double pjg){
        this.panjang = pjg;
    }
    void setLebar(double lbr){
        this.panjang = lbr;
    }
    double setUkuran(double pjg, double lbr){
        this.panjang = pjg;
        this.lebar = lbr;
        ukuran = pjg*lbr;
        return ukuran;
    }
    void showData(){
        System.out.println("==========DATA PEMESAN==========");
        System.out.println("ID pesan    : "+id);
        System.out.println("Nama        : "+nama);
        System.out.println("Tgl pesan   : "+tanggal);
        System.out.println("Jenis       : "+jenis);
        System.out.println("Harga       : "+harga);
    }
}
    
