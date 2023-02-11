public class Cane {
    private String nome;
    private String Razza;
    private int eta;
    private float costo;
    public Cane(String nome,String razza,int eta,float costo){
        setCosto(costo);
        setNome(nome);
        setRazza(razza);
        setEta(eta);
    }

    public String getNome() {
        return nome;
    }

    public float getCosto() {
        return costo;
    }

    public int getEta() {
        return eta;
    }

    public String getRazza() {
        return Razza;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRazza(String razza) {
        Razza = razza;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
}
