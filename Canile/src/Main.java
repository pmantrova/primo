import java.util.*;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Persone persone=creaPersone();
        Cani cani=creaCani();
        System.out.print("l'eta media dei cani risulta:");
        cani.etaMedia();
        System.out.println("inserisci la posizione persona dell array");
        int n=sc.nextInt();
        Persona p=persone.getPersona(n);
        System.out.println("quanti cani vuoi comprare?");
        int ncani=sc.nextInt();
        int np;
        Ordine o=new Ordine(p,ncani);
        for(int i=0; i<ncani; i++){
            System.out.println("inserisci la posizione del cane dell array");
            np=sc.nextInt();
            Cane c=cani.getCani(np);
            o.addCane(c,i);
        }
        System.out.println("costo da pagare:"+o.costoOrdine());

    }
    public static Cani creaCani(){
        System.out.println("quanti cani vuoi mettere?");
        int ncani=sc.nextInt();
        if(ncani>0){
            Cani cani=new Cani(ncani);
            settaCani(cani,ncani);
            return cani;
        }
        return null;
    }
    public static void settaCani(Cani cani,int n) {
        for(int i=0; i<n; i++){
            System.out.println("nome cane n°:"+i+"?");
            String nomecane=sc.nextLine();
            System.out.println("razza cane n°:"+i+"?");
            String razza=sc.nextLine();
            System.out.println("costo cane n°"+i+"?");
            float costo=sc.nextFloat();
            System.out.println("eta cane n°"+i+"?");
            int eta=sc.nextInt();
            Cane cane=new Cane(nomecane,razza,eta,costo);
            cani.addCane(cane,i);

        }
    }
    public static void settaPersone(Persone persone,int n){
        for(int i=0; i<n; i++){
            System.out.println("nome persona n°:"+i+"?");
            String nome=sc.nextLine();
            System.out.println("cognome persona n°:"+i+"?");
            String cognome=sc.nextLine();
            Persona p=new Persona(nome,cognome);
            persone.addPersona(p,i);
        }
    }
    public static Persone creaPersone(){
        System.out.println("quante persone vuoi mettere?");
        int n=sc.nextInt();
        if(n>0){
            Persone persone=new Persone(n); //passo il numero di persone
            settaPersone(persone,n);
            return persone;
        }
        return null;
    }
}