package problems_solving.exercicios.optional.valores.opcionais;

// Utilize Optional para fornecer um valor padrão caso o valor seja null.

import java.util.Optional;

public class OptionalValorPadrao {
    public static void main(String args[]) {

        Optional<Integer> valor = recebeValor("dfdsfds");
        System.out.println(valor.orElse(-1));

        Optional<Integer> valor2 = recebeValor(10);
        System.out.println(valor2.orElse(-1));

    }

    public static <T> Optional<Integer> recebeValor(T valor){
        if(valor == null){
            return Optional.empty();
        }

        try{
            return Optional.of(Integer.parseInt(valor.toString()));
        }catch (NumberFormatException e){
            return Optional.empty();
        }
    }
}
