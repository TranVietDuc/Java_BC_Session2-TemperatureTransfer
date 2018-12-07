import java.util.Scanner;
public class TemperatureTransfer {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double fahrenheit;
     double celsius;
     int choice;

     do{
         System.out.println("Menu");
         System.out.println("1. Fahrenheit to Celsius");
         System.out.println("2. Celsius to Fahrenheit");
         System.out.println("0. Exit");
         System.out.println("Enter your choice: ");
         choice = input.nextInt();

         switch(choice){
             case 1:
                 System.out.println("Enter Fahrenheit ");
                 float celsiusInput = input.nextFloat();
                 System.out.println("Celsius: "+ celsiusToFahrenheit(celsiusInput));
                 break;
             case 2:
                 System.out.println("Enter Celsius ");
                 float FahrenheitInput = input.nextFloat();
                 System.out.println("Fahrenheit: "+ fahrenheitToCelsius(FahrenheitInput));
                 break;
             case 0:
                 System.exit(0);
         }
     }while(choice!=0);
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*celsius +32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius (double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit - 32);
        return celsius;
    }
}
