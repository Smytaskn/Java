import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //girilen karakterin ASCII değerilerini bulma
        System.out.print("Bir karakter girin: ");
        Scanner scanner = new Scanner(System.in);

        char karakter = scanner.next().charAt(0);
        System.out.println("Girilen karakterin ASCII değeri: " + (int) karakter);
        scanner.close();

    }
}