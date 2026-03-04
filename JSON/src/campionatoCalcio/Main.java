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
    static JSONArray portieri = new JSONArray();
    static JSONArray difensori = new JSONArray();
    static JSONArray centroCampisti = new JSONArray();
    static JSONArray attaccanti = new JSONArray();

    public static void main(String[]args){
        try {
            FileReader sq1 = new FileReader("JSON/src/campionatoCalcio/squadre.JSON");
            FileWriter sq2 = new FileWriter("JSON/src/campionatoCalcio/squadra.JSON");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        while (true){
            System.out.println("Menù:\n0 - Uscita\n1 - Creazione della squadra\n2 - Visualizzazione squadra");
            int menu = in.nextInt();
            in.nextLine();

            if (menu == 0) break;
            switch (menu){
                case 1:
                    break;
                default:
                    System.out.println(menu + " non è un parametro giusto");
            }
        }
    }

    public static void createSq(){
        while (true){
            System.out.println("0 - Esci\n1 - Portieri\n2 - Difensori\n3 - CC\n4 - Attaccanti");
            int menu = in.nextInt();
            in.nextLine();
            if (menu == 0) break;
            switch (menu){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println(menu + " non è un parametro giusto");
            }
        }
    }

    public static void printSquadra(){

    }
}
