package problems_solving.exercicios.lambda.fundamentos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Crie uma função lambda que inverta uma string.
    public class LambdaInverterString {
    public static void main(String args[]) {

        List<String> palavras = new ArrayList<>(Arrays.asList("palavra", "invertida", "string"));

        palavras.stream().map(n -> new StringBuilder(n).reverse().toString()).forEach(System.out::println);

    }
}