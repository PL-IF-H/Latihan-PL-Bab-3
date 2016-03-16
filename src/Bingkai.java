package modul1bab3;

public class Bingkai {

    private int panjang, lebar, Harga;
    private int diskon;
    private final int[] harga = {3000, 2700, 2300, 2500, 5000, 4000};

    public void Bingkai(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return this.panjang;
    }

    public int getLebar() {
        return this.lebar;
    }

    public int Luas() {
        int luas = panjang * lebar;
        return luas;
    }
//overload method

    public void Jenis() {
        System.out.println("Pilihan Jenis");
        System.out.println("1. Hitam Metalik");
        System.out.println("2. Cokelat Metalik");
        System.out.println("3. Cokelat Bercorak");
        System.out.println("4. Hitam Bercorak");
        System.out.println("5. Emas");
        System.out.println("6. Perak");
    }
//overload method

    public void Jenis(int pilih) {
        switch (pilih) {
            case 1:
                Harga = harga[0];
            case 2:
                Harga = harga[1];
            case 3:
                Harga = harga[2];
            case 4:
                Harga = harga[3];
            case 5:
                Harga = harga[4];
            case 6:
                Harga = harga[5];
        }
    }

    public int Harga(int pilih) {
        switch (pilih) {
            case 1:
                Harga = harga[0] * Luas();
            case 2:
                Harga = harga[1] * Luas();
            case 3:
                Harga = harga[2] * Luas();
            case 4:
                Harga = harga[3] * Luas();
            case 5:
                Harga = harga[4] * Luas();
            case 6:
                Harga = harga[5] * Luas();
        }
        return this.Harga;
    }

    public double Diskon(int pilih) {
        double diskonku = 0;
        if (pilih == 1 || pilih == 5 || pilih == 6) {

            if (this.Harga > 300000) {
                diskonku = this.Harga * 0.05;
            } else if (this.Harga > 450000) {
                diskonku = this.Harga * 0.1;
            } else if (this.Harga > 600000) {
                diskonku = this.Harga * 0.15;
            } else {
                diskonku = 0;
            }
            return diskonku;
        } else {
            return diskonku;
        }
    }
}
