package problems_solving.exercicios.interfaces.funcionais;

// Crie uma interface funcional que recebe dois inteiros e retorna um booleano indicando se o primeiro é maior que o segundo.
public class ComparadorNumeros {
    public static void main(String args[]) {

        ComparadorInteiros ehMaior = (n1, n2) -> n1 > n2;

        boolean resultado = ehMaior.ehMaior(1, 2);

        System.out.println(resultado);

    }
}

@FunctionalInterface
interface ComparadorInteiros {
    boolean ehMaior(int a, int b);
}
