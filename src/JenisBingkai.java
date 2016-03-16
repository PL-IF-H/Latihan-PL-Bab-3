package Pemesan;

import java.util.*;

public class JenisBingkai {

    private String jenisBingkai=null;
    Scanner in = new Scanner(System.in);

    public void setJenisBingkai(String jenis) {
        jenisBingkai = jenis;
    }

    public String getJenisBingkai() {
        System.out.println("JENIS BINGKAI   |   HARGA/METER"
                + "1.Hitam Metalik   |   3000"
                + "2.Coklat Metalik  |   2700"
                + "3.Coklat Bercorak |   2300"
                + "4.Hitam Bercorak  |   2500"
                + "5.Emas            |   5000"
                + "6.Perak           |   4000");
        return jenisBingkai;
    }

    public void displayJB() {
        System.out.println(jenisBingkai);
    }
}
