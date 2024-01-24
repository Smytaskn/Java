import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //mxn matrisi oluşturup
        //matris bütüklüğü konsoldan alınıp
        //aranacak değer alınıp
        //aranacak değerin matrisin içinde bulunup bulunmadığını
        //bakılması

        Scanner scanner = new Scanner(System.in);

        System.out.print("Matris satır sayısı (m): ");
        int m = scanner.nextInt();

        System.out.print("Matris sütun sayısı (n): ");
        int n = scanner.nextInt();

        int[][] matris = new int[m][n];
        System.out.println("Matris elemanlarını girin:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matris[" + i + "][" + j + "]: ");
                matris[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Aranacak değeri girin: ");
        int aranan = scanner.nextInt();

        boolean bulundu = matrisAra(matris, aranan);

        if (bulundu) {
            System.out.println(aranan + " değeri matris içinde bulundu.");
        } else {
            System.out.println(aranan + " değeri matris içinde bulunamadı.");
        }

        scanner.close();
    }

    private static boolean matrisAra(int[][] matris, int aranan) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[0].length; j++) {
                if (matris[i][j] == aranan) {
                    return true;
                }
            }
        }
        return false;



    }
}