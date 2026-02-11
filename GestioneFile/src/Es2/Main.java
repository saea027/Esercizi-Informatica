package Es2;

import java.io.*;

public class Main {
    public static void main (String[] arg) throws IOException {
        try (BufferedReader read = new BufferedReader(new FileReader("GestioneFile\\src\\Es1\\imput.txt"));
            BufferedWriter write = new BufferedWriter(new FileWriter("GestioneFile\\src\\Es2\\output.txt"))) {
            String riga;
            while ((riga = read.readLine()) != null) {
                String rigaModificata = riga.replace("Sara", "Ambra");
                write.write(rigaModificata);
                write.newLine();
            }
            System.out.println("Cambio di parole effettuato.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
