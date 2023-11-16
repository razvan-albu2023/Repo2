/*
if else evalueaza conditii si bifurca codul in functie de rezultat
 */


public class Operatori {
    public static void main(String[] args) {
        int a = 3; //declarare && initializare
        int b = 5;
        a = b; //suprascriere
        System.out.println(12 > b);
        System.out.println(7>b && 3>b); //7>5 SI 8>5
        System.out.println(7>b && (8>b || 3>b)); //true && true
        System.out.println(!(7>b)); // !true = false

        // if else

    }
}
