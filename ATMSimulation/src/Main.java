import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName;
        String password;

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        /*
        if(count<=3){
        while (count <= 3) {
            System.out.print("kullanıcı adı:");
            userName = scanner.next();

            System.out.print("şifre:");
            password = scanner.next();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("hoş geldin");
            } else {
                System.out.println("yanlış şifre tekrar dene");
                count++;
            }
        }
        else{

            }
        */
        int i = 1;
        boolean failAttempt = false;
        for (i = 1; i <= 3; i++) {
            System.out.print("kullanıcı adı:");
            userName = scanner.next();

            System.out.print("şifre:");
            password = scanner.next();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("hoş geldin");
                break;
            } else {
                System.out.println("Yanlış şifre ya kullanıcı adı tekrar dene");
                failAttempt = true;
            }
        }
        if (failAttempt && i > 3) {
            System.out.println("şifreniz ya da kullanıcı adınızı 3 kez yanlış girdiniz");
        }

        int balance = 1500;
        int select = 4;

        do {
            System.out.println("1-Para Yatırma");
            System.out.println("2-Para Çekme");
            System.out.println("3-Bakiye Sorgulama");
            System.out.println("4- Çıkış Yapma");

            System.out.println("lütfen yapmak istenen işlemin numarasını giriniz");
            select= scanner.nextInt();

            if(select==1){
                System.out.println("yatırılacak para miktarı:");
                int price=scanner.nextInt();
                balance+=price;
            }
            else if(select==2){
                System.out.println("çekilecek para miktarı:");
                int price=scanner.nextInt();
                balance-=price;
            } else if (select==3) {
                System.out.println(balance);
            }
        }while (select!=4);
        System.out.println("çıkış yapıldı");
    }
}
