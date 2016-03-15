package tokobingkai;

import java.util.Scanner;

public class Pemesan {
    Scanner in = new Scanner(System.in);
    private String ID;
    private String nama;
    private String tanggal;
    private String bingkai;
    private int ukuran;
    
    public Pemesan(){
        ID = "";
        nama = "";
        tanggal = "";
        bingkai = "";
        ukuran = 0;
    }
    public Pemesan(String id,String n,String t,String b,int u){
        ID = id;
        nama = n;
        tanggal = t;
        bingkai = b;
        ukuran = u;
    }
    public void setID(String id){
        ID = id;
    }
    public void setNama(String n){
        nama = n;
    }
    
    public void display(){
        System.out.println("ID : "+ID);
        System.out.println("Nama : "+nama);
    }
}
