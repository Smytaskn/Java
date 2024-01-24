import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();
        int[] dizi = new int[elemanSayisi];
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print("Dizi elemanını girin: ");
            dizi[i] = scanner.nextInt();
        }

        Arrays.sort(dizi);

        double medyan;
        if (elemanSayisi % 2 == 0) {

            int ortanca1 = dizi[elemanSayisi / 2 - 1];
            int ortanca2 = dizi[elemanSayisi / 2];
            medyan = (ortanca1 + ortanca2) / 2.0;
        } else {
            medyan = dizi[elemanSayisi / 2];
        }
        System.out.println("Medyan: " + medyan);
        scanner.close();

    }
}