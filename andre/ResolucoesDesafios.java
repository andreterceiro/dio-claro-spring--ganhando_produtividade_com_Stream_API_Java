import java.util.Arrays;
import java.util.List;

/**
 * Class with one method to solve each exercise (I solved only some exercises, maybe not all)
 * Please see the exercises in the file src/stream_api/README.md
 */
class ResolucoesDesafios {
    static List<Integer> numeros = Arrays.asList(4, 2, -1, 5, 3);

    public static void main(String[] args) {
        ResolucoesDesafios.resolucaoExercicio1();
        ResolucoesDesafios.inserirDivisorNaTela();
        ResolucoesDesafios.resolucaoExercicio2();
        ResolucoesDesafios.inserirDivisorNaTela();
        ResolucoesDesafios.resolucaoExercicio3();
    }

    /**
     * Here we have the solution of the exercise 1
     * We did a sum using the same idea in the functional interface binary operator
     */
    public static void resolucaoExercicio1() {
        System.out.println(
            "Exercício 1: " +
            ResolucoesDesafios.numeros
                .stream()
                .reduce(0, Integer::sum)
        );
    }

    public static void inserirDivisorNaTela() {
        System.out.println("\n-------------------------------------------\n");
    }

    public static void resolucaoExercicio2() {
        System.out.println(
            "Exercício 2: " +
            ResolucoesDesafios.numeros
                .stream()
                .reduce(0, (n1, n2) -> {
                    // n1 is the accumulated value. We do not need to verify this value
                    // If n2 is odd, we need to return the previous sum
                    // Else, we need to return n1 + n2 (the previous sum with the new value)
                    if (n2 % 2 == 1) {
                        return n1;
                    }
                    return n2 + n1;
               })
               // See that we must not have a semicolon in the line above
        );
    }

    public static void resolucaoExercicio3() {
        Object[] numerosOrdenados = ResolucoesDesafios.numeros
            .stream()
            .sorted()
            .toArray();

        int menorNumero = (int) numerosOrdenados[0];

        Boolean ret = (menorNumero > 0);

        System.out.println(
            "Exercício 3: " + ret
        );
    }
}