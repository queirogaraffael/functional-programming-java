package problems_solving.exercicios.refatorando.loops.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Com uma lista de nomes, utilize stream para exibir apenas os nomes que começam com a letra "A".
public class FiltrandoNomesComStream {
    public static void main(String args[]) {

        List<String> palavras = new ArrayList<>(Arrays.asList("Abacate", "pera", "amarelo", "Azul", "Alicate"));

        palavras.stream().filter(a -> a.startsWith("A")).forEach(System.out::println);
    }
}
