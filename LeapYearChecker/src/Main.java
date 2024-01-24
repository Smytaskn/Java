import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //yıl 4 e bölünüyorsa artık
        //yıl 4 e bölünüyorsa ve 100e bölünmüyorsa artık
        //yıl 400 e bölünüyorsa artık yıl

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yılı girin: ");
        int year = scanner.nextInt();

        // Artık yıl kontrolü yap
        if (isLeapYear(year)) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
        scanner.close();
    }
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}