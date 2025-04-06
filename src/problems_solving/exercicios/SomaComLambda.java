package problems_solving.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Utilize uma função lambda para calcular a soma de dois números.
public class SomaComLambda {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(1,2));

        Optional<Integer> resultado = valores.stream().reduce(Integer::sum);

        System.out.println(resultado.orElse(0));

    }
}