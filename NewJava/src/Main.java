import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenler tanımlandı
        int mathGrade,physicsGrade,biologyGrade,chemistryGrade,turkishGrade,historyGrade,musicGrade;
        //scanner nesnesi oluşturuldu
        Scanner scanner= new Scanner(System.in);

        //notlar kullanıcıdan alındı
        System.out.print("Öğrencinin matematik notu:");
    mathGrade= scanner.nextInt();

        System.out.print("öğrencin fizik notu:");
        physicsGrade=scanner.nextInt();

        System.out.print("öğrencinin biyoloji notu:");
        biologyGrade=scanner.nextInt();

        System.out.print("öğrencinin kimya notu:");
        chemistryGrade=scanner.nextInt();

        System.out.print("öğrencinin türkçe notu:");
        turkishGrade= scanner.nextInt();

        System.out.print("öğrencinin tarih notu:");
        historyGrade=scanner.nextInt();

        System.out.print("öğrencinin müzik notu:");
        musicGrade= scanner.nextInt();

        //toplam ve ortalama değerleri tanımlandı ve değerler bulundu
        double sum=0;
        double average=0;
        sum=musicGrade+historyGrade+turkishGrade+chemistryGrade+biologyGrade+physicsGrade+mathGrade;
        average=sum/7;

        //ortalama bastırıldı
        System.out.println("ortalmanız:"+average);

        //koşul operatörleri kullanılarak geçip kalındığı hesaplandı
        String gecme = average>=60 ? "gectin":"kaldin";
        System.out.println(gecme);

    }
}