package tugasbab3;

public class User {

    private String nama, tanggal;
    private int id, panjang, lebar, luas, harga, a;

    public void Pemesan(int id, String nama, String tanggal) {
        this.id = id;
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public void Display() {
        System.out.println("Pilihan : ");
        System.out.println("1. Hitam Metalik    3000/m");
        System.out.println("2. Coklat Metalik   2700/m");
        System.out.println("3. Coklat Bercorak  2300/m");
        System.out.println("4. Hitam Bercorak   2500/m");
        System.out.println("5. Emas             5000/m");
        System.out.println("6. Perak            4000/m");
    }

    public void setSisi1(int panjang) {
        this.panjang = panjang;
    }

    public void setSisi2(int lebar) {
        this.lebar = lebar;
    }

    public int luas() {
        setSisi1(panjang);
        setSisi2(lebar);
        luas = panjang * lebar;
        return luas;
    }

    public void jenisFrame(int a) {
        luas();
        if (a == 1) {
            harga = luas * 3000;
        } else if (a == 2) {
            harga = luas * 2700;
        } else if (a == 3) {
            harga = luas * 2300;
        } else if (a == 4) {
            harga = luas * 2500;
        } else if (a == 5) {
            harga = luas * 5000;
        } else if (a == 6) {
            harga = luas * 4000;
        }
    }

    public int setDiskon() {
        jenisFrame(a);
        if (harga >= 300000 && harga < 450000) {
            harga *= 0.95;
        } else if (harga >= 450000 && harga < 600000) {
            harga *= 0.9;
        } else if (harga >= 600000) {
            harga *= 0.85;
        }
        return harga;
    }
    public int harga(){
        setDiskon();
        return harga;
    }

}
