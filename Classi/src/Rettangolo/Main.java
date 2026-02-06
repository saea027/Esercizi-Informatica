package Rettangolo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Di quanto è la tua base?");
        int base=in.nextInt();
        System.out.println("Di quanto è la tua altezza?");
        int altezza=in.nextInt();
        System.out.println("Qual'è la tua x?");
        int x=in.nextInt();
        System.out.println("Qual'è la tua y?");
        int y=in.nextInt();

        Rett rett = new Rett(base, altezza, x, y);

    }
}