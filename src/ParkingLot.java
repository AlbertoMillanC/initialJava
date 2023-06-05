import java.util.Scanner;

public class ParkingLot {
    public static void main(String[] args) {
        int carCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter 'enter' to add a car, 'exit' to remove a car, or 'quit' to exit: ");
            String input = scanner.nextLine();

            if (input.equals("enter")) {
                carCount++;
                System.out.println("Car entered. Total cars: " + carCount);
            } else if (input.equals("exit")) {
                if (carCount > 0) {
                    carCount--;
                    System.out.println("Car exited. Total cars: " + carCount);
                } else {
                    System.out.println("No cars in the parking lot.");
                }
            } else if (input.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }

        System.out.println("Exiting the program.");
    }
}
