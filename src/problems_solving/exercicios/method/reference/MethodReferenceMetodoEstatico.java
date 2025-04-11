package problems_solving.exercicios.method.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Crie uma classe com um método estático e utilize method reference para invocá-lo a partir de um stream.
public class MethodReferenceMetodoEstatico {
    public static void main(String args[]) {

        List<Integer> valores = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        valores.stream().map(Calculadora::multiplicaPorDois).forEach(System.out::println);

    }
}

class Calculadora{

    public static Integer multiplicaPorDois(int i){
        return i * 2;
    }
}