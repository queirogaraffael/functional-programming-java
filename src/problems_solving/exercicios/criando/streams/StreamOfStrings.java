package problems_solving.exercicios.criando.streams;

import java.util.stream.Stream;

// Utilize Stream.of para criar um fluxo de strings e exibir cada elemento.
public class StreamOfStrings {
    public static void main(String args[]) {

        Stream<String> strings = Stream.of("Ola", "como", "vai", "?");

        strings.forEach(System.out::println);

    }
}
