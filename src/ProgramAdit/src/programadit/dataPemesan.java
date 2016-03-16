package programadit;

public class dataPemesan {

    private String nama, tanggal, jenis;
    private double panjang, lebar, luas, harga;
    private int id;

    public void data(int id) {
        this.id = id;
    }

    public void data(String nama, String tanggal) {
        this.nama = nama;
        this.tanggal = tanggal;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLuas() {
        setPanjang(panjang);
        setLebar(lebar);
        luas = panjang * lebar;
        return luas;
    }

    public void setJenis(String jenis) {
        getLuas();
        if ("hitam metalik".equalsIgnoreCase(jenis)) {
            harga = luas * 3000;
        } else if ("coklat metalik".equalsIgnoreCase(jenis)) {
            harga = luas * 2700;
        } else if ("coklat bercorak".equalsIgnoreCase(jenis)) {
            harga = luas * 2300;
        } else if ("hitam bercorak".equalsIgnoreCase(jenis)) {
            harga = luas * 2500;
        } else if ("emas".equalsIgnoreCase(jenis)) {
            harga = luas * 5000;
        } else if ("perak".equalsIgnoreCase(jenis)) {
            harga = luas * 4000;
        }
    }

    public void setDiskon() {
        setJenis(jenis);
        if (harga >= 300000 && harga < 450000) {
            harga *= 0.95;
        } else if (harga >= 450000 && harga < 600000) {
            harga *= 0.9;
        } else if (harga >= 600000) {
            harga *= 0.85;
        }

    }

    public double getHarga() {
        setDiskon();
        return harga;
    }

    public void pilihan() {
        System.out.println("Pilihan menu : "
                + "\n-Hitam Metalik\t\tRp3000/m"
                + "\n-Coklat Metalik\t\tRp2700/m"
                + "\n-Coklat Bercorak\tRp2300/m"
                + "\n-Hitam Bercorak\t\tRp2500/m"
                + "\n-Emas\t\t\tRp5000/m"
                + "\n-Perak\t\t\tRp4000/m");
    }
}
