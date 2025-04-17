package problems_solving.exercicios.novos.metodos.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Utilize removeIf para remover elementos menores que 5 de uma lista de inteiros.
public class RemoveMenoresQueCinco {
    public static void main(String args[]) {
        List<Integer> valores = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

       valores.removeIf(n -> n < 5);

       valores.stream().forEach(System.out::println);

    }
}