import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(String str) {
        if (str.length() < 10) {
            return true;
        } else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            if (firstChar != lastChar) {
                return false;
            } else {
                String newStr = str.substring(1, str.length() - 1);
                return isPalindrome(newStr);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrom sayı mı bakılacak sayı:");
        String text = scanner.next();

        if (isPalindrome(text)) {
            System.out.println(text + " bir palindromdur.");
        } else {
            System.out.println(text + " bir palindrom değildir.");
        }
    }
}
