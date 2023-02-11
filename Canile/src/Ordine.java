import java.time.LocalDateTime;

public class Ordine {
    private LocalDateTime data;
    private Persona p;
    private Cane[] caniacquistati;
    public Ordine(Persona p,int ncani){
        setP(p);
        data=LocalDateTime.now();
        caniacquistati=new Cane[ncani];
    }

    public LocalDateTime getData() {
        return data;
    }

    public Persona getP() {
        return p;
    }


    public void setP(Persona p) {
        this.p = p;
    }

    public void addCane(Cane c,int i) {
        caniacquistati[i]=c;
    }
    public float costoOrdine(){
        float costo=0;
        for(int i=0; i< caniacquistati.length; i++){
            costo+=caniacquistati[i].getCosto();
        }
        return costo;
    }
}
