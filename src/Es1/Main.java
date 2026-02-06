package Es1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\Es1\\imput.txt");
        try(Scanner in = new Scanner(file)){
            int contaRighe = 0;
            int contaParole = 0;
            while (in.hasNextLine()) {
                String r = in.nextLine();
                //Stoppa ogni volta che trova " " e lo mette nell'arrey
                String[] parole = r.split(" ");
                contaRighe++;
                contaParole += parole.length;
            }
            System.out.println("___Informazioni del file___\nRighe totali: " + contaRighe + "\nParole totali: " + contaParole);
        }catch (FileNotFoundException e){
            System.out.println("File non trovato!");
        }
    }
}