package problems_solving.exercicios.streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Transforme um List<String> em um Set<String> removendo duplicatas usando collect.
public class ListaParaSet {
    public static void main(String args[]) {

        List<String> lista = new ArrayList<>(Arrays.asList("Casa", "Casa", "Carro", "Java", "Terraform", "Java", "Docker"));

        Set<String> set = lista.stream().collect(Collectors.toSet());

        set.forEach(System.out::println);
    }
}
