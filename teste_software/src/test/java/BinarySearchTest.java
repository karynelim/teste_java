import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.BinarySearch;

public class BinarySearchTest {

    @Test
    public void testElementFound() {
        // Testa se o algoritmo encontra corretamente um elemento no meio do array
        // Elemento 5 está na posição 2 do array {1, 3, 5, 7, 9, 11}
        int[] array = {1, 3, 5, 7, 9, 11};
        assertEquals(2, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFound() {
        // Testa se o algoritmo retorna -1 quando o elemento não existe no array
        // Elemento 4 não existe no array {1, 3, 5, 7, 9, 11}
        int[] array = {1, 3, 5, 7, 9, 11};
        assertEquals(-1, BinarySearch.binarySearch(array, 4));
    }

    @Test
    public void testElementAtBeginning() {
        // Testa se o algoritmo encontra corretamente o primeiro elemento do array
        // Elemento 1 está na posição 0 (início) do array
        int[] array = {1, 3, 5, 7, 9, 11};
        assertEquals(0, BinarySearch.binarySearch(array, 1));
    }

    @Test
    public void testElementAtEnd() {
        // Testa se o algoritmo encontra corretamente o último elemento do array
        // Elemento 11 está na posição 5 (final) do array
        int[] array = {1, 3, 5, 7, 9, 11};
        assertEquals(5, BinarySearch.binarySearch(array, 11));
    }

    @Test
    public void testElementSmallerThanMiddle() {
        // Testa o branch onde v[middle] > element (busca na metade esquerda)
        // Elemento 3 é menor que o middle (5), então busca à esquerda
        int[] array = {1, 3, 5, 7, 9, 11};
        assertEquals(1, BinarySearch.binarySearch(array, 3));
    }

    @Test
    public void testElementLargerThanMiddle() {
        // Testa o branch onde v[middle] < element (busca na metade direita)
        // Elemento 9 é maior que o middle (5), então busca à direita
        int[] array = {1, 3, 5, 7, 9, 11};
        assertEquals(4, BinarySearch.binarySearch(array, 9));
    }

    @Test
    public void testSingleElementFound() {
        // Testa caso especial: array com um único elemento que é encontrado
        // Verifica se o algoritmo funciona corretamente com array de tamanho 1
        int[] array = {5};
        assertEquals(0, BinarySearch.binarySearch(array, 5));
    }

    @Test
    public void testSingleElementNotFound() {
        // Testa caso especial: array com um único elemento que não é o procurado
        // Verifica se retorna -1 quando o único elemento não é o desejado
        int[] array = {5};
        assertEquals(-1, BinarySearch.binarySearch(array, 3));
    }

    @Test
    public void testEmptyArray() {
        // Testa caso limite: array vazio
        // Verifica se o algoritmo trata corretamente arrays sem elementos
        // A condição begin <= end será falsa imediatamente (0 <= -1 = false)
        int[] array = {};
        assertEquals(-1, BinarySearch.binarySearch(array, 5));
    }
}
