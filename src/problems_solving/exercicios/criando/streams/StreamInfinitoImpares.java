package problems_solving.exercicios.criando.streams;

import java.util.stream.Stream;

// Gere um Stream infinito de números ímpares e exiba os 10 primeiros.
    public class StreamInfinitoImpares {
    public static void main(String args[]) {

        Stream<Integer> streamInfinita = Stream.iterate(1, n -> n + 2);

        streamInfinita.limit(10).forEach(System.out::println);
    }
}