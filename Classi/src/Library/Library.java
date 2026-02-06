package Library;

import java.util.Scanner;

public class Library {
    private static int totBook = 0;
    private static String[] book;

    //Costruttore
    public Library(int capacity){
        this.book = new String[capacity];
    }

    //Altri metodi
    //aggiungere un libro con un determinato titolo
    public void addBook(String titleBook){
        for (int i = 0; i < book.length; i++){
            if (book[i]==null){
                book[i]=titleBook;
                totBook++;
                i=book.length;
            }
        }
    }
    //rimuovere un libro con il titolo
    public void removeBook(String titleBook){
        boolean findBook=false;
        for (int i = 0; i < book.length; i++){
            if (book[i]==titleBook){
                book[i]=null;
                i=totBook;
                findBook=true;
            }
        }
        if (findBook==false) System.out.println("ERRORE: Libro non trovato");
        else totBook--;
    }
    //stampare il totale dei libri nella libreria
    public static void printTot(){
        Scanner in = new Scanner(System.in);
        System.out.println("Nella tua libreria hai " + totBook + " libri.\nVuoi la lista dei libri? (S - Sì) (N - No)");
        String sn = in.nextLine();
        if (sn == "S") {
            for (int i = 0; i < book.length; i++) System.out.println("\nI tuoi libri:\n" + (i+1) + "° - " + book[i]);
        }
        else if (sn != "N") System.out.println("Non hai rispettato le condizione - La tua risposta viene considerata come negativa");

    }
}
