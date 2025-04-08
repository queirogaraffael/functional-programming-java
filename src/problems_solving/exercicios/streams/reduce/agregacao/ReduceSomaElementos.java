package problems_solving.exercicios.streams.reduce.agregacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Dado um List<Integer>, utilize reduce para calcular a soma de todos os elementos.
public class ReduceSomaElementos {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int somaValores = valores.stream().reduce(0, Integer::sum);

        System.out.println(somaValores);
    }
}
