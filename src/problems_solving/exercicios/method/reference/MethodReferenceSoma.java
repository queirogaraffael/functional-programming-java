package problems_solving.exercicios.method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Reescreva uma operação de soma utilizando method reference em vez de lambda.
public class MethodReferenceSoma {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        Optional<Integer> soma = valores.stream().reduce(Integer::sum);

        soma.ifPresent(System.out::println);

    }
}