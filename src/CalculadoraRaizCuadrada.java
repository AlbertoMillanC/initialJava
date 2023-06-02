import java.util.Scanner;

public class CalculadoraRaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        double raizCuadrada = calcularRaizCuadrada(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }

    public static double calcularRaizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }

        double estimacionInicial = numero / 2;
        double estimacionActual = estimacionInicial;
        double epsilon = 0.00001; // Valor de precisión

        while (true) {
            double estimacionAnterior = estimacionActual;
            estimacionActual = (estimacionAnterior + (numero / estimacionAnterior)) / 2;

            if (Math.abs(estimacionActual - estimacionAnterior) < epsilon) {
                break; // Se alcanzó la precisión deseada
            }
        }

        return estimacionActual;
    }
}
