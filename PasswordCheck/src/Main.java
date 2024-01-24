import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName,userPassword="127Smy";
        String enteredPassword;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Kullanıcı adınız nedir:");
        userName=scanner.nextLine();


        System.out.print("lütfen şifrenizi giriniz:");
        enteredPassword=scanner.nextLine();

        if(userPassword==enteredPassword){
            System.out.println("Hoş Geldiniz!");
        }else{
            System.out.println("Şifreniz yanlış");
            System.out.println("Şifrenizi değiştirmek ister misiniz(Evet/Hayır):");
            String yesNo= scanner.nextLine();

            switch (yesNo) {
                case "Evet":
                    System.out.println("tamam lütfen yeni şifrenizi girin:");
                    String newPassword=scanner.nextLine();

                    if(newPassword==userPassword){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    }
                    else if(!(newPassword==userPassword)){
                        System.out.println("Şifre oluşturuldu");
                    }
                    else{
                        System.out.println("geçerli olmayan şifre tekrar deneyiniz");
                    }
                    break;
                case "Hayır":
                    System.out.println("yeni şifre belirlenmedi.");
                    break;
            }

        }
    }
}


