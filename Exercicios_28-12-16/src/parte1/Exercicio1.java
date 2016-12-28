package parte1;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio1 {

    ArrayList<String> frutasOriginal, frutasInvertida;

    public Exercicio1() {
        frutasOriginal = new ArrayList<>();
        frutasInvertida = new ArrayList<>();

        frutasOriginal.add("Ananás");
        frutasOriginal.add("Banana");
        frutasOriginal.add("Clementina");
        frutasOriginal.add("Maçã");

        System.out.println("Array Original: ");

        for (int i = 0; i < frutasOriginal.size(); i++) {
            System.out.println(frutasOriginal.get(i));
        }
        
        System.out.println("\n");
        
        inverterArray(frutasOriginal, frutasInvertida);

        System.out.println("Array Inversa: ");

        for (int i = 0; i < frutasInvertida.size(); i++) {
            System.out.println(frutasInvertida.get(i));
        }

    }

    private ArrayList inverterArray(ArrayList arrayOriginal, ArrayList arrayInversa) {

        Collections.reverse(arrayOriginal);
        
        for(int i = 0; i < arrayOriginal.size(); i++){
            arrayInversa.add(arrayOriginal.get(i));
        }

        return arrayInversa;
        
    }
}
