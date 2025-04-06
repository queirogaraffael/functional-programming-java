package problems_solving.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Dado um List<Integer>, use stream para dobrar os valores de todos os elementos.
public class DobroComStream {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        valores.stream().map(n -> n * 2).forEach(System.out::println);
    }
}