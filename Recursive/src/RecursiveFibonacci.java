import java.util.Scanner;

public class RecursiveFibonacci {

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n; // Temel durum: n 0 veya 1 ise n'yi döndür
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2); // Özyineleme: fib(n-1) + fib(n-2)
            }
        }

        public static void main(String[] args) {


            Scanner scanner=new Scanner(System.in);


            System.out.print("kaçıncı fibonacci sayısına kadar diziyi yazdırmak istersiniz? ");
            int number=scanner.nextInt();

            //int number = 6; // Hesaplanacak Fibonacci sayısı

            for (int i = 0; i <= number; i++) {
                System.out.print(fibonacci(i) + " ");
            }

        }
    }




