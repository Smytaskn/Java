import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Sayı Giriniz: ");
                int num = scanner.nextInt();

                if (isPrime(num)) {
                    System.out.println(num + " sayısı ASALDIR!");
                } else {
                    System.out.println(num + " sayısı ASAL değildir!");
                }

                scanner.close();
            }

            // Recursive olarak asal sayı kontrolü
            public static boolean isPrime(int n) {
                if (n <= 1) {
                    return false;
                }
                return isPrimeUtil(n, 2);
            }

            public static boolean isPrimeUtil(int n, int i) {
                if (i == n) {
                    return true;
                }
                if (n % i == 0) {
                    return false;
                }
                return isPrimeUtil(n, i + 1);
            }
        }


