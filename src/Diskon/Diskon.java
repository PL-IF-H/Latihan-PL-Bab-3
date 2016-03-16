package Diskon;

import Bingkai.Bingkai;


public class Diskon {
    private int total_diskon;
   public void diskon(Bingkai a){
    if (a.menentukan()>300000){
        total_diskon = (int) (a.menentukan()-(0.05*a.menentukan()));
        System.out.println("Harga setelah diskon 5% : "+total_diskon);
    }else if (a.menentukan()>450000){
        total_diskon = (int) (a.menentukan()-(0.1*a.menentukan()));
        System.out.println("Harga setelah diskon 10% : "+total_diskon);
    }else if (a.menentukan()>600000){
        total_diskon = (int) (a.menentukan()-(0.15*a.menentukan()));
        System.out.println("Harga setelah diskon 15% : "+total_diskon);
    }else{
        total_diskon=a.menentukan();
    }
   }
    
}
