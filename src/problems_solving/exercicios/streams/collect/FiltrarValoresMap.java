package problems_solving.exercicios.streams.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Dado um Map<String, Integer>, filtre apenas os valores maiores que 10 e colete o resultado em um novo Map.
public class FiltrarValoresMap {
    public static void main(String args[]) {

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Maçã", 10);
        estoque.put("Banana", 20);
        estoque.put("Laranja", 15);
        estoque.put("Pera", 8);
        estoque.put("Uva", 25);

        Map<String, Integer> estoqueFiltrado = estoque.entrySet().stream().filter(entry -> entry.getValue() > 10).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        estoqueFiltrado.forEach((chave, valor) -> System.out.println(chave + " - " + valor));



    }
}
