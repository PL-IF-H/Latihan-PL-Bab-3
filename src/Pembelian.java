package tugaspemlan3;
//* Nama : Darin Nadhifah
//* NIM : 155150207111063
//* Kelas : TIF-H
public class Pembelian {
    public Pembelian(){
    }
    int p,l;
    int jumlahPesanan, totalBayar, total=0, keliling=0;
    
    public int Keliling(int p, int l){
        keliling = 2*(p+l);
        return keliling;
    }
    public int Diskon(){
        totalBayar=total;
        if(totalBayar>300000 && totalBayar<=450000){
            total=totalBayar-(totalBayar*5/100);
        } 
        else if(totalBayar>450000 && totalBayar<=600000){
            total=totalBayar-(totalBayar*10/100);
        }
        else {
            total=totalBayar-(totalBayar*15/100);
        } 
        return total;
    }
    public int Hitung(int p, int l,int a){
       total = keliling * a;
       return total;
       
    }
    public int getTotal(){
        return total;
    }
}
