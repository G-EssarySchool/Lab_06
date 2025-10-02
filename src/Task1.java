import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        boolean done = false;

        do {
            System.out.println("Enter a temperature that will be converted from Celsius to Fahrenheit:");

            if(scan.hasNextDouble()){
                tempC = scan.nextDouble();
                done = true;
            }
            else{
                System.out.println("You must enter a valid temperature, please try again");
                scan.nextLine();
            }
        } while (!done);
        
        tempF = (tempC * 9/5) + 32;
        System.out.printf("%-13s%7.2f", "Degrees C:", tempC);
        System.out.printf("\n%-13s%7.2f", "Degrees F:", tempF);
    }
}