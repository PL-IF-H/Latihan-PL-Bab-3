package jenisbingkai;

public class JenisBingkai {

    private double sizep, sizel, luasbingkai;
//overload

    public JenisBingkai() {
        this.sizep = 0;
        this.sizel = 0;
    }

    public JenisBingkai(double sizep, double sizel) {
        this.sizep = sizep;
        this.sizel = sizel;
    }

    public double luasbingkai(double sizep, double sizel) {
        double luasbingkai = sizep * sizel;
        return luasbingkai;
    }

    public double diskon(double harga) {

        double diskonnya=0;
        if (harga > 300000) {
            diskonnya = harga * (0.05);
        } else if (harga > 450000) {
            diskonnya = harga * (0.1);
        } else if (harga > 600000) {
            diskonnya = harga * (0.15);
        }
        return diskonnya;
    }
}
