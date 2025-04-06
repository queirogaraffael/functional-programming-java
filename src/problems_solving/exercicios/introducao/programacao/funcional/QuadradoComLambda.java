package problems_solving.exercicios.introducao.programacao.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Crie uma função lambda que receba um número inteiro e retorne seu quadrado.
public class QuadradoComLambda {
    public static void main(String args[]) {
        List<Integer> valores = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        valores.stream().map(n -> n * n).forEach(System.out::println);

    }
}
