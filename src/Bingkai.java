package javaapplication11;

public class Bingkai {
    private double Panjang, Lebar;
    
    public void setPanjang(double panjang){
        Panjang = panjang;
    }
    public void setLebar (double lebar){
        Lebar = lebar;
    }
    public double getLuas(){
        return (Panjang*Lebar);
    }
}
