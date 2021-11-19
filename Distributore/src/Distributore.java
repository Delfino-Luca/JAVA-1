public class Distributore {
    private int quantita;
    private int prodotto;
    private double prezzo;
    private double portafoglio;

    public Distributore(int q, int p, double pr, double po){
        this.quantita=q;
        this.prodotto=p;
        this.prezzo=pr;
        this.portafoglio=po;
    }
    public void setQuantita(int q){
        quantita=q;
    }
    public int getQuantita(){
        return this.quantita;
    }
    public void setProdotto(int p){
        prodotto=p;
    }
    public int getProdotto(){
        return this.prodotto;
    }
    public void setPrezzo(double pr, int q){
        q=getQuantita();
        prezzo=pr*q;
    }
    public double getPrezzo(){
        return this.prezzo;
    }
    public void setPortafoglio(double po){
        portafoglio=po;
    }
    public double getPortafoglio(){
        return this.portafoglio;
    }
    public void pagamento(double prezzo, double portafoglio){
        if(prezzo<portafoglio){
            portafoglio=portafoglio-prezzo;
            System.out.println("Nel portafoglio ti rimangono: " +portafoglio);
        }else{
            System.out.println("Credito insufficente, inserire almeno: " +prezzo);
        }

    }
}
