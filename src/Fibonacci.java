import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    private static Map<Integer, Long> fibCache = new HashMap<>();

    public static void main(String[] args) {
        int n = 10; // Cambia este valor para obtener más términos de la secuencia de Fibonacci

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibCache.containsKey(n)) {
            return fibCache.get(n);
        }

        long fibValue = fibonacci(n - 1) + fibonacci(n - 2);
        fibCache.put(n, fibValue);
        return fibValue;
    }
}
