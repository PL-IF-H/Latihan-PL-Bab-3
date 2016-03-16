package tokobingkai;
public class pesanBingkai {
    private int jenis, panjang, lebar, luas;
    String daftarBingkai[][] ={{"No.","Jenis Bingkai","Harga per m","Diskon"},
                               {"1","Hitam Metalik","3000","Ya"}, 
                               {"2","Coklat Metalik","2700","Tidak"},
                               {"3","Coklat Bercorak","2300","Tidak"},
                               {"4","Hitam Bercorak","2500","Tidak"},
                               {"5","Emas","5000","Ya"},  
                               {"6","Perak","4000","Ya"}};
    
    public void displayDaftar(){
        System.out.println("===================================================");
        System.out.printf("| %-3s | %-17s | %-11s | %-7s |\n",daftarBingkai[0][0],daftarBingkai[0][1],daftarBingkai[0][2],daftarBingkai[0][3]);
        for (int i = 1; i < daftarBingkai.length; i++) {
            System.out.printf("| %-3s | %-17s | %-11s | %-7s |\n",daftarBingkai[i][0],daftarBingkai[i][1],daftarBingkai[i][2],daftarBingkai[i][3]);
        }
        System.out.println("===================================================");
    }
    public pesanBingkai(){ //Overloading Constructor
        jenis = 0;
        panjang = 0;
        lebar = 0;
    }
    public pesanBingkai(int j,int p,int l){ //Overloading Constructor
        jenis = j;
        panjang = p;
        lebar = l;
    }
    
    public void setJenis(int jenis){
        this.jenis = jenis;
    }
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public static double luasdanharga_Bingkai(double panjang,double lebar){ //Overloading Method
        double luas = panjang*lebar;
        return luas;
    }
    public static int luasdanharga_Bingkai(int luas,int harga){ //Overloading Method
        int total = luas*harga;
        return total;
    }
    
}