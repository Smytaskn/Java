import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //kenar sayısına bağlı iç açı bulan program

                Scanner scanner = new Scanner(System.in);

                System.out.print("Kenar sayısını girin: ");
                int kenarSayisi = scanner.nextInt();

                int icAciToplami = hesaplaIcAciToplami(kenarSayisi);
                System.out.println("Geometrik şeklin iç açılarının toplamı: " + icAciToplami + " derece");

                scanner.close();
            }

            public static int hesaplaIcAciToplami(int kenarSayisi) {
                int icAciToplami = (kenarSayisi - 2) * 180;
                return icAciToplami;
            }
        }
