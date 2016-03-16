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
public class Client {
    private String ID;
    private String nama, tanggal, jenis;
    private int ukuran;
    
    public Client(){ //overloading method Client
        this.ID=null;
        this.nama=null;
        this.tanggal=null;
        this.jenis=null;
        this.ukuran=0;
    }
    public Client(String id, String nama, String tanggal){ //overloading method Client
        this.ID=id;
        this.nama=nama;
        this.tanggal=tanggal;
    }
    public Client(String jenis, int panjang, int lebar){ //overloading method Client
        this.jenis=jenis;
        this.ukuran=panjang*lebar;
    }
    public String getId(){
        return ID;
    }
    public String getNama(){
        return nama;
    }
    public String getTanggal(){
        return tanggal;
    }
    public String getJenis(){
        return jenis;
    }
    public int getUkuran(){
        return ukuran;
    }
}
