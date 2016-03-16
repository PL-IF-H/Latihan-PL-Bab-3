package bingkai;

public class lukisan {

    private int panjang, lebar;//Atribut
    private String jenis;//Atribbut
    private int luas;//Atribut
    private double harga;//Atribut

    public void setpanjang(int panjang) {//Behavior
        this.panjang = panjang;

    }

    public int getpanjang() {//Behavior
        return panjang;
    }

    public void setlebar(int lebar) {//Behavior
        this.lebar = lebar;
    }

    public int getlebar() {//Behavior
        return lebar;
    }

    public void setjenis(String jenis) {//Behavior
        this.jenis = jenis;
    }

    public String getjenis() {//Behavior
        return jenis;
    }

    public int getluas() {//Behavior
        luas = panjang * lebar;
        return luas;
    }
    public void diskon(){//Behavior
            if (harga <= 300000) {
                harga = harga;
            } else if (harga <= 450000) {
                harga = harga - (harga * 0.05);
            } else if (harga <= 600000) {
                harga = harga - (harga * 0.1);
            } else {
                harga = harga - (harga * 0.15);
            }
    }
    
    public void diskon(int harga){//Behavior
        this.harga = luas * harga;
    }

    public double harga() {//Behavior
        if (jenis.equals("Hitam Metalik") ) {
            harga = luas * 3000;
            diskon();
        } else if (jenis.equals("Coklat Metalik")) {
            diskon(2700);
        }else if (jenis.equals("Cokalt Bercorak") ){
            diskon(2300);
        }else if(jenis.equals("Hitam Bercorak ") ){
            diskon(2500);
        } else if (jenis.equals("Emas") ){
            harga = luas*5000;
            diskon();
        }else if (jenis.equals("Coklat")){
            harga = luas*4000;
            diskon();
        }
    return harga;
}
}
