import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1
        //2 3
        //4 5 6
        // gibi girilen satır sayısına kadar yazdıran uygulama
        Scanner scanner = new Scanner(System.in);

        System.out.print("Desenin satır sayısını girin: ");
        int rows = scanner.nextInt();

        printNumberPattern(rows);

        scanner.close();
    }

    // Numara deseni oluşturan metod
    public static void printNumberPattern(int rows) {
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}