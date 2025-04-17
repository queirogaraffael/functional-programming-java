package problems_solving.exercicios.criando.streams;

import java.util.Arrays;

// Crie um Stream a partir de uma matriz de inteiros.
public class StreamDeMatriz {
    public static void main(String args[]) {

        int[][] matriz = {{1, 2}, {3, 4}, {5, 6} };

        Arrays.stream(matriz)
                .flatMapToInt(Arrays::stream)
                .forEach(System.out::println);

    }
}