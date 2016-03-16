package githubpraktikum3;
import java.util.Scanner;
/*
 *NAMA  : I KETUT SIDHARTA YOGATAMA
 *NIM   : 155150200111102
 *KELAS : IF - H
 */
public class TokoAdit {
    private String id;
    private String nama;
    private String tanggal;

    public TokoAdit(String n, String l, String d){
        this.nama=n;
        this.tanggal=l;
        this.id=d;
    }

    public Boolean cekId(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama \t\t:");
        String namai=input.next();
        System.out.print("Masukkan tanggal \t:");
        String tanggali=input.next();
        System.out.print("Masukkan id \t\t:");
        String idi=input.next();
        Boolean b = false;
        if (this.nama.equals(namai)){
           if (this.tanggal.equals(tanggali)){
             if (this.id.equals(idi)){
                b = true;
            }
            }else{
                b = false;
            }
        }return b;
  }
}