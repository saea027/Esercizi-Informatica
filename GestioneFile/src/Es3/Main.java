package Es3;

//TODO: Da completare

import java.io.*;
import java.util.Scanner;

public class Main {
    static File fileP = new File("GestioneFile\\src\\Es3\\filePari.txt");
    static File fileD = new File("GestioneFile\\src\\Es3\\fileDispari.txt");
    public static void main (String[] arg) throws IOException {
        Scanner in = new Scanner(System.in);
        String parola = "";
        try {
            do {
                System.out.println("Menù\n1 - Inserire una parola\n2 - Uscire");
                int menu = in.nextInt();
                switch (menu){
                    case 1:
                        System.out.println("\nInserisci la tua parola:");
                        parola = in.nextLine();
                        if (parola.length() % 2 == 0 ){
                            FileWriter fw = new FileWriter(fileP);
                            fw.write(parola);
                        }else {
                            FileWriter fw = new FileWriter(fileD);
                            fw.write(parola);
                        }
                        break;
                    case 2:
                        parola = "Fine";
                        break;
                    default:
                        System.out.println(menu + " non è presente fra le opzioni: Riprova");
                }
            } while (parola.equals("Fine"));
        }catch (FileNotFoundException e){
            System.out.println("File non trovato");
        }
    }
    /*
    public void ajja(){
        InputStream inputStream = new FileInputStream("FileInput");
        OutputStream outputStream = new FileOutputStream("FileOutput");

        Byte [] byteBuffer = new Byte[1024];

    }
     */
}