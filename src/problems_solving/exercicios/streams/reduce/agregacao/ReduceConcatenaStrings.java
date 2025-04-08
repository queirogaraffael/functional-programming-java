package problems_solving.exercicios.streams.reduce.agregacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Com uma lista de strings, use reduce para concatenar todas em uma única string separada por vírgulas.
public class ReduceConcatenaStrings {
    public static void main(String args[]) {

        List<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c", "c", "d", "e", "f"));

        String stringsConcatenada = strings.stream().collect(Collectors.joining(","));

        System.out.println(stringsConcatenada);

    }
}
