package Rettangolo;

public class Rett {
    private int base;
    private int altezza;
    private int x;
    private int y;

    //Costruttore
    public Rett(int b, int h, int x, int y){
        this.base=b;
        this.altezza=h;
        this.x=x;
        this.y=y;
    }

    //Metodi
    public void print(){
        System.out.println("Coordinate:");
        System.out.println("(" + x + ";" + y + ")");
    }
}
