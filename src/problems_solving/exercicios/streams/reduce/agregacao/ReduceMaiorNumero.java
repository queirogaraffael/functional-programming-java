package problems_solving.exercicios.streams.reduce.agregacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Usando reduce, encontre o maior número em uma lista de inteiros.
public class ReduceMaiorNumero {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(1,7,2,100,1500,523423,765432));

        int maiorValor = valores.stream().reduce(Integer.MIN_VALUE, Integer::max);

        System.out.println(maiorValor);

    }
}
