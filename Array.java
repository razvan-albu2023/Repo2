public class Array {
    public static void main(String[] args) {

    //declarare array
    String[] elevi = {"Gigel", "Costel", "Mari", "Ela", "Ada", "Mari"};
    int[] numere = {1, 33, 81, 99, 201};
    //contine mai multe elemente de acelasi tip
    //accesam elementele prin index care incepe de la zero
    //are o dimensiune fixa
    //are proprietatea "length" care ne da dimensiunea array-ului

        System.out.println(elevi[2]);
        elevi[2] = "Sebi";
        System.out.println(elevi[2]);
        System.out.println(elevi.length);

        //putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0] + " " + elevi[1]);
        System.out.println(elevi.length + 5);

        //sa printam tot timpul ultimul element
        System.out.println("Last place: " + elevi[elevi.length - 1]);

        //declarare si alocare de memorie

        int[] note = new int[5];
        System.out.println(note[1]);
        note[0] = 10;
        note[1] = 9;
        System.out.println(note[1]);
    }
}
