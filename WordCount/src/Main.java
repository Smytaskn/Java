import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Girilen kelime sayısı bulan program

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin girin:");
        String text = scanner.nextLine();

        String[] words = text.split(" ");

        int wordCount = words.length;

        System.out.println("Girilen metnin kelime sayısı: " + wordCount);

    }
}