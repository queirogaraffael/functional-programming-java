package problems_solving.exercicios.novos.metodos.collection;

import java.util.Arrays;
import java.util.List;

// Utilize forEach para imprimir todos os elementos de uma lista.
public class ForEachLista {
    public static void main(String args[]) {

        List<String> palavras = Arrays.asList("casa", "sapato", "computador");

        palavras.stream().forEach(System.out::println);

    }
}
