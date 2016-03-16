package Pemesan;

import java.util.*;

public class JenisBingkai {

    private String jenisBingkai;
    Scanner in = new Scanner(System.in);

    public void setJenisBingkai(String jenis) {
        jenisBingkai = jenis;
    }

    public String[][] getJenisBingkai() {
        String[][] jenisBingkai = {{"Jenis Bingkai", "Harga/Meter"},
        {"Hitam Metalik", "3000"},
        {"Coklat Metalik", "2700"},
        {"Coklat Bercorak", "2300"},
        {"Hitam Bercorak", "2500"},
        {"Emas", "5000"},
        {"Perak", "4000"}};
        return jenisBingkai;
    }

    public void displayJB() {
        System.out.println(""+jenisBingkai);
    }
}
