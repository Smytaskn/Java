import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pascal üçgeni

        Scanner scanner = new Scanner(System.in);

        System.out.print("Pascal üçgeninin satır sayısını girin: ");
        int numRows = scanner.nextInt();

        printPascalTriangle(numRows);

        scanner.close();
    }

    // Pascal üçgenini oluşturan metod
    public static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }




    }
}