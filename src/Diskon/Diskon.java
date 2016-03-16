package Diskon;

import Bingkai.Bingkai;

public class Diskon {

    private int total_diskon;

    public void diskon(Bingkai a, int hasil) {
        if (a.hasil(hasil) > 300000 && (a.hasil(hasil)<450000)) {
            total_diskon = (int) (a.hasil(hasil) - (0.05 * a.hasil(hasil)));
                System.out.println("Harga setelah diskon 5%  : Rp. " + total_diskon);
        }else if (a.hasil(hasil)>450000 && a.hasil(hasil)<600000){
            total_diskon = (int) (a.hasil(hasil)-(0.1*a.hasil(hasil)));
                System.out.println("Harga setelah diskon 10% : Rp. " + total_diskon);
        }else if (a.hasil(hasil)>600000){
                    total_diskon = (int) (a.hasil(hasil)-(0.15*a.hasil(hasil)));
                        System.out.println("Harga setelah diskon 15% : Rp. " + total_diskon);
        }else
        total_diskon=a.hasil(hasil);

    }

}
