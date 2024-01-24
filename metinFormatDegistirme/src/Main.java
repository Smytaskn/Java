import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //her satırı önceki satırdan aşağı ve sağa kaymış formatta yazdıran program

        System.out.println("Metni girin:");

        Scanner scanner = new Scanner(System.in);

        String metin = scanner.nextLine();


        formatliYazdir(metin);

        scanner.close();

    }

    private static void formatliYazdir(String metin) {
        String[] satirlar = metin.split("\n");

        // Her satırı önceki satırdan bir aşağıda ve sağda kalarak yazdırma
        for (String satir : satirlar) {
            System.out.println("\t" + satir);
        }

    }
}