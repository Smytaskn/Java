import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //karne uygulaması kaç ders
        //dersin adı
        //dersin notu
        //derslerin ortalaması(yani karne notu)

                Scanner scanner = new Scanner(System.in);

                System.out.print("Kaç dersiniz var? ");
                int dersSayisi = scanner.nextInt();

                // Ders adlarını ve notlarını tutmak için array'ler
                String[] dersler = new String[dersSayisi];
                int[] notlar = new int[dersSayisi];

                // Kullanıcıdan ders adlarını ve notlarını almak
                for (int i = 0; i < dersSayisi; i++) {
                    scanner.nextLine(); // Buffer temizleme

                    System.out.print("Ders adı " + (i + 1) + ": ");
                    dersler[i] = scanner.nextLine();

                    System.out.print("Notu " + (i + 1) + ": ");
                    notlar[i] = scanner.nextInt();
                }

                // Notların ortalamasını hesaplama
                int toplam = 0;
                for (int not : notlar) {
                    toplam += not;
                }
                double ortalama = (double) toplam / dersSayisi;

                // Sonucu ekrana yazdırma
                System.out.println("\nDersler ve Notlar:");
                for (int i = 0; i < dersSayisi; i++) {
                    System.out.println(dersler[i] + ": " + notlar[i]);
                }
                System.out.println("\nOrtalama: " + ortalama);

                scanner.close();
            }
        }
