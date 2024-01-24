import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Dikdörtgen alan
        
                Scanner scanner = new Scanner(System.in);

                System.out.print("Dikdörtgenin kısa kenarını girin: ");
                double kisaKenar = scanner.nextDouble();

                System.out.print("Dikdörtgenin uzun kenarını girin: ");
                double uzunKenar = scanner.nextDouble();

                double alan = kisaKenar * uzunKenar;

                System.out.println("Dikdörtgenin alanı: " + alan);

                scanner.close();
            }
        }
