public class Esame {
    private String nomeEs;
    private int cfu;
    private int voto;

    public Esame(String nomeEs, int cfu){
        this.nomeEs=nomeEs;
        this.cfu=cfu;
    }

    //Setter and getter
    public void setCfu(int cfu) {
        this.cfu = cfu;
    }
    public int getCfu() {
        return cfu;
    }
}
