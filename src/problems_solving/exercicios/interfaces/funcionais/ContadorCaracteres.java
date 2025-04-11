package problems_solving.exercicios.interfaces.funcionais;

import java.util.Arrays;
import java.util.List;

// Crie uma interface funcional que aceite uma string e retorne o número de caracteres.
public class ContadorCaracteres {
    public static void main(String args[]) {

        StringLengthCalculator tamanhoPalavra = String::length;

        List<String> palavras = Arrays.asList("oi", "ola", "como", "vai");

        palavras.stream().map(palavra -> tamanhoPalavra.getTamanho(palavra)).forEach(System.out::println);

    }
}

@FunctionalInterface
interface StringLengthCalculator {
    int getTamanho(String palavra);
}
