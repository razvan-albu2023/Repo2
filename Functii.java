public class Functii {
    // functie - o logica delimitata care poate fi refolosita
    // o functie care saluta clientul in functie de numele lui
    // o functie simpla care ne printeaza ceva pe ecran
    // si nu ne da nici un raspuns (nici un return)
    // si nu are parametri
    public static void printGreeting () {
        System.out.println("Buna ziua!");
    }
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    //o functie care calculeaza media a 3 parametri -  ne da un raspuns (returneaza)
    public static double mediaNr(double a, double b, double c) {
        double media = (a+b+c)/3;
        return media;

    }

    //o functie care ne da valoarea lui Pi
    //ne da un raspuns
    //raspunsul va fi double
    //are nevoie de parametri - nu

    public static double piValue() {
        final double PI = 3.14;
//        PI = 5.3;
        return PI;
    }
    public static void main(String[] args) {
        printGreeting();

        //intra clientul nr. 2
        printGreeting(); // CTLL + clic functie ne trimite la definirea functiei

        //apelam o functie cu parametri oferind argumente
        printGreetingByName("Albu", "Razvan");
        printGreetingByName("Albu", "Gabi");
        printGreetingByName("Albu", "Bogdan");


        System.out.println(mediaNr(3, 3, 8));
        double media1 = mediaNr(31123, 1231231, 121);
        double media2 = mediaNr(54, 75 ,87);
        double media3 = mediaNr(756, 534, 543);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);
        System.out.println((piValue()));

        //tema
        //aria unui dreptunghi
        //aria cercului
        //suma a doua numere
        //o functie care returneaa cate caractere are numele + prenumele tau
        String nume = "Razvan";
        System.out.println(nume.length());
    }
}
