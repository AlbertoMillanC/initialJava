import java.util.Arrays;
import java.util.Random;

public class OrdenamientoNumeros {
    public static void main(String[] args) {
        int[] numeros = generarListaAleatoria(10); // Genera una lista aleatoria de 10 números
        System.out.println("Lista generada: " + Arrays.toString(numeros));
        
        ordenarNumeros(numeros);
        System.out.println("Lista ordenada de mayor a menor: " + Arrays.toString(numeros));
    }

    public static int[] generarListaAleatoria(int tamano) {
        int[] lista = new int[tamano];
        Random random = new Random();
        
        for (int i = 0; i < tamano; i++) {
            lista[i] = random.nextInt(900) + 100; // Genera números aleatorios de tres cifras (entre 100 y 999)
        }
        
        return lista;
    }

    public static void ordenarNumeros(int[] numeros) {
        int n = numeros.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    intercambio = true;
                }
            }

            if (!intercambio) {
                break; // Si no hubo intercambios en una pasada, la lista ya está ordenada
            }
        }
    }
}
