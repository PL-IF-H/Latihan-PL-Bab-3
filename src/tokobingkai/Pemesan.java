package tokobingkai;
import java.util.Scanner;
public class Pemesan {
    Scanner in = new Scanner(System.in);
    private String ID;
    private String nama;
    private String tanggal;
    
    pesanBingkai p = new pesanBingkai();
    
    public void Pemesan(){ //Overloading Constructor
        ID = "";
        nama = "";
        tanggal = "";
    }
    public void Pemesan(String id,String n,String t){ //Overloading Constructor
        ID = id;
        nama = n;
        tanggal = t;
    }
    public void setID(String id){
        ID = id;
    }
    public void setNama(String n){
        nama = n;
    }
    public void setTanggal(String t){
        tanggal = t;
    }
}
