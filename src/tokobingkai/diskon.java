package tokobingkai;
public class diskon {
    private double harga;
    private double diskon;
    
    public static double diskonBingkai(double harga,double diskon){
        double total = 0;
        if (harga >= 300000 && harga < 450000) {
            diskon = 0.95;
            total = harga * diskon;
        }
        else if (harga >= 450000 && harga <600000){
            diskon = 0.9;
            total = harga * diskon;
        }
        else if (harga >= 600000){
            diskon = 0.85;
            total = harga * diskon;
        }
        return total;
    }
}
