package Es4;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String [] args){
    }

    //riceve in ingresso un path, controlla se il file esiste se no lo crea uno
    public static void puhnto4() throws IOException {
        System.out.print("Nome del URL del file che stai cercando: ");
        String url = in.nextLine();
        File file = new File(url);
        //exist - controlla se esiste il file
        if (!file.exists()){
            file.createNewFile();
            System.out.println("Il tuo file non esiste: Creazione del file in corso ...\n\nEND");
        }
        else System.out.println("Il file che stavi cercando esiste.");
    }

    //stampa a video tutti i nomi dei file contenuti in una directory specifica
    public static void punto5e6() {
        System.out.println("Nome della directory interessata: ");
        String url = in.nextLine();
        File dir = new File(url);
        if (!dir.exists()) {
            System.out.println("La directory non esiste. \nVorresti crearla (Si o No)?");
            if (in.nextLine().equals("Si")) {
                //mkdir - crea la directory
                dir.mkdir();
                System.out.println("Creazione della directory in corso ... \n\nEND");
            }
        }
        //list - restituisce un arrey con tutti i nomi del file
        System.out.println(Arrays.toString(dir.list()));
    }

    //eliminare un file specifico
    public static void punto7() {
        System.out.print("Nome del URL del file da eliminare: ");
        String url = in.nextLine();
        File file = new File(url);
        file.delete();
        System.out.println("Eliminazione in corso ... \nAttendere un attimo ... \n\nEND");
    }

    //stampa del nome del file, la sua directory padre, la dimenzione in Byte
    public static void punto8(){
        System.out.print("Nome del URL del file: ");
        String url = in.nextLine();
        File file = new File(url);
        //getName - nome del file || getParent - nome directory padre || length - dimenzione in Byte
        System.out.println("Nome del file: " + file.getName() + "\nNome della sua directory: " + file.getParent() + "\nDimenzione del file: " + file.length() + " Byte");
    }
}
