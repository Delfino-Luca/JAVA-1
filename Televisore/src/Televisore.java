public class Televisore {
    private int pollici;
    private int volume;
    private int lum;
    private int canale;

    public Televisore(int p, int v, int l, int c){
        this.pollici=p;
        this.volume=v;
        this.lum=l;
        this.canale=c;
    }
    private void setPollici(int p){this.pollici=p;}
    public void setVolume(int v){this.volume=v;}
    public void setLum(int l){this.lum=l;}
    public void setCanale(int c){this.canale=c;}
    public int getPollici(){return this.pollici;}
    public int getVolume(){return this.volume;}
    public int getLum(){return this.lum;}
    public int getCanale(){return this.canale;}
    public void alzaVolume(){
        if(this.volume<50) this.volume++;
    }
    public void abbassaVolume(){
        if(this.volume>0) this.volume--;
    }
    public void aumentaLum(){
        if(this.lum<80) this.lum++;
    }
    public void abbassaLum(){
        if(this.lum>0) this.lum--;
    }
    public void canaleSuccessivo(){
        if(this.canale<99)  this.canale++;
    }
    public void canalePrecedente(){
        if(this.canale>0) this.canale--;
    }
    
    public boolean equals(Object x){
        //POLLICI
        int p = ((Televisore)x).getPollici(); 
        if(p == this.pollici) return true;
        else return false;
        
        //VOLUME
        int v = ((Televisore)x).getVolume();
        if(v == this.volume) return true;
        else return false;
        
        //LUMINOSITÀ
        int l = ((Televisore)x).getLum();
        if(l == this.lum) return true;
        else return false;
        
        //CANALE
        int c = ((Televisore)x).getCanale();
        if(c == this.canale) return true;
        else return false;
    }
}
