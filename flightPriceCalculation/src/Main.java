import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price, km;

        Scanner scanner = new Scanner(System.in);

        System.out.print("uçuş yapacağınız yerin km olarak uzaklığını yazın:");
        km = scanner.nextDouble();

        price = 0.1 * km;

        int age;

        System.out.print("lütfen yaşınızı yazın:");
        age = scanner.nextInt();

        int roundTrip;

        System.out.println("lütfen tek yöne bilet istiyorsanız \"1 \" gidiş dönüş bilet istiyorsanız \"2\" yazınız:");
        roundTrip = scanner.nextInt();

        if (km > 0 && age > 0 && (roundTrip==1 || roundTrip==2)) {
            System.out.println("girdiğiniz değerler doğru uygulama hesap yapıyor..");
        } else {
            System.out.println("Hatalı veri girdiniz!");
            System.out.println("girdiğiniz km değeri ve yaş pozitif , gidiş dönüş değeri ise 1 veya 2 olmalı");
    return;
        }


        double discountRate, discountPrice = 0;
        if (age < 12) {
            discountRate = 0.5;
            discountPrice = price * discountRate;
            price = price - discountPrice;
        } else if (age <= 24) {
            discountRate = 0.1;
            discountPrice = price * discountRate;
            price = price - discountPrice;
        } else if (age > 65) {
            discountRate = 0.3;
            discountPrice = price * discountRate;
            price = price - discountPrice;
        }
        if (roundTrip==2) {
            discountRate = 0.2;
            discountPrice = price * discountRate;
            price = price - discountPrice;
            System.out.println(price*2);
        }
        else {
            System.out.println(price);
        }

    }
}