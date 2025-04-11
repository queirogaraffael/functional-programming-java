package problems_solving.exercicios.interfaces.funcionais;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Implemente uma interface funcional para calcular a potência de um número.
public class CalculadoraPotencia {
    public static void main(String args[]) {
        PowerCalculator potencia = (Math::pow);

        List<Integer> valores = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        valores.stream().map(valor -> potencia.calculate(valor, 2)).forEach(System.out::println);

    }
}


@FunctionalInterface
interface PowerCalculator {
    double calculate(double base, double exponent);
}