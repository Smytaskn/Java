import java   public class Main {     public static void main(String[] args) {

            System.out.print("Dizi boyutunu girin: ");
            int diziBoyutu = Integer.parseInt(System.console().readLine());


            int[] dizi = new int[diziBoyutu];

            for (int i = 0; i < diziBoyutu; i++) {
                System.out.print("Dizi elemanını girin: ");
                dizi[i] = Integer.parseInt(System.console().readLine());
            }

            System.out.print("Kaç tane sayı toplansın?: ");
            int toplamSayi = Integer.parseInt(System.console().readLine());

            int[] enKucukDizi = Arrays.copyOfRange(dizi, 0, toplamSayi);

            Arrays.sort(enKucukDizi);

            int enKucukToplam = 0;
            for (int i = 0; i < enKucukDizi.length; i++) {
                enKucukToplam += enKucukDizi[i];
            }

            // En küçük toplamı yazdırıyoruz.
            System.out.println("En küçük toplam: " + enKucukToplam);
        }
    }
