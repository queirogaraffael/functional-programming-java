package problems_solving.exercicios.introducao.programacao.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Escreva uma expressão lambda que concatene duas strings.
public class ConcatenacaoLambda {
    public static void main(String args[]) {

        List<String> palavras = new ArrayList<>(Arrays.asList("Casa", "Carro"));

        Optional<String> resultado = palavras.stream().reduce(String::concat);

        System.out.println(resultado.orElse(""));

    }
}
