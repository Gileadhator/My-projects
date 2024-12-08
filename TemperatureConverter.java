import java.util.Scanner;

public class TemperatureConverter {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);   // this accepts input from the user

        System.out.println("Choose between the following options:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");

        int select = scanner.nextInt();      // this accepts next input from the user
        double temperatureInCelsius;
        double temperatureInFahrenheit;

        switch (select) {       //case 1 is the conversion of celsius to fahrenheit
            case 1:
            System.out.println("Enter temperature in Celsius:");
            temperatureInCelsius = scanner.nextDouble();
            double fahrenheit = (temperatureInCelsius * 9/5) + 32;
            System.out.printf("%.2f degrees celsius is equal to %.2f degrees fahrenheit ", temperatureInCelsius, fahrenheit);
                break;

            case 2:             // case 2 is the convection of fahrenheit to celsius
            System.out.println("Enter temperature in Fahrenheit:");
            temperatureInFahrenheit = scanner.nextDouble();
            double celsius = (temperatureInFahrenheit - 32) * 5/9;
            System.out.printf("%.2f degrees fahrenheit is equal to %.2f degrees celsius ", temperatureInFahrenheit, celsius); // %.2f returns two decimal places
                break;
            
            default:
            System.out.println("Invalid");
        }
        scanner.close();

       
    }
    
}