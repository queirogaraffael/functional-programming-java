package problems_solving.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Dado um List<String>, transforme todas as strings em maiúsculas utilizando stream.
public class TransformandoStringsComStream {
    public static void main(String args[]) {
        List<String> alfabeto = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h"));
        alfabeto.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
