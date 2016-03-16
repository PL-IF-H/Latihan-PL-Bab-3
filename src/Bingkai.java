class Bingkai {
    private int PanjangBingkai, LebarBingkai, KelilingBingkai;
    private String JenisBingkai;
    private final String[] dbBingkai = {"Hitam Metalik", "Coklat Metalik", 
        "Coklat Bercorak", "Hitam Bercorak", "Emas", "Perak"};
    private final int[] dbHarga = {3000, 2700, 2300, 2500, 5000, 4000};
    
    public Bingkai(String JenisBingkai, String PanjangBingkai, String LebarBingkai){
        this.PanjangBingkai = Integer.parseInt(PanjangBingkai);
        this.LebarBingkai = Integer.parseInt(LebarBingkai);
        this.JenisBingkai = JenisBingkai;
    }
    
    public int harga(){
        int result=0;
        KelilingBingkai = 2 * (PanjangBingkai + LebarBingkai);
        for (int i = 0; i < dbBingkai.length; i++) {
            if (JenisBingkai.equals(dbBingkai[i])) {
                result = dbHarga[i] * KelilingBingkai;
            }
        }
        return result;
    }
    
    public String jenis(){
        return JenisBingkai;
    }
    
}
