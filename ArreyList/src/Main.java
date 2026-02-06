import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberIncorrectException {
        Scanner in = new Scanner(System.in);
        Esame f1 = new Esame("Fisica 1", 9);
        Studente s = new Studente("n", 938);

        int menu;
        do {
            System.out.println("0 - Exit\n1 - Aggiungere/Rimuovere esame studente\n2 - Informazioni esame/studente\n3 - Verifica promozione");
            menu = in.nextInt();
            switch (menu){
                case 0:
                    menu=0;
                    break;
                case 1:
                    System.out.println("1 - Aggiungere esame\n2 - Rimuovere esame");
                    int ar = in.nextInt();
                    if (ar==1) {
                        System.out.print("\nNome esame: ");
                        String esame = in.nextLine();
                        System.out.print("\nVoto");
                        int voto = in.nextInt();
                        s.addEsame(esame,voto);
                    } else if (ar==2) {
                        System.out.print("\nNome esame: ");
                        String esame = in.nextLine();
                        s.removeEsame(esame);
                    }else NumberIncorrectException;
                    break;
                case 2:
                    break;
                case 3:

            }
        }while (menu!=0);
    }
}