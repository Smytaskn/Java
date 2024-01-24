import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Kullanıcıdan dizi boyutunu ve k seçme sayısını alma
        //sonra sayıları list ile sıralama
        //en küçük sayıyı istediğin k kadar bulma
        //ekrana yazdırma

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int n = scanner.nextInt();
        System.out.print("Seçmek istediğiniz sayı miktarını giriniz: ");
        int k = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Dizi sayılarını giriniz: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        Collections.sort(list);

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += list.get(i);
        }

        System.out.println("En küçük toplam: " + sum);
    }
}