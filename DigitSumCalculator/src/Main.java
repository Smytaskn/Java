import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //0 ve 1000 arasında girilen bir sayının rakamlarının toplamı

        Scanner scanner = new Scanner(System.in);
        System.out.print("0 ile 1000 arasında bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0 || number > 1000) {
            System.out.println("Geçersiz giriş. Lütfen 0 ile 1000 arasında bir sayı girin.");
        } else {
            int digitSum = calculateDigitSum(number);
            System.out.println("Girilen sayının rakamları toplamı: " + digitSum);
        }
    }

    public static int calculateDigitSum(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Son basamağı al ve toplama ekle
            number /= 10; // Sayının bir basamak sağa kaydırılması
        }

        return sum;
    }
}