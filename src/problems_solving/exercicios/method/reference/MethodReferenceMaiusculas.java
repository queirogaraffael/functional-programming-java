package problems_solving.exercicios.method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Utilize method reference para converter uma lista de strings em maiúsculas.
public class MethodReferenceMaiusculas {
    public static void main(String args[]) {

        List<String> listaStrings = new ArrayList<>(Arrays.asList("ola", "como", "vai", "voce"));

        listaStrings.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
