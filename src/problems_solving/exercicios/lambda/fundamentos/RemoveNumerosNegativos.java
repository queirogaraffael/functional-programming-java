package problems_solving.exercicios.lambda.fundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Crie uma lista de números e use removeIf com uma expressão lambda para remover os números negativos.
public class RemoveNumerosNegativos {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(-1, -4, -6, -7, 0, 8, 9, -120));

        valores.removeIf(n -> n < 0);

        valores.stream().forEach(System.out::println);

    }
}
