import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideOne = 0;
        double sideTwo = 0;
        double rectArea = 0;
        double rectPerimeter = 0;
        double rectDiagonal = 0;
        boolean done1 = false;
        boolean done2 = false;

        do {
            System.out.println("Please enter the length of side one:");
            if (scan.hasNextDouble()) {
                sideOne = scan.nextDouble();
                if (sideOne > 0) {
                    done1 = true;
                } else {
                    System.out.println("You have entered an invalid side length. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("You have entered an invalid side length. Please try again.");
                scan.nextLine();
            }
        } while (!done1);
        do {
            System.out.println("Please enter the length of side two:");
            if (scan.hasNextDouble()) {
                sideTwo = scan.nextDouble();
                if (sideTwo > 0) {
                    done2 = true;
                } else {
                    System.out.println("You have entered an invalid side length. Please try again.");
                    scan.nextLine();
                }
            } else {
                System.out.println("You have entered an invalid side length. Please try again.");
                scan.nextLine();
            }
        } while (!done2);

        rectArea = sideOne * sideTwo;
        rectPerimeter = sideOne + sideTwo + sideOne + sideTwo;
        rectDiagonal = Math.sqrt(Math.pow(sideOne, 2) + Math.pow(sideTwo, 2));

        System.out.printf("%-13s%9.2f", "Side 1:", sideOne);
        System.out.printf("\n%-13s%9.2f", "Side 2:", sideTwo);
        System.out.printf("\n%-13s%9.2f", "Area:", rectArea);
        System.out.printf("\n%-13s%9.2f", "Perimeter:", rectPerimeter);
        System.out.printf("\n%-13s%9.2f", "Diagonal:", rectDiagonal);

    }
}