import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gallonsOfGas = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double remainingDistance;
        double costOfHundredMiles;
        boolean done1 = false;
        boolean done2 = false;
        boolean done3 = false;

        do {
            System.out.println("Enter the number of gallons of gasoline you currently have in the vehicle: ");

            if (scan.hasNextDouble()) {
                gallonsOfGas = scan.nextDouble();
                done1 = true;
                scan.nextLine();
            } else {
                System.out.println("You have entered an invalid value for gas. Please try again.");
                scan.nextLine();
            }
        } while (!done1);

        do {
            System.out.println("Enter your fuel efficiency (MPG): ");

            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                done2 = true;
                scan.nextLine();
            } else {
                System.out.println("You have entered an invalid fuel efficiency. Please try again.");
                scan.nextLine();
            }
        } while (!done2);

        do {
            System.out.println("Enter the current price of a gallon of gas: ");

            if (scan.hasNextDouble()) {
                pricePerGallon = scan.nextDouble();
                done3 = true;
                scan.nextLine();
            } else {
                System.out.println("You have entered an invalid price of a gallon of gas. Please try again.");
                scan.nextLine();
            }
        } while (!done3);

        remainingDistance = gallonsOfGas * fuelEfficiency;
        costOfHundredMiles = (100 / fuelEfficiency) * pricePerGallon;
        System.out.printf("%-13s%12.2f", "Cost per 100 miles in $:", costOfHundredMiles);
        System.out.printf("\n%-13s%13.2f", "Distance Left in Miles:", remainingDistance);
    }
}
