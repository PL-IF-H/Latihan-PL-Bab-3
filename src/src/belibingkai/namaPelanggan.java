/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belibingkai;

public class namaPelanggan {
    private String nama;
    private String ID;
    private String tanggal;
    
    public void dataPelanggan(String nama){
        this.nama = nama;
        
    }
    public void dataPelanggan (String ID, String tanggal){
        this.ID = ID;
        this.tanggal = tanggal;
    }
}
