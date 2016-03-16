package pemlan.tugas3;
public class DagangBingkai {
    private String ID, Nama, Tanggal, Jenis ;
    String  HM, CM, CB, HB, E, P;
    private double Harga , UkuranP , UkuranL ;
    public DagangBingkai(){
    }
    public void inputPesan(String I, String N, String T, String J){
        ID = I ;
        Nama = N ;
        Tanggal = T ;
        Jenis = J ;
    }
    public DagangBingkai (double UP, double UL){
        UkuranP = UP ;
        UkuranL = UL ;
    }
    public void setPanjang(double UP){
        UkuranP = UP ;
    }
    public void setLebar(double UL){
        UkuranL = UL ;
    }
    public double getPanjang (){
        return UkuranP ;
    }
    public double getLebar(){
        return UkuranL ;
    }
    public double hitungHarga(){
        double Keliling = (getPanjang() + getLebar())*2 ;
        return Keliling ;
    }
    public double hitungHarga(String Jenis){
        double kll = hitungHarga(); 
        double harga = 0 ;
        double diskon = 0 ;
        double total = 0 ;
        switch(Jenis){
            case "HM" :
            harga = kll*3000 ;
                if (harga < 300000) {
                    diskon = 0 ;
                }else if (harga > 300000 && harga <= 450000) {
                    diskon = harga*0.5;
                }else if (harga > 450000 && harga <= 650000) {
                    diskon = harga*0.1;
                }else {
                    diskon = harga*0.15;
                }
            break ;
            case "CM" :
            harga = kll*2700 ;
                    diskon = 0 ;
                break;
            case "CB" :
            harga = kll*2300;
                    diskon = 0 ;
                break;
            case "HB" :
            harga = kll*2500;
                    diskon = 0 ;
                break;
            case "E"  :
            harga = kll*5000;
                if (harga < 300000) {
                    diskon = 0 ;
                }else if (harga > 300000 && harga <= 450000) {
                    diskon = harga*0.5;
                }else if (harga > 450000 && harga <= 650000) {
                    diskon = harga*0.1 ;
                }else{
                    diskon = harga*0.15 ;
                }break;
            case "P"   :
            harga = kll*4000;
                if (harga < 300000) {
                    diskon = 0 ;
                }else if (harga > 300000 && harga <= 450000) {
                    diskon = harga*0.5 ;
                }else if (harga > 450000 && harga <= 650000) {
                    diskon = harga*0.15 ;
                }else{
                    diskon = harga*0.15 ;
                }break;
            default : System.out.println("Pilihan Anda Salah");
                break;
                }  
        System.out.println("");
          System.out.println("***Harga        : " +harga);
          System.out.println("***Diskon       : " +diskon);
            System.out.println("");
        return total = harga - diskon;
    }
    public void displayF(){
        System.out.println("Nama              : "+Nama);
        System.out.println("ID                : "+ID);
        System.out.println("Tanggal           : "+Tanggal);
        System.out.println("Jenis             : "+Jenis);
        System.out.println("Total Harga       : "+hitungHarga(Jenis)+" RP");
    }
}
