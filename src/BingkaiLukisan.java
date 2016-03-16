package Soal_GitHub;
public class BingkaiLukisan {
    int UkuranBingkai;
    int panjang, lebar;
    int luas, total;
    
    MainBingkai baru = new MainBingkai();
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar (int lebar){
        this.lebar = lebar;
    }
    public void getPanjang(int panjang){
        this.panjang = panjang;
    }
    public void getLebar(int lebar){
        this.lebar = lebar;
    }
    public int hitungluas(){
        luas = 2*(panjang+lebar);
        return luas;
    }
}
