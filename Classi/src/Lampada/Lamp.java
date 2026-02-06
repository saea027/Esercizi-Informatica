package Lampada;

public class Lamp {
    private String stato;
    private final int totClick;
    static int click=0;

    //Costruttore
    public Lamp(String stato, int totClick){
        this.stato=stato;
        this.totClick=totClick;
    }

    //setter
    public void setStato(String stato) {
        this.stato = stato;
    }

    //Metodi
    public String toString(){
        return stato;
    }

    public void click(){
        if (click+1==totClick) {
            stato="rotta";
        }
        else if (stato.equals("accesa")) {
            stato="spenta";
        }
        else {
            stato="accesa";
        }
        click++;
    }
}
