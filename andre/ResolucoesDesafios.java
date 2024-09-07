import java.util.Arrays;
import java.util.List;

/**
 * Class with one method to solve each exercise (I solved only some exercises, maybe not all)
 * Please see the exercises in the file src/stream_api/README.md
 */
class ResolucoesDesafios {
    static List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        ResolucoesDesafios.resolucaoExercicio1();
    }

    /**
     * Here we have the solution of the exceise 1
     * We did a sum using the same idea in the functional interface binary operator
     */
    public static void resolucaoExercicio1() {
        System.out.println(
            ResolucoesDesafios.numeros
                .stream()
                .reduce(0, Integer::sum)
        );
    }
}