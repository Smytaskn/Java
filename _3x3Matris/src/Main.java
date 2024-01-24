import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // 3x3 matrisi oluştur ve rastgele değerlerle doldur
        int[][] matris = new int[3][3];
        Random random = new Random();

        System.out.println("Oluşturulan Matris:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matris[i][j] = random.nextInt(10); // Rastgele 0 ile 9 arasında değerler
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // En küçük toplam yolu hesapla
        int enKucukToplam = hesaplaEnKucukToplam(matris);

        // Sonucu ekrana yazdır
        System.out.println("\nEn Küçük Toplam Yol: " + enKucukToplam);
    }

    private static int hesaplaEnKucukToplam(int[][] matris) {
        // İlk sütunu olduğu gibi bırak, diğer sütunları en küçük toplam yolu hesapla
        for (int j = 1; j < 3; j++) {
            matris[0][j] += matris[0][j - 1];
        }

        // İlk satırı olduğu gibi bırak, diğer satırları en küçük toplam yolu hesapla
        for (int i = 1; i < 3; i++) {
            matris[i][0] += matris[i - 1][0];
            for (int j = 1; j < 3; j++) {
                matris[i][j] += Math.min(matris[i - 1][j], matris[i][j - 1]);
            }
        }

        // Sol üstten sağ alta giden en küçük toplam yolu değeri
        return matris[2][2];
    }
}