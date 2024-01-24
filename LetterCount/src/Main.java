import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Girilen metnin harf sayısı bulan program
        Scanner scanner = new Scanner(System.in);

        System.out.print("Metni girin: ");
        String metin = scanner.nextLine();

        int harfSayisi = 0;

        for (int i = 0; i < metin.length(); i++) {
            if (Character.isLetter(metin.charAt(i))) { //karakter harf mi
                harfSayisi++;
            }
        }

        System.out.println("Girilen metindeki harf sayısı: " + harfSayisi);

        scanner.close();
    }
}