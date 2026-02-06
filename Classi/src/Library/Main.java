package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quanti libri può contenere la tua libreria?");
        int cont = in.nextInt();
        in.nextLine();
        Library library = new Library(cont);
        boolean exit = true;
        String title;
        while (exit){
            System.out.println("\nMenù:\nAggiungere un libro - 1;\nRimuovere un libro - 2;\nVisualizzare il catalogo - 3;\nUscire - 4;");
            String scelta = in.nextLine();
            switch (scelta){
                case "1":
                    System.out.println("Inserisci il nome del libro che vuoi aggiungere");
                    title = in.nextLine();
                    library.addBook(title);
                    break;
                case "2":
                    System.out.println("Inserisci il nome del libro che vuoi rimuovere");
                    title = in.nextLine();
                    library.removeBook(title);
                    break;
                case "3":
                    library.printTot();
                    break;
                case "4":
                    exit = false;
                    break;
                default:
                    System.out.println("ERRORE: Non hai rispettato le condizioni, riprova.");
                    break;
            }
        }
    }
}