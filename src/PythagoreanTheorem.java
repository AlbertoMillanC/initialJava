import java.util.Scanner;

public class PythagoreanTheorem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        double sideA = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the length of the second side: ");
        double sideB = Double.parseDouble(scanner.nextLine());

        double hypotenuse = calculateHypotenuse(sideA, sideB);
        System.out.println("The length of the hypotenuse is: " + hypotenuse);
    }

    public static double calculateHypotenuse(double sideA, double sideB) {
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        return hypotenuse;
    }
}
