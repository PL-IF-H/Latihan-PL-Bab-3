package javaapplication11;

public class Pemesanan {
    private String ID,Nama,Tanggal,Jenis;
    private double Harga;
    private double Bayar;
    private static double jumlaObjek;
    public void setID(String id){
        ID=id;
    }
    public void setNama(String nama){
        Nama=nama;
    }
    public void setTanggal (String tanggal){
        Tanggal=tanggal;
    }
    public void setJenis(String jenis){
        if (jenis.equals("Hitam Metalik"))
            this.Harga=3000;
        else if (jenis.equals("Coklat Metalik"))
            this.Harga=2700;
        else if (jenis.equals("Coklat Bercorak"))
            this.Harga=2300;
        else if (jenis.equals("Hitam Bercorak"))
            this.Harga=2500;
        else if (jenis.equals("Emas"))
            this.Harga=5000;
        else if (jenis.equals("Perak"))
            this.Harga=4000;
    }
    
    public double cekDiskon(double bayar){
        double result=0;    
        if (bayar >= 300000)
                result=bayar-(bayar*5/100);
            else if (Bayar >= 450000)
                result=bayar-(bayar*10/100);
            else if (bayar >= 600000)
                result=bayar-(bayar*15/100);
            else
                result=bayar;
        return result;
    }
    
    public double cekDiskon(){
       return Bayar;
    }
    public double getHarga(Bingkai inBingkai){
        Bayar= (this.Harga*inBingkai.getLuas());
        if (Harga==3000 || Harga==5000 || Harga==4000){
            Harga = cekDiskon(Bayar);
        }
        else
            Harga = cekDiskon();
        return Harga;
    }
}
