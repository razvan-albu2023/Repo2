public class For {
    public static void main(String[] args) {
        //for - structura repetitva
        //de unde incepem
        //pana unde mergem
        //pasul de parcurgere
        //problema: printam 101 dalmatieni
        for (int i = 1; i<=101; i++) {
            System.out.println("Dalmatianul cu numarul " + i);
        }

        //ne ajuta sa parcurgem un array prin intermediul indexului
        int[] numere = {3, 7, 10, 20, 30, 40}; //numere[0] = 3
        for (int i = 0; i < numere.length; i=i+2)
            System.out.println("elementul cu index " +i + " si valoarea " +numere[i]);

        //for each - parcurge toate elementele din array si ajunge direct la valoare

        for (int numar : numere) {
            System.out.println("Numarul este: " + numar);
        }
        //parcurgem array de culori
        String[] culori = {"alb", "rosu", "galben"};
        for (String culoare : culori) {
            System.out.println(("Culoarea actuala este " + culoare));
        }
        //suma numerelor din array
        int s=0;
        for (int numar :numere) {
            s=s+numar;
        }
        System.out.println("suma este: " + s);
    }
}
