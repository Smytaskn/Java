import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double BMI;

        Scanner scanner=new Scanner(System.in);

        Double weight;
        System.out.print("lütfen kilonuzu kilogram cinsinden giriniz:");
        weight=scanner.nextDouble();

        Double height;
        System.out.print("lütfen boyunuzu metre cinsinden(araya virgül koyarak) giriniz:");
        height=scanner.nextDouble();

        BMI= weight / (height*height);

        System.out.println("Vücut kitle indeksiniz:"+BMI);


    }
}