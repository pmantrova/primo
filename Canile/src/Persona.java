public class Persona {
    private String nome;
    private String cognome;

    public Persona(){
        setNome(" ");
        setCognome(" ");
    }
    public Persona(String nome,String cognome){
        setNome(nome);
        setCognome(cognome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }
}
