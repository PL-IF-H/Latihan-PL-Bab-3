package tugas;

public class Bingkai {
    int ukuranbingkai;
    int panjang, lebar;
    int luas, total;
    
    MainProgram baru = new MainProgram();
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
   public int hitungluas(int panjang, int lebar){ //method overload
        luas = 2 * (panjang + lebar);
        return luas;
    }
    public int hitungluas(){ //method overload
        luas = 2 * (panjang + lebar);
        return luas;
    }
    }
   
