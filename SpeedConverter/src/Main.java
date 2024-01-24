import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi metre olarak giriniz: ");
        int mesafe = scanner.nextInt();

        // Kullanıcıdan zamanı (saat, dakika, saniye) olarak al
        System.out.print("Saati giriniz: ");
        int saat = scanner.nextInt();
        System.out.print("Dakikaları giriniz: ");
        int dakika = scanner.nextInt();
        System.out.print("Saniyeleri giriniz: ");
        int saniye = scanner.nextInt();

        // Toplam zamanı hesapla
        int toplamSaniye = 3600 * saat + 60 * dakika + saniye;

        // Hızları hesapla
        double metreSaniye = (double) mesafe / toplamSaniye;
        double kilometreSaat = metreSaniye * 3.6;
        double milSaat = metreSaniye * 1.609344;

        // Hızları göster
        System.out.println("Mesafe: " + mesafe + " metre");
        System.out.println("Toplam Zaman: " + toplamSaniye + " saniye");
        System.out.println("Hız (metre/saniye): " + metreSaniye);
        System.out.println("Hız (kilometre/saat): " + kilometreSaat);
        System.out.println("Hız (mil/saat): " + milSaat);
    }
}