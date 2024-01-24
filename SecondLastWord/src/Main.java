import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Son kelimeden önceki kelimeyi bulan program

        Scanner in = new Scanner(System.in);
        System.out.print("Metin giriniz: ");

        String line = in.nextLine();

        String[] words = line.split("\\s+");

        System.out.println("Sondan önceki kelime: " + words[words.length - 2]);
    }
}