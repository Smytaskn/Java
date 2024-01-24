import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       //Inch değeri metreye dönüştürür

        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzunluğu (inch cinsinden) girin: ");
        double inchLength = scanner.nextDouble();
        scanner.close();

        double meterLength = convertToMeter(inchLength);

        System.out.println(inchLength + " inch, " + meterLength + " metreye eşittir.");
    }

    // Inch cinsinden uzunluğu metreye çeviren metod
    public static double convertToMeter(double inchLength) {
        // 1 inch = 0.0254 metre
        return inchLength * 0.0254;

    }
}