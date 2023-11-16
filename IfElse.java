import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("pornim radio");
        // daca ne place piesa, dam mai tare
        boolean piesa_faina = false; // invat calculatorul daca piesa e faina sau nu
        // daca piesa e ok, dau mai tare
        if (piesa_faina == true) {
            System.out.println("dau mai tare");
            System.out.println("incep sa o fredonez");
            System.out.println("oprim radio");
        }
        // if else
        int nr = 4;
        if (nr % 2 == 0) {
            System.out.println("par");
        }   else {
            System.out.println("impar");
        }
        //luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti ora: ");
        int ora = sc.nextInt();
        if (ora < 0) {
            System.out.println("ora invalida");
        } else if (ora <= 11) {
            System.out.println("neatza");
        } else if (ora <= 18) {
            System.out.println("Buna ziua");
        } else if (ora <= 21) {
            System.out.println("Buna seara");
        } else if (ora <= 24) {
            System.out.println("Noapte Buna!");
        } else  {
            System.out.println("Ora invalida!");
        }
        // < 0 - viteza invalida, 0 stationeaza, <=50 localitate, <=90 drum judetean, autostrada
        //switch se foloseste cand stim toate valorile posibile

        System.out.println("Alege optiunea: ");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("merg in meniul anterior");
                break;
            case 1:
                System.out.println("meniu romana");
                break;
            case 2:
                System.out.println("meniu engleza");
                break;
            default:
                System.out.println("optiunea aleasa este invalida");
        }

    } // inchide functia main
} // inchide clasa
