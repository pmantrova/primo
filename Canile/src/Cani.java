public class Cani {
    private Cane listacani[];
    public Cani(int n){
    listacani=new Cane[n];
    }
    public void addCane(Cane c,int i) {
        listacani[i]=c;
    }

    public void etaMedia() {
        float media=0;
        for(int i=0; i< listacani.length; i++){
          media+=listacani[i].getEta();
        }
        media/= listacani.length;// media=media/listacani.length
        System.out.println(media);
    }

    public Cane getCani(int np) {
        return listacani[np];
    }
}
