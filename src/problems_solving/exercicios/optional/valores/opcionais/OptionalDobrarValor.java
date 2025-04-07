package problems_solving.exercicios.optional.valores.opcionais;

// Transforme um Optional<Integer> aplicando uma função que dobra o número, se ele existir.

import java.util.Optional;

public class OptionalDobrarValor {
    public static void main(String args[]) {

        Optional<Integer> valor = Optional.of(2);

        Optional<Integer> valorDobrado = valor.map(n -> n*2);

        valorDobrado.ifPresent(System.out::println);
    }
}
