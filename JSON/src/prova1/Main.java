package prova1;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String file = "JSON/src/prova1/prova.json";

        JSONObject myobject = new JSONObject();
        myobject.put("Cognome", "Ferrara");
        myobject.put("Nome", "Sara");
        myobject.put("Eta", 18);

        JSONArray array = new JSONArray();
        array.add("Lingua 1 : Giapponese");
        array.add("Lingua 2 : Inglese");

        myobject.put("Lingue", array);

        printFile(file, myobject);
        System.out.println(myobject);
    }

    public static void printFile(String nome, JSONObject myObject){
        try (FileWriter myFile = new FileWriter(nome)){
            myFile.write(myObject.toJSONString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
