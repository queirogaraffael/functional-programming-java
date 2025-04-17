package problems_solving.exercicios.lambda.fundamentos;

import java.util.function.BiFunction;

// Implemente uma expressão lambda que multiplique dois números de ponto flutuante.
public class LambdaMultiplicaFloat {
    public static void main(String args[]) {

        float numero1 = 3.16F;
        float numero2 = 23.083F;

        BiFunction<Float, Float, Float> multiplicador = (n1, n2) -> n1 * n2;

        System.out.println(multiplicador.apply(numero1, numero2));

    }
}