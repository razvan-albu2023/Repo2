
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        //declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica
        //adaugam elemente
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        //cum se iau elementele acestea
        fructe.get(0);

        //cum se afla indexul unui element
        System.out.println(fructe.indexOf("banana"));
        System.out.println(fructe.isEmpty());

        //eliminam toate elementele din lista
        // fructe.clear();

        //scoatem un element
        // fructe.remove("mar");

        //listam elementele
        System.out.println(Arrays.toString(fructe.toArray()));

        if (!fructe.isEmpty()) {  //daca NU este goala
            System.out.println("Avem fructe!");
        }   else {
            System.out.println("Nu avem fructe!");
        }
        //Aflam dimensiunea listei
        System.out.println(fructe.size());

        // Declaram o lista imutabila si o initializam cu valori
        List<Integer> numere = Arrays.asList(new Integer[] {1, 33, 77});
        System.out.println(Arrays.toString(numere.toArray()));

        //declaram o lista dinamica
        String[] flowers = {"Ageratum", "Allium", "Poppy", "Catmint"};
        List<String> flowersList = new ArrayList<>(Arrays.asList(flowers));
        flowersList.add("Rose");
        System.out.println(Arrays.toString(flowersList.toArray()));

        //Aflam unde este Poppy
        int poppy_index = flowersList.indexOf("Poppy");
        flowersList.remove(poppy_index);
        System.out.println(Arrays.toString(flowersList.toArray()));
        //Scoatem in functie de valoare

        flowersList.remove("Catmint");
        System.out.println(Arrays.toString(flowersList.toArray()));


    }
}
