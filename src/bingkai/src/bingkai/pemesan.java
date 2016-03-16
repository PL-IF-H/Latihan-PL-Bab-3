package bingkai;

public class pemesan {
     private String id;//Atribut
    private String nama;//Atribut
    private String tanggal;//Atribut
    private boolean ya=true;//Atribut
    
    public void setpemesan(String nama){//Behavior
       
        this.nama = nama;
    }
    public void setid (String id){//Behavior
        this.id = id;
    }
    public String getnama(){//Behavior
        return nama;
    }
    public String getid(){//Behavior
        return id;
    }
    public void settanggal(String tanggal){//Behavior
       this.tanggal = tanggal; 
    }
    public String gettanggal (){//Behavior
        return tanggal;
    
        
    }
   
}
