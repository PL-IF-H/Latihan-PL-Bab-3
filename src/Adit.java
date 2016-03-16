/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pl.pkg3;

/**
 *
 * @author Muhamad Hilmi H
 */
public class Adit {
    private int[] harga={3000, 2700, 2300, 2500, 5000, 4000};
    private String[] jenisBingkai={"Hitam Metalik", "Coklat Metalik", "Coklat Bercorak", "Hitam Bercorak", "Emas", "Perak"};
    private long totalPembayaran;
    
    public Adit(Client A){
        for(int i=0;i<harga.length;i++){
            if(A.getJenis().equalsIgnoreCase(jenisBingkai[i])){
                totalPembayaran=harga[i];
            }
        }
    }
    public long getHarga(){
        return totalPembayaran;
    }
    public long pembayaran(int harga, Client ukuran){
        totalPembayaran=harga*ukuran.getUkuran();
        return totalPembayaran;
    }
    public long pembayaran(long harga, Client ukuran){
        totalPembayaran=harga*ukuran.getUkuran();
        if(totalPembayaran>300000 && totalPembayaran<=450000) totalPembayaran-=totalPembayaran*0.05;
        else if(totalPembayaran>450000 && totalPembayaran<=600000) totalPembayaran-=totalPembayaran*0.1;
        else if(totalPembayaran>600000) totalPembayaran-=totalPembayaran*0.15;
        return totalPembayaran;
    }
}
