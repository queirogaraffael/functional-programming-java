package problems_solving.exercicios.optional.valores.opcionais;

// Crie um Optional<String> e verifique se um valor está presente.

import java.util.Optional;

public class VerificandoPresencaComOptional {
    public static void main(String args[]) {

        Optional<Integer> valor = Optional.of(1);

        valor.ifPresent(System.out::println);
    }
}
