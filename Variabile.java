public class Variabile {
    public static void main(String[] args) {
        //declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";

        // Strongly typed - trebuie sa specificam tipul de date
        System.out.println("Am cumparat o masina marca : "+  marcaMasina);
        System.out.println("Este modelul : " + modelMasina);

        //suprascrierea
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca : "+  marcaMasina);
        System.out.println("Este modelul : " + modelMasina);
        //declarare
        String nume;
        String prenume;
        int varsta = 34;

        //initializare
        prenume = "Razvan";
        nume = "Albu";
        System.out.println("Proprietarul este : " + prenume + " " + nume + " cu varsta de " + varsta + " ani");

    }
}
