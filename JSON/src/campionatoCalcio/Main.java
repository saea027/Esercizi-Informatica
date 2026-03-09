package campionatoCalcio;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static JSONObject squadra = new JSONObject();
    static JSONObject societa = new JSONObject();
    static JSONArray portieri = new JSONArray();
    static JSONArray difensori = new JSONArray();
    static JSONArray centroCampisti = new JSONArray();
    static JSONArray attaccanti = new JSONArray();

    public static void main(String[] args) throws IOException {
        try {
            FileReader sq1 = new FileReader("JSON/src/campionatoCalcio/squadre.JSON");
            FileWriter sq2W = new FileWriter("JSON/src/campionatoCalcio/squadra.JSON");
            FileReader sq2R = new FileReader("JSON/src/campionatoCalcio/squadra.JSON");


            while (true) {
                System.out.println("Menù:\n0 - Uscita\n1 - Creazione della squadra\n2 - Visualizzazione squadra");
                int menu = in.nextInt();
                in.nextLine();

                if (menu == 0) break;
                switch (menu) {
                    case 1:
                        createSq();
                        //TODO: non mi scrive sul file JSON
                        sq2W.write(squadra.toJSONString());
                        break;
                    case 2:
                        printSquadra();
                        break;
                    default:
                        System.out.println(menu + " non è un parametro giusto");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createSq(){
        System.out.print("Nome della società: ");
        String nome = in.nextLine();
        societa.put("Nome società", nome);

        System.out.print("Nome del Presidente: ");
        nome = in.nextLine();
        societa.put("Nome Presidente", nome);

        System.out.print("Nome del Vice-Presidente: ");
        nome = in.nextLine();
        societa.put("Nome Vice-Presidente", nome);

        System.out.print("Nome dell'allenatore: ");
        nome = in.nextLine();
        societa.put("Nome allenatore", nome);

        while (true){
            System.out.println("0 - Esci\n1 - Portieri\n2 - Difensori\n3 - CC\n4 - Attaccanti");
            int menu = in.nextInt();
            in.nextLine();
            if (menu == 0) break;
            switch (menu){
                case 1:
                    System.out.print("Numero del portiere: ");
                    int numero = in.nextInt();
                    in.nextLine();
                    System.out.print("\nNome del portiere: ");
                    nome = in.nextLine();
                    portieri.add(numero, nome);
                    break;
                case 2:
                    System.out.print("Numero del difensore: ");
                    numero = in.nextInt();
                    in.nextLine();
                    System.out.print("\nNome del difensore: ");
                    nome = in.nextLine();
                    difensori.add(numero, nome);
                    break;
                case 3:
                    System.out.print("Numero del centrocampista: ");
                    numero = in.nextInt();
                    in.nextLine();
                    System.out.print("\nNome del centrocampista: ");
                    nome = in.nextLine();
                    centroCampisti.add(numero, nome);
                    break;
                case 4:
                    System.out.print("Numero del attaccanti: ");
                    numero = in.nextInt();
                    in.nextLine();
                    System.out.print("\nNome del attaccanti: ");
                    nome = in.nextLine();
                    attaccanti.add(numero, nome);
                    break;
                default:
                    System.out.println(menu + " non è un parametro giusto");
            }
        }
        squadra.put("Società", societa);
        squadra.put("Portieri", portieri);
        squadra.put("Difensori", difensori);
        squadra.put("Centro campisti", centroCampisti);
        squadra.put("Attaccanti", attaccanti);
    }

    //TODO: Un utente puù visualizzare la squadra / (società / portieri / altri ruoli) di una determinata squadra
    public static void printSquadra(){

    }
}
