public class Persone {
    private Persona listapersone[];
    public Persone(int n){
        listapersone=new Persona[n];
        for(int i=0; i<n; i++){
            listapersone[i]=new Persona();
        }
    }

    public void addPersona(Persona p,int i) {
        listapersone[i]=p;
    }

    public Persona getPersona(int n) {
       return listapersone[n];
    }
}
