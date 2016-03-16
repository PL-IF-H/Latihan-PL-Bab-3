package beliFrame;
import java.util.Scanner;
public class Pesanan {
    Scanner in = new Scanner(System.in);
    private String[] jFrame = {"Hitam Metalik      ","Coklat Metalik     ","Coklat Bercorak    ",
                    "Hitam Bercorak     ","Emas               ","Perak              "};
    private int[] hargaMeter = {3000, 2700, 2300, 2500, 5000, 4000};
    private double ukurFrame, discHarga;
    int totalHarga, pil, p, l;
    public Pesanan(){
        
    }
    public double ukurFrame(){
        System.out.print("Ukuran          : ");
        p = in.nextInt();
        l = in.nextInt();
        ukurFrame = p*l;
        return ukurFrame;
    }
    
    public void Pesanan(){
        System.out.println("PILIH JENIS BINGKAI");
        for(int i = 0; i<jFrame.length; i++){
            System.out.println((i+1)+" "+jFrame[i]+"  |  "+hargaMeter[i]);
        }
        System.out.print("Piih Bingkai    : "); pil = in.nextInt();
    }
    
    public void hargaBingkai(){
        totalHarga = (int) (ukurFrame*hargaMeter[pil-1]);
    }
    
    public double discHarga(){
        discHarga = 0;
        if(pil == 1 ||  pil == 5 || pil == 6){    
            if(totalHarga>600000){
                discHarga += (totalHarga*0.85);
            } else if (totalHarga>450000){
                discHarga += (totalHarga*0.9);
            } else if (totalHarga>300000){
                discHarga += (totalHarga*0.95);
            } else {
                discHarga = totalHarga;
            }
        } else {
            discHarga = totalHarga;
        }
        return discHarga;
    }
}
