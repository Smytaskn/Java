
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* kullanıcıdan alınan para değerinin KDV li fiyatını
        ve KDV tutarını hesaplahyan program ,
        KDV %20 */

        //Alacağınız ürünün fiyatı
      /*
        double ProductPrice;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Alınan ürün fiyatı:");
        ProductPrice=scanner.nextInt();
        double OldPrice=ProductPrice;

        double kdvOrani=0.2;
        double KdvTutari;
        KdvTutari=ProductPrice*kdvOrani;

        ProductPrice= KdvTutari+ProductPrice;

        System.out.println("Ürünün KDV eklenmemiş tutarı:"+OldPrice);
        System.out.println("KDV Eklenmiş Tutar:"+ProductPrice);
        System.out.println("Eklenen KDV tutari"+KdvTutari);
            */
                /* Eğer girilen tutar 0 ve 1000 tl aralığında ise KDV oranı
        %20 1000TLden fazla ise %8 KDV olarak hesaplayan programı yazınız */

        Scanner scanner= new Scanner(System.in);

        double urunFiyati;

        System.out.print("Alinan ürün fiyati:");
        urunFiyati=scanner.nextDouble();

        double KDVyuzde= urunFiyati>0 && urunFiyati<=1000? 0.2 : 0.08;

        Double kdvFiyat;
        kdvFiyat=KDVyuzde*urunFiyati;
        urunFiyati=urunFiyati+kdvFiyat;

        System.out.println("Ürünün Kdvli fiyatı:"+urunFiyati);








            }
}