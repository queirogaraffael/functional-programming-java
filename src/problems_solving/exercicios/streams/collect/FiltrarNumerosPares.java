package problems_solving.exercicios.streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Dado um List<Integer>, filtre os números pares e colete-os em uma nova lista.
public class FiltrarNumerosPares {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> valoresFiltrados = valores.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        valoresFiltrados.forEach(System.out::println);

    }
}
