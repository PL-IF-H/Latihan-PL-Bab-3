/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3;

public class Pemesan {
    String id, nama, tgl;
    
    public void Pesan(String d, String n, String t){
        this.id = d;
        this.nama = n;
        this.tgl = t;
    }
    public void Pesan(String d, String n){
        this.id = d;
        this.nama = n;
    }
    
}
