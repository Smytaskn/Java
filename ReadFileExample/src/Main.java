import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        //Dosya bulunamazsa istisna atan kod
        try {
            String dosyaYolu = "example.txt";

            // Dosyayı okumak için bir BufferedReader oluşturun
            //Bulunamazsa exception atılır
            BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Hata: Dosya bulunamadı.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Hata: Dosya okunurken bir IO hatası oluştu.");
            e.printStackTrace();
        }

    }
}