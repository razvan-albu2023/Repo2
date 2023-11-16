package oop;
public class ContBancar {
    //program files = definim logica unui cont bancar
}


    //program files = definim logica unui cont bancar

    //oop = object oriented programming
    //poo = programare orientata pe obiecte

    //o clasa = este un tip nou
    // este definitia unui concept
    //reteta la paste carbonara
    //ex: clasa Car

    //un obiect = instanta unei clase
    //paste carbonara
    //obiect de tip Car - 10 obiecte de tip Car

    //fields, proprietati sau atribute
    //variabilele
    //exemplu: pentru masini: culoarea, marca, model, consum, pret, esteOprita

    //metode = actiuni ce pot fi facute de obiecte
    //functii
    //ex: accelereaza(), franeaza(), deschide usa(), vopsire()

    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;

    //constructor = are rolul de a impune date de start
    //ca si stelutele din formulare (required fields)


    public ContBancarMain(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }
}
