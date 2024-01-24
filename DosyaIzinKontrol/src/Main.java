import java.nio.file.*;
public class Main {
    public static void main(String[] args) {

        String dosyaYolu = "C:\\example.txt";

        boolean okumaIzinleriVar = checkReadPermissions(dosyaYolu);
        System.out.println("Okuma İzinleri: " + (okumaIzinleriVar ? "Var" : "Yok"));

        boolean yazmaIzinleriVar = checkWritePermissions(dosyaYolu);
        System.out.println("Yazma İzinleri: " + (yazmaIzinleriVar ? "Var" : "Yok"));
    }
    private static boolean checkReadPermissions(String dosyaYolu) {
        try {
            Path path = Paths.get(dosyaYolu);
            return Files.isReadable(path);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    private static boolean checkWritePermissions(String dosyaYolu) {
        try {
            Path path = Paths.get(dosyaYolu);
            return Files.isWritable(path);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}