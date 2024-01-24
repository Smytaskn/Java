import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Girilen sayının ilk ve ikinci hanesi eşit mi
        //girilen sayının son iki hanesi eşit mi

        System.out.println("Sayıları girin (123456789 gibi):");

        Scanner scanner = new Scanner(System.in);

        char[] sayiKarakterleri = scanner.nextLine().toCharArray();

        if (sayiKarakterleri.length < 4) {
            System.out.println("Dizi en az dört eleman içermelidir.");
        } else {

            boolean sonuc = sayiKarakterleri[0] == sayiKarakterleri[1] &&
                    sayiKarakterleri[sayiKarakterleri.length - 1] == sayiKarakterleri[sayiKarakterleri.length - 2];

            System.out.println("Başındaki ilk iki ve sonundaki iki sayı aynı mı?: " + sonuc);
        }

        scanner.close();

    }
}