package problems_solving.exercicios.novos.metodos.collection;

import java.util.HashMap;
import java.util.Map;

// Dado um Map<String, Integer>, utilize computeIfPresent para dobrar o valor de uma chave específica.
public class ComputeIfPresentDobrarValor {
    public static void main(String args[]) {

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("a", 10);
        mapa.put("b", 20);
        mapa.put("c", 30);

        mapa.computeIfPresent("b", (chave, valor) -> valor * 2);

        mapa.forEach((chave, valor) -> System.out.println(chave + " - " + valor));


    }
}