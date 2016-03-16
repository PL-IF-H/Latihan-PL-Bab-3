package bingkai;

public class KelasBingkai {

    private String idPemesan;
    private String namaPemesan;
    private String tanggalPemesanan;
    private int jenisBingkai;
    private double panjangBingkai;
    private double lebarBingkai;
    private double harga;
    private double bayar;
    private double diskon;
    private double luasBingkai;
    private boolean dapetDiskon;

    public void setLuas() {
        this.luasBingkai = this.panjangBingkai * this.lebarBingkai;
    }

    public String getIdPemesan() {
        return idPemesan;
    }

    public void setIdPemesan(String idPemesan) {
        this.idPemesan = idPemesan;
    }

    public String getNamaPemesan() {
        return namaPemesan;
    }

    public void setNamaPemesan(String namaPemesan) {
        this.namaPemesan = namaPemesan;
    }

    public String getTanggalPemesanan() {
        return tanggalPemesanan;
    }

    public void setTanggalPemesanan(String tanggalPemesanan) {
        this.tanggalPemesanan = tanggalPemesanan;
    }

    public int getJenisBingkai() {
        return jenisBingkai;
    }

    public void setJenisBingkai(int jenisBingkai) {
        this.jenisBingkai = jenisBingkai;
    }

    public double getPanjangBingkai() {
        return panjangBingkai;
    }

    public void setPanjangBingkai(int panjangBingkai) {
        this.panjangBingkai = panjangBingkai;
    }

    public double getLebarBingkai() {
        return lebarBingkai;
    }

    public void setLebarBingkai(int lebarBingkai) {
        this.lebarBingkai = lebarBingkai;
    }

    public double getDiskon() {
        return diskon;
    }

    public double getHarga() {
        return harga;
    }

    public double getBayar() {
        return bayar;
    }

    public boolean getDapetDiskon() {
        return dapetDiskon;
    }

    public void cekHarga() {
        switch (this.jenisBingkai) {
            case 1: //"Hitam Metalik":
                this.harga = 3000;
                break;
            case 2://"Coklat Metalik":
                this.harga = 2700;
                break;
            case 3://"Coklat Bercorak":
                this.harga = 2300;
                break;
            case 4://"Hitam Bercorak":
                this.harga = 2500;
                break;
            case 5://"Emas":
                this.harga = 5000;
                break;
            case 6://"Perak":
                this.harga = 4000;
                break;

        }
    }

    public void diskon() {
        if (!dapetDiskon) {
            this.diskon=0;
        } else if (this.bayar > 600000) {
            this.diskon = this.bayar * 0.15;
        } else if (this.harga > 450000) {
            this.diskon = this.bayar * 0.1;
        } else if (this.harga > 300000) {
            this.diskon = this.bayar * 0.05;
        } else {
            this.diskon = 0;
        }
    }

    public void bayar() {
        this.bayar = this.harga * this.luasBingkai;
    }

    public void dapetDiskon() {
        if (jenisBingkai==1) {
            this.dapetDiskon = true;
        } else if (jenisBingkai==5) {
            this.dapetDiskon = true;
        } else if (jenisBingkai==6) {
            this.dapetDiskon = true;
        } else {
            this.dapetDiskon = false;
        }

    }
}
