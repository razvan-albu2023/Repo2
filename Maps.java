import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Maps {
    public static void main(String[] args) {
        //,ap este o reprezentare de date in sistem cheie valoare
        //exemplu: gigel are nota 10, costel are nota 9
        // este un array la care putem da nume la index

        Map<String, Integer> note_elevi = new HashMap<String,Integer>();

        //declaram un map
        note_elevi.put("Gigel", 10);
        note_elevi.put("Costel", 9);
        note_elevi.put("Ana", 10);

        //aflu notele
        System.out.println("Ana are nota " + note_elevi.get("Ana"));

        //Costel si-a marit nota - suprascriem valori
        note_elevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la " + note_elevi.get("Costel"));
        // aflam dimensiunea
        System.out.println(note_elevi.size());

        //stergem valori
        note_elevi.remove("Gigel");
        System.out.println(note_elevi.size());

        //declaram si initializam cu valori
        //Map nu este ordonat
        Map<String, Integer> luni = new HashMap<String, Integer>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};
        System.out.println(luni);



    }
}
