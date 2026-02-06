import java.util.ArrayList;

public class Studente {
    private String nomeSt;
    private int mat;
    private ArrayList<String> totEsami = new ArrayList<>();
    private ArrayList<Integer> totVoti = new ArrayList<>();

    public Studente(String nomeSt, int mat){
        this.nomeSt=nomeSt;
        this.mat=mat;
    }

    //Getter
    public int getMat() {
        return mat;
    }
    public String getNomeSt() {
        return nomeSt;
    }

    //Metodi
    public void addEsame(String nomeEsame, int voto){
        totEsami.add(nomeEsame);
        totVoti.add(voto);
    }
    public void removeEsame(String nomeEsame){
        for (int i = 0; i < totEsami.size(); i++){
            if (totEsami.get(i).equals(nomeEsame)) totEsami.remove(i);
        }
    }
    public boolean promosso(int voto){
        boolean promosso = false;
        if (voto>=18) promosso = true;
        return promosso;
    }
}
