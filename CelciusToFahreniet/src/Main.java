import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Celsius derecesini girin: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " Celsius derecesi, " + fahrenheit + " Fahrenheit derecesine eşdeğerdir.");

        scanner.close();
    }

    }
