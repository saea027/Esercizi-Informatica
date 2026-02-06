package Lampada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quanti click gli servono alla lampadina per fulminarsi?");
        int clickFus = in.nextInt();
        in.nextLine();
        System.out.println("La lampadina è accesa o spenta?");
        String accOrSp = in.nextLine();

        Lamp lampada = new Lamp(accOrSp, clickFus);
        System.out.println("Per accendere o spegnere la lampadina cliccare 'c' e invio");
        while (!lampada.toString().equals("rotta")){
            String push = in.nextLine();
            if (push.equals("c")){
                lampada.click();
                System.out.println(lampada.toString());
            }
            push = "";
        }
    }
}